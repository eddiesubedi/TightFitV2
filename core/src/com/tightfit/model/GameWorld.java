package com.tightfit.model;


import box2dLight.PointLight;
import box2dLight.RayHandler;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.utils.*;
import com.tightfit.model.Entities.*;
import com.tightfit.util.Assets;
import com.tightfit.util.Constants;
import net.dermetfan.gdx.graphics.g2d.Box2DSprite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static com.tightfit.util.Constants.h;
import static com.tightfit.util.Constants.w;

public class GameWorld extends InputAdapter{
    private World world;
    private boolean leftKeyPressed;
    private boolean rightKeyPressed;
    private float leftKeyCounter, rightKeyCounter;
    private ArrayList<GameObject>gameObjects = new ArrayList<GameObject>();
    private boolean reset;
    private Timer.Task timer;
    private final float speed =(Constants.h/2)/3f; // s=d/t
    private int points, gems;
    private Array<TextureRegion> regions;
    private RayHandler rayHandler;
    private PointLight playerLight;
    private float ambientAmount;
    private float nextAmbientAmount;
    private boolean decreaseLight;
    private boolean increasePlayerLight;
    private float currentPlayerLight;
    private ArrayList<Color> playerColorLights = new ArrayList<Color>();
    private int numOfEnemyBorn;
    private int hardModeNum;
    private int spawnDelay = 2;
    private Stat stat;
    private FileHandle file = Gdx.files.local("stat.json");
    private ArrayList<Sprite> decorations = new ArrayList<Sprite>();
    public GameWorld(){
        init();
    }
    private void init(){
        world = new World(new Vector2(0, 0), true);
        rayHandler = new RayHandler(world);
        currentPlayerLight = 5;
        playerLight = new PointLight(rayHandler, 700, new Color(1,1,1,1), currentPlayerLight, 0, 0);
        Random random = new Random();
        hardModeNum = random.nextInt(6)+3;
        System.out.println(hardModeNum);
        saveGame();
        loadGame();
        intiEnemySprites();
        initObjects();
        initColors();
        collision();
        initDecorations();
    }

    private void initDecorations() {

    }

    private void saveGame() {
        Stat stat = new Stat();
        stat.setHighScore(points);
        stat.setGems(gems);
        Json json = new Json();
        json.setOutputType(JsonWriter.OutputType.json);
        file.writeString(Base64Coder.encodeString(json.toJson(stat)), false);
    }

    private void loadGame() {
        Json json = new Json();
        stat = json.fromJson(Stat.class, Base64Coder.decodeString(file.readString()));
        System.out.println(stat);
    }

    private void initColors() {
        FileHandle file = Gdx.files.internal("color.txt");
        String text = file.readString();
        String lines[] = text.split("\\r?\\n");
        for(int i = 0;i<lines.length;i++){
            String colorStr=lines[i];
            playerColorLights.add(new Color(Integer.valueOf( colorStr.substring( 1, 3 ), 16 ) / 255f, Integer.valueOf( colorStr.substring( 3, 5 ), 16 ) / 255f, Integer.valueOf( colorStr.substring( 5, 7 ), 16 ) / 255f,1));
        }
    }

    public void initObjects() {
        ambientAmount = 1;
        nextAmbientAmount = 1;
        rayHandler.setAmbientLight(ambientAmount);
        PlayerCircle playerCircle = new PlayerCircle(w/2,h/4.9230766f, h/42,new Sprite(Assets.instance.player.region));
        playerCircle.addToWorld(world);
        gameObjects.add(playerCircle);
        playerLight.setDistance(getPlayer().getSize()*5);
        playerLight.attachToBody(getPlayerBody());
        timer = new Timer().scheduleTask(new Timer.Task() {
            @Override
            public void run() {
                createEnemy();
                gameObjects.get(gameObjects.size() - 1).getBody().setLinearVelocity(0, -speed);
                gameObjects.get(gameObjects.size() - 2).getBody().setLinearVelocity(0, -speed);
                gameObjects.get(gameObjects.size() - 3).getBody().setLinearVelocity(0, -speed);
                createGem();
                gameObjects.get(gameObjects.size() - 1).getBody().setLinearVelocity(0, -speed);
                gameObjects.get(gameObjects.size() -1).getBody().setAngularVelocity(speed/2);
                numOfEnemyBorn++;
            }

        },0,spawnDelay);
    }
    private void createGem(){
        float size = h/42;
        float yMax = (h + (speed*2))-(Constants.h * .025f)*4;
        float yMin = h+(Constants.h * .025f)*4;
        float y = (float) (Math.random() * (yMax - yMin) + yMin);
        float xMin = size*4;
        float xMax = w-size*4;
        float x = (float) (Math.random() * (xMax - xMin) + xMin);

        Boost boost = new Boost(x,y,1.5f);
        boost.addToWorld(world);
        gameObjects.add(boost);
//        Gem gem = new Gem(x,y,size,new Sprite(regions.random()));
//        Collections.shuffle(playerColorLights);
//        gem.addToWorld(world);
//        gem.addLight(rayHandler, playerColorLights.get(0));
//        gameObjects.add(gem);
    }
    private void createEnemy() {
        float gap;
        if(numOfEnemyBorn>hardModeNum){
            gap = getPlayer().getSize()*1.1f;
        }else{
            gap = getPlayer().getSize()*1.2f;
        }
        float height = Constants.h * .025f;
        float y = h;
        float leftMaxHeight = w/2-gap;
        float leftWidth = (float) (Math.random() * (leftMaxHeight - gap) + gap);
        Sprite sprite = new Sprite(regions.random());
        Enemy leftEnemy = new Enemy(leftWidth,y,leftWidth,height,sprite);
        leftEnemy.addToWorld(world);
        gameObjects.add(leftEnemy);


        float rightWidth = w/2-leftWidth-gap;
        float rightX = w-rightWidth;
        Enemy rightEnemy = new Enemy(rightX,y,rightWidth,height,sprite);
        rightEnemy.addToWorld(world);
        gameObjects.add(rightEnemy);

        float middleWidth =gap/2;
        float middleX = leftWidth*2+gap;
        Bbox middle = new Bbox(middleX, y,middleWidth,height);
        middle.addToWorld(world);
        gameObjects.add(middle);
    }

    public void update(float deltaTime){
        if(!reset){
            //moving player
            float force = calculateForce(getPlayerBody().getMass(),6, Constants.w);
            float fineTuneForce = calculateForce(getPlayerBody().getMass(),1.1f, Constants.w);
            if(leftKeyPressed){
                if(leftKeyCounter<=2){
                    getPlayerBody().applyForceToCenter(-fineTuneForce,0,true);
                }else{
                    getPlayerBody().applyForceToCenter(-force * 1.5f, 0, true);
                }
                leftKeyCounter++;

            }else if(rightKeyPressed){
                if(rightKeyCounter<=2){
                    getPlayerBody().applyForceToCenter(fineTuneForce,0,true);
                }else{
                    getPlayerBody().applyForceToCenter(force * 1.5f, 0, true);
                }

                rightKeyCounter++;
            }
            if(getPlayerBody().getPosition().x>w-getPlayer().getSize()){
                reset();
            }else if(getPlayerBody().getPosition().x<getPlayer().getSize()){
                reset();
            }
            //calculate points + change Lights
            for(int i = 0;i<gameObjects.size();i++){
                if(gameObjects.get(i) instanceof Bbox){
                    if(gameObjects.get(i).getBody().getPosition().y<getPlayerBody().getPosition().y){
                        gameObjects.get(i).setDeleteBody(true);
                        points++;
                        System.out.println("Points :"+points);
                        if (ambientAmount>0 && points % 5 == 0) {
                            decreaseLight = true;
                            nextAmbientAmount = nextAmbientAmount - .1f;
                        }
                        if(points>45){
                            increasePlayerLight = true;
                        }
                        Collections.shuffle(playerColorLights);
                        playerLight.setColor(playerColorLights.get(0));
                    }
                }
            }

            //delete out of bounds body
            for(int i = 0;i<gameObjects.size();i++){
                if(gameObjects.get(i) instanceof Enemy){
                    if(gameObjects.get(i).getBody().getPosition().y < -((Enemy) gameObjects.get(i)).getHeight()){
                        gameObjects.get(i).setDeleteBody(true);
                    }
                }
                if(gameObjects.get(i) instanceof  Gem){
                    if(gameObjects.get(i).getBody().getPosition().y < -((Gem) gameObjects.get(i)).getSize()){
                        gameObjects.get(i).setDeleteBody(true);
                        ((Gem) gameObjects.get(i)).getPointLight().remove();
                    }
                }
            }
            if(decreaseLight){
                if(ambientAmount>=nextAmbientAmount){
                    ambientAmount = ambientAmount - .001f;
                    rayHandler.setAmbientLight(ambientAmount);
                }
            }
            if(increasePlayerLight){
                if(currentPlayerLight<=15){
                    currentPlayerLight = currentPlayerLight + .1f;
                    playerLight.setDistance(currentPlayerLight);
                }
            }
        }
    }
    private float calculateForce(float mass, float speed, float distance){
        return (distance*mass)*speed;
    }
    public World getWorld() {
        return world;
    }
    public Body getPlayerBody(){
        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof Player) {
                return gameObject.getBody();
            }
        }
        return null;
    }
    public Player getPlayer(){
        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof Player) {
                return (Player) gameObject;
            }
        }
        return null;
    }
    @Override
    public boolean keyUp(int keycode) {
        if(!reset){
            if (keycode == Input.Keys.A) {
                leftKeyPressed = false;
                leftKeyCounter = 0;
            }else if(keycode == Input.Keys.D){
                rightKeyPressed = false;
                rightKeyCounter = 0;
            }
            getPlayerBody().setLinearVelocity(0, 0);
        }
        return true;
    }

    @Override
    public boolean keyDown(int keycode) {
        if(!reset){
            if (keycode == Input.Keys.A) {
                leftKeyPressed = true;
            }else if(keycode == Input.Keys.D){
                rightKeyPressed = true;
            }
        }
        return true;
    }
    private void reset(){
        reset = true;
        saveGame();
        points = 0;
        numOfEnemyBorn = 0;
        Random random = new Random();
        hardModeNum = random.nextInt(6)+3;
    }
    private void collision(){
        world.setContactListener(new ContactListener() {

            @Override
            public void preSolve(Contact contact, Manifold oldManifold) {

            }

            @Override
            public void postSolve(Contact contact, ContactImpulse impulse) {

            }

            @Override
            public void endContact(Contact contact) {

            }

            @Override
            public void beginContact(Contact contact) {
                Fixture fixtureA = contact.getFixtureA();

                if(fixtureA.getUserData() instanceof Gem){
                    Gem gem = (Gem) fixtureA.getUserData();
                    gem.getPointLight().remove();
                    gem.setDeleteBody(true);
                    gems++;
                    System.out.println("Gems: "+gems);
                }else if(fixtureA.getBody().getUserData() instanceof Boost){
                    Boost boost = (Boost) fixtureA.getBody().getUserData();
                    boost.setDeleteBody(true);
                }else{
                    if(!reset){
                        reset();
                    }
                }
            }
        });
    }

    public RayHandler getRayHandler() {
        return rayHandler;
    }

    public boolean isReset() {
        return reset;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public Timer.Task getTimer() {
        return timer;
    }

    public void setTimer(Timer.Task timer) {
        this.timer = timer;
    }

    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }

    public void setGameObjects(ArrayList<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void setLeftKeyPressed(boolean leftKeyPressed) {
        this.leftKeyPressed = leftKeyPressed;
    }

    public void setRightKeyPressed(boolean rightKeyPressed) {
        this.rightKeyPressed = rightKeyPressed;
    }

    public void setLeftKeyCounter(float leftKeyCounter) {
        this.leftKeyCounter = leftKeyCounter;
    }

    public void setRightKeyCounter(float rightKeyCounter) {
        this.rightKeyCounter = rightKeyCounter;
    }
    private void intiEnemySprites() {
        regions = new Array<TextureRegion>();
        regions.add(Assets.instance.assetEnemy0.region);
        regions.add(Assets.instance.assetEnemy1.region);
        regions.add(Assets.instance.assetEnemy2.region);
        regions.add(Assets.instance.assetEnemy3.region);
        regions.add(Assets.instance.assetEnemy4.region);
        regions.add(Assets.instance.assetEnemy5.region);
        regions.add(Assets.instance.assetEnemy6.region);
        regions.add(Assets.instance.assetEnemy7.region);
        regions.add(Assets.instance.assetEnemy8.region);
        regions.add(Assets.instance.assetEnemy9.region);
        regions.add(Assets.instance.assetEnemy10.region);
        regions.add(Assets.instance.assetEnemy11.region);
        regions.add(Assets.instance.assetEnemy12.region);
        regions.add(Assets.instance.assetEnemy13.region);
        regions.add(Assets.instance.assetEnemy14.region);
        regions.add(Assets.instance.assetEnemy15.region);
        regions.add(Assets.instance.assetEnemy16.region);
        regions.add(Assets.instance.assetEnemy17.region);
        regions.add(Assets.instance.assetEnemy18.region);
        regions.add(Assets.instance.assetEnemy19.region);
        regions.add(Assets.instance.assetEnemy20.region);
        regions.add(Assets.instance.assetEnemy21.region);
        regions.add(Assets.instance.assetEnemy22.region);
        regions.add(Assets.instance.assetEnemy23.region);
        regions.add(Assets.instance.assetEnemy24.region);
        regions.add(Assets.instance.assetEnemy25.region);
        regions.add(Assets.instance.assetEnemy26.region);
        regions.add(Assets.instance.assetEnemy27.region);
        regions.add(Assets.instance.assetEnemy28.region);
        regions.add(Assets.instance.assetEnemy29.region);
        regions.add(Assets.instance.assetEnemy30.region);
        regions.add(Assets.instance.assetEnemy31.region);
        regions.add(Assets.instance.assetEnemy32.region);
        regions.add(Assets.instance.assetEnemy33.region);
        regions.add(Assets.instance.assetEnemy34.region);
        regions.add(Assets.instance.assetEnemy35.region);
        regions.add(Assets.instance.assetEnemy36.region);
        regions.add(Assets.instance.assetEnemy37.region);
        regions.add(Assets.instance.assetEnemy38.region);
        regions.add(Assets.instance.assetEnemy39.region);
        regions.add(Assets.instance.assetEnemy40.region);
        regions.add(Assets.instance.assetEnemy41.region);
        regions.add(Assets.instance.assetEnemy42.region);
        regions.add(Assets.instance.assetEnemy43.region);
        regions.add(Assets.instance.assetEnemy44.region);
        regions.add(Assets.instance.assetEnemy45.region);
        regions.add(Assets.instance.assetEnemy46.region);
        regions.add(Assets.instance.assetEnemy47.region);
        regions.add(Assets.instance.assetEnemy48.region);
        regions.add(Assets.instance.assetEnemy49.region);
        regions.add(Assets.instance.assetEnemy50.region);
        regions.add(Assets.instance.assetEnemy51.region);
        regions.add(Assets.instance.assetEnemy52.region);
        regions.add(Assets.instance.assetEnemy53.region);
        regions.add(Assets.instance.assetEnemy54.region);
        regions.add(Assets.instance.assetEnemy55.region);
        regions.add(Assets.instance.assetEnemy56.region);
        regions.add(Assets.instance.assetEnemy57.region);
        regions.add(Assets.instance.assetEnemy58.region);
        regions.add(Assets.instance.assetEnemy59.region);
        regions.add(Assets.instance.assetEnemy60.region);
        regions.add(Assets.instance.assetEnemy61.region);
        regions.add(Assets.instance.assetEnemy62.region);
        regions.add(Assets.instance.assetEnemy63.region);
        regions.add(Assets.instance.assetEnemy64.region);
        regions.add(Assets.instance.assetEnemy65.region);
        regions.add(Assets.instance.assetEnemy66.region);
        regions.add(Assets.instance.assetEnemy67.region);
        regions.add(Assets.instance.assetEnemy68.region);
        regions.add(Assets.instance.assetEnemy69.region);
        regions.add(Assets.instance.assetEnemy70.region);
        regions.add(Assets.instance.assetEnemy71.region);
        regions.add(Assets.instance.assetEnemy72.region);
        regions.add(Assets.instance.assetEnemy73.region);
        regions.add(Assets.instance.assetEnemy74.region);
        regions.add(Assets.instance.assetEnemy75.region);
        regions.add(Assets.instance.assetEnemy76.region);
        regions.add(Assets.instance.assetEnemy77.region);
        regions.add(Assets.instance.assetEnemy78.region);
        regions.add(Assets.instance.assetEnemy79.region);
        regions.add(Assets.instance.assetEnemy80.region);
        regions.add(Assets.instance.assetEnemy81.region);
        regions.add(Assets.instance.assetEnemy82.region);
        regions.add(Assets.instance.assetEnemy83.region);
        regions.add(Assets.instance.assetEnemy84.region);
        regions.add(Assets.instance.assetEnemy85.region);
        regions.add(Assets.instance.assetEnemy86.region);
        regions.add(Assets.instance.assetEnemy87.region);
        regions.add(Assets.instance.assetEnemy88.region);
        regions.add(Assets.instance.assetEnemy89.region);
        regions.add(Assets.instance.assetEnemy90.region);
        regions.add(Assets.instance.assetEnemy91.region);
        regions.add(Assets.instance.assetEnemy92.region);
        regions.add(Assets.instance.assetEnemy93.region);
        regions.add(Assets.instance.assetEnemy94.region);
        regions.add(Assets.instance.assetEnemy95.region);
        regions.add(Assets.instance.assetEnemy96.region);
        regions.add(Assets.instance.assetEnemy97.region);
        regions.add(Assets.instance.assetEnemy98.region);
        regions.add(Assets.instance.assetEnemy99.region);
        regions.add(Assets.instance.assetEnemy100.region);
        regions.add(Assets.instance.assetEnemy101.region);
        regions.add(Assets.instance.assetEnemy102.region);
        regions.add(Assets.instance.assetEnemy103.region);
        regions.add(Assets.instance.assetEnemy104.region);
        regions.add(Assets.instance.assetEnemy105.region);
        regions.add(Assets.instance.assetEnemy106.region);
        regions.add(Assets.instance.assetEnemy107.region);
        regions.add(Assets.instance.assetEnemy108.region);
        regions.add(Assets.instance.assetEnemy109.region);
        regions.add(Assets.instance.assetEnemy110.region);
        regions.add(Assets.instance.assetEnemy111.region);
        regions.add(Assets.instance.assetEnemy112.region);
        regions.add(Assets.instance.assetEnemy113.region);
        regions.add(Assets.instance.assetEnemy114.region);
        regions.add(Assets.instance.assetEnemy115.region);
        regions.add(Assets.instance.assetEnemy116.region);
        regions.add(Assets.instance.assetEnemy117.region);
        regions.add(Assets.instance.assetEnemy118.region);
        regions.add(Assets.instance.assetEnemy119.region);
        regions.add(Assets.instance.assetEnemy120.region);
        regions.add(Assets.instance.assetEnemy121.region);
        regions.add(Assets.instance.assetEnemy122.region);
        regions.add(Assets.instance.assetEnemy123.region);
        regions.add(Assets.instance.assetEnemy124.region);
        regions.add(Assets.instance.assetEnemy125.region);
        regions.add(Assets.instance.assetEnemy126.region);
        regions.add(Assets.instance.assetEnemy127.region);
        regions.add(Assets.instance.assetEnemy128.region);
        regions.add(Assets.instance.assetEnemy129.region);
        regions.add(Assets.instance.assetEnemy130.region);
        regions.add(Assets.instance.assetEnemy131.region);
        regions.add(Assets.instance.assetEnemy132.region);
        regions.add(Assets.instance.assetEnemy133.region);
        regions.add(Assets.instance.assetEnemy134.region);
        regions.add(Assets.instance.assetEnemy135.region);
        regions.add(Assets.instance.assetEnemy136.region);
        regions.add(Assets.instance.assetEnemy137.region);
        regions.add(Assets.instance.assetEnemy138.region);
        regions.add(Assets.instance.assetEnemy139.region);
        regions.add(Assets.instance.assetEnemy140.region);
        regions.add(Assets.instance.assetEnemy141.region);
        regions.add(Assets.instance.assetEnemy142.region);
        regions.add(Assets.instance.assetEnemy143.region);
        regions.add(Assets.instance.assetEnemy144.region);
        regions.add(Assets.instance.assetEnemy145.region);
        regions.add(Assets.instance.assetEnemy146.region);
        regions.add(Assets.instance.assetEnemy147.region);
        regions.add(Assets.instance.assetEnemy148.region);
        regions.add(Assets.instance.assetEnemy149.region);
        regions.add(Assets.instance.assetEnemy150.region);
        regions.add(Assets.instance.assetEnemy151.region);
        regions.add(Assets.instance.assetEnemy152.region);
        regions.add(Assets.instance.assetEnemy153.region);
        regions.add(Assets.instance.assetEnemy154.region);
        regions.add(Assets.instance.assetEnemy155.region);
        regions.add(Assets.instance.assetEnemy156.region);
        regions.add(Assets.instance.assetEnemy157.region);
        regions.add(Assets.instance.assetEnemy158.region);
        regions.add(Assets.instance.assetEnemy159.region);
        regions.add(Assets.instance.assetEnemy160.region);
        regions.add(Assets.instance.assetEnemy161.region);
        regions.add(Assets.instance.assetEnemy162.region);
        regions.add(Assets.instance.assetEnemy163.region);
        regions.add(Assets.instance.assetEnemy164.region);
        regions.add(Assets.instance.assetEnemy165.region);
        regions.add(Assets.instance.assetEnemy166.region);
        regions.add(Assets.instance.assetEnemy167.region);
        regions.add(Assets.instance.assetEnemy168.region);
        regions.add(Assets.instance.assetEnemy169.region);
        regions.add(Assets.instance.assetEnemy170.region);
        regions.add(Assets.instance.assetEnemy171.region);
        regions.add(Assets.instance.assetEnemy172.region);
        regions.add(Assets.instance.assetEnemy173.region);
        regions.add(Assets.instance.assetEnemy174.region);
        regions.add(Assets.instance.assetEnemy175.region);
        regions.add(Assets.instance.assetEnemy176.region);
        regions.add(Assets.instance.assetEnemy177.region);
        regions.add(Assets.instance.assetEnemy178.region);
        regions.add(Assets.instance.assetEnemy179.region);
        regions.add(Assets.instance.assetEnemy180.region);
        regions.add(Assets.instance.assetEnemy181.region);
        regions.add(Assets.instance.assetEnemy182.region);
        regions.add(Assets.instance.assetEnemy183.region);
        regions.add(Assets.instance.assetEnemy184.region);
        regions.add(Assets.instance.assetEnemy185.region);
        regions.add(Assets.instance.assetEnemy186.region);
        regions.add(Assets.instance.assetEnemy187.region);
        regions.add(Assets.instance.assetEnemy188.region);
        regions.add(Assets.instance.assetEnemy189.region);
        regions.add(Assets.instance.assetEnemy190.region);
        regions.add(Assets.instance.assetEnemy191.region);
        regions.add(Assets.instance.assetEnemy192.region);
        regions.add(Assets.instance.assetEnemy193.region);
        regions.add(Assets.instance.assetEnemy194.region);
        regions.add(Assets.instance.assetEnemy195.region);
        regions.add(Assets.instance.assetEnemy196.region);
        regions.add(Assets.instance.assetEnemy197.region);
        regions.add(Assets.instance.assetEnemy198.region);
        regions.add(Assets.instance.assetEnemy199.region);
        regions.add(Assets.instance.assetEnemy200.region);
        regions.add(Assets.instance.assetEnemy201.region);
        regions.add(Assets.instance.assetEnemy202.region);
        regions.add(Assets.instance.assetEnemy203.region);
        regions.add(Assets.instance.assetEnemy204.region);
        regions.add(Assets.instance.assetEnemy205.region);
        regions.add(Assets.instance.assetEnemy206.region);
        regions.add(Assets.instance.assetEnemy207.region);
        regions.add(Assets.instance.assetEnemy208.region);
        regions.add(Assets.instance.assetEnemy209.region);
        regions.add(Assets.instance.assetEnemy210.region);
        regions.add(Assets.instance.assetEnemy211.region);
        regions.add(Assets.instance.assetEnemy212.region);
        regions.add(Assets.instance.assetEnemy213.region);
        regions.add(Assets.instance.assetEnemy214.region);
        regions.add(Assets.instance.assetEnemy215.region);
        regions.add(Assets.instance.assetEnemy216.region);
        regions.add(Assets.instance.assetEnemy217.region);
        regions.add(Assets.instance.assetEnemy218.region);
        regions.add(Assets.instance.assetEnemy219.region);
        regions.add(Assets.instance.assetEnemy220.region);
        regions.add(Assets.instance.assetEnemy221.region);
        regions.add(Assets.instance.assetEnemy222.region);
        regions.add(Assets.instance.assetEnemy223.region);
        regions.add(Assets.instance.assetEnemy224.region);
        regions.add(Assets.instance.assetEnemy225.region);
        regions.add(Assets.instance.assetEnemy226.region);
        regions.add(Assets.instance.assetEnemy227.region);
        regions.add(Assets.instance.assetEnemy228.region);
        regions.add(Assets.instance.assetEnemy229.region);
        regions.add(Assets.instance.assetEnemy230.region);
        regions.add(Assets.instance.assetEnemy231.region);
        regions.add(Assets.instance.assetEnemy232.region);
        regions.add(Assets.instance.assetEnemy233.region);
        regions.add(Assets.instance.assetEnemy234.region);
        regions.add(Assets.instance.assetEnemy235.region);
        regions.add(Assets.instance.assetEnemy236.region);
        regions.add(Assets.instance.assetEnemy237.region);
        regions.add(Assets.instance.assetEnemy238.region);
        regions.add(Assets.instance.assetEnemy239.region);
        regions.add(Assets.instance.assetEnemy240.region);
        regions.add(Assets.instance.assetEnemy241.region);
        regions.add(Assets.instance.assetEnemy242.region);
        regions.add(Assets.instance.assetEnemy243.region);
        regions.add(Assets.instance.assetEnemy244.region);
        regions.add(Assets.instance.assetEnemy245.region);
        regions.add(Assets.instance.assetEnemy246.region);
        regions.add(Assets.instance.assetEnemy247.region);
        regions.add(Assets.instance.assetEnemy248.region);
        regions.add(Assets.instance.assetEnemy249.region);
        regions.add(Assets.instance.assetEnemy250.region);
        regions.add(Assets.instance.assetEnemy251.region);
        regions.add(Assets.instance.assetEnemy252.region);
        regions.add(Assets.instance.assetEnemy253.region);
        regions.add(Assets.instance.assetEnemy254.region);
        regions.add(Assets.instance.assetEnemy255.region);
        regions.add(Assets.instance.assetEnemy256.region);
        regions.add(Assets.instance.assetEnemy257.region);
        regions.add(Assets.instance.assetEnemy258.region);
        regions.add(Assets.instance.assetEnemy259.region);
        regions.add(Assets.instance.assetEnemy260.region);
        regions.add(Assets.instance.assetEnemy261.region);
        regions.add(Assets.instance.assetEnemy262.region);
        regions.add(Assets.instance.assetEnemy263.region);
        regions.add(Assets.instance.assetEnemy264.region);
        regions.add(Assets.instance.assetEnemy265.region);
        regions.add(Assets.instance.assetEnemy266.region);
        regions.add(Assets.instance.assetEnemy267.region);
        regions.add(Assets.instance.assetEnemy268.region);
        regions.add(Assets.instance.assetEnemy269.region);
        regions.add(Assets.instance.assetEnemy270.region);
        regions.add(Assets.instance.assetEnemy271.region);
        regions.add(Assets.instance.assetEnemy272.region);
        regions.add(Assets.instance.assetEnemy273.region);
        regions.add(Assets.instance.assetEnemy274.region);
        regions.add(Assets.instance.assetEnemy275.region);
        regions.add(Assets.instance.assetEnemy276.region);
        regions.add(Assets.instance.assetEnemy277.region);
        regions.add(Assets.instance.assetEnemy278.region);
        regions.add(Assets.instance.assetEnemy279.region);
        regions.add(Assets.instance.assetEnemy280.region);
        regions.add(Assets.instance.assetEnemy281.region);
        regions.add(Assets.instance.assetEnemy282.region);
        regions.add(Assets.instance.assetEnemy283.region);
        regions.add(Assets.instance.assetEnemy284.region);
        regions.add(Assets.instance.assetEnemy285.region);
        regions.add(Assets.instance.assetEnemy286.region);
        regions.add(Assets.instance.assetEnemy287.region);
        regions.add(Assets.instance.assetEnemy288.region);
        regions.add(Assets.instance.assetEnemy289.region);
        regions.add(Assets.instance.assetEnemy290.region);
        regions.add(Assets.instance.assetEnemy291.region);
        regions.add(Assets.instance.assetEnemy292.region);
        regions.add(Assets.instance.assetEnemy293.region);
        regions.add(Assets.instance.assetEnemy294.region);
        regions.add(Assets.instance.assetEnemy295.region);
        regions.add(Assets.instance.assetEnemy296.region);
        regions.add(Assets.instance.assetEnemy297.region);
        regions.add(Assets.instance.assetEnemy298.region);
        regions.add(Assets.instance.assetEnemy299.region);
        regions.add(Assets.instance.assetEnemy300.region);
        regions.add(Assets.instance.assetEnemy301.region);
        regions.add(Assets.instance.assetEnemy302.region);
        regions.add(Assets.instance.assetEnemy303.region);
        regions.add(Assets.instance.assetEnemy304.region);
        regions.add(Assets.instance.assetEnemy305.region);
        regions.add(Assets.instance.assetEnemy306.region);
        regions.add(Assets.instance.assetEnemy307.region);
        regions.add(Assets.instance.assetEnemy308.region);
        regions.add(Assets.instance.assetEnemy309.region);
        regions.add(Assets.instance.assetEnemy310.region);
        regions.add(Assets.instance.assetEnemy311.region);
        regions.add(Assets.instance.assetEnemy312.region);
        regions.add(Assets.instance.assetEnemy313.region);
        regions.add(Assets.instance.assetEnemy314.region);
        regions.add(Assets.instance.assetEnemy315.region);
        regions.add(Assets.instance.assetEnemy316.region);
        regions.add(Assets.instance.assetEnemy317.region);
        regions.add(Assets.instance.assetEnemy318.region);
        regions.add(Assets.instance.assetEnemy319.region);
        regions.add(Assets.instance.assetEnemy320.region);
        regions.add(Assets.instance.assetEnemy321.region);
        regions.add(Assets.instance.assetEnemy322.region);
        regions.add(Assets.instance.assetEnemy323.region);
        regions.add(Assets.instance.assetEnemy324.region);
        regions.add(Assets.instance.assetEnemy325.region);
        regions.add(Assets.instance.assetEnemy326.region);
        regions.add(Assets.instance.assetEnemy327.region);
        regions.add(Assets.instance.assetEnemy328.region);
        regions.add(Assets.instance.assetEnemy329.region);
        regions.add(Assets.instance.assetEnemy330.region);
        regions.add(Assets.instance.assetEnemy331.region);
        regions.add(Assets.instance.assetEnemy332.region);
        regions.add(Assets.instance.assetEnemy333.region);
        regions.add(Assets.instance.assetEnemy334.region);
        regions.add(Assets.instance.assetEnemy335.region);
        regions.add(Assets.instance.assetEnemy336.region);
        regions.add(Assets.instance.assetEnemy337.region);
        regions.add(Assets.instance.assetEnemy338.region);
        regions.add(Assets.instance.assetEnemy339.region);
        regions.add(Assets.instance.assetEnemy340.region);
        regions.add(Assets.instance.assetEnemy341.region);
        regions.add(Assets.instance.assetEnemy342.region);
        regions.add(Assets.instance.assetEnemy343.region);
        regions.add(Assets.instance.assetEnemy344.region);
        regions.add(Assets.instance.assetEnemy345.region);
        regions.add(Assets.instance.assetEnemy346.region);
        regions.add(Assets.instance.assetEnemy347.region);
        regions.add(Assets.instance.assetEnemy348.region);
        regions.add(Assets.instance.assetEnemy349.region);
        regions.add(Assets.instance.assetEnemy350.region);
        regions.add(Assets.instance.assetEnemy351.region);
        regions.add(Assets.instance.assetEnemy352.region);
        regions.add(Assets.instance.assetEnemy353.region);
        regions.add(Assets.instance.assetEnemy354.region);
        regions.add(Assets.instance.assetEnemy355.region);
        regions.add(Assets.instance.assetEnemy356.region);
        regions.add(Assets.instance.assetEnemy357.region);
        regions.add(Assets.instance.assetEnemy358.region);
        regions.add(Assets.instance.assetEnemy359.region);
        regions.add(Assets.instance.assetEnemy360.region);
        regions.add(Assets.instance.assetEnemy361.region);
        regions.add(Assets.instance.assetEnemy362.region);
        regions.add(Assets.instance.assetEnemy363.region);
        regions.add(Assets.instance.assetEnemy364.region);
        regions.add(Assets.instance.assetEnemy365.region);
        regions.add(Assets.instance.assetEnemy366.region);
        regions.add(Assets.instance.assetEnemy367.region);
        regions.add(Assets.instance.assetEnemy368.region);
        regions.add(Assets.instance.assetEnemy369.region);
        regions.add(Assets.instance.assetEnemy370.region);
        regions.add(Assets.instance.assetEnemy371.region);
        regions.add(Assets.instance.assetEnemy372.region);
        regions.add(Assets.instance.assetEnemy373.region);
        regions.add(Assets.instance.assetEnemy374.region);
        regions.add(Assets.instance.assetEnemy375.region);
        regions.add(Assets.instance.assetEnemy376.region);
        regions.add(Assets.instance.assetEnemy377.region);
        regions.add(Assets.instance.assetEnemy378.region);
        regions.add(Assets.instance.assetEnemy379.region);
        regions.add(Assets.instance.assetEnemy380.region);
        regions.add(Assets.instance.assetEnemy381.region);
        regions.add(Assets.instance.assetEnemy382.region);
        regions.add(Assets.instance.assetEnemy383.region);
        regions.add(Assets.instance.assetEnemy384.region);
        regions.add(Assets.instance.assetEnemy385.region);
        regions.add(Assets.instance.assetEnemy386.region);
        regions.add(Assets.instance.assetEnemy387.region);
        regions.add(Assets.instance.assetEnemy388.region);
        regions.add(Assets.instance.assetEnemy389.region);
        regions.add(Assets.instance.assetEnemy390.region);
        regions.add(Assets.instance.assetEnemy391.region);
        regions.add(Assets.instance.assetEnemy392.region);
        regions.add(Assets.instance.assetEnemy393.region);
        regions.add(Assets.instance.assetEnemy394.region);
        regions.add(Assets.instance.assetEnemy395.region);
        regions.add(Assets.instance.assetEnemy396.region);
        regions.add(Assets.instance.assetEnemy397.region);
        regions.add(Assets.instance.assetEnemy398.region);
        regions.add(Assets.instance.assetEnemy399.region);
        regions.add(Assets.instance.assetEnemy400.region);
        regions.add(Assets.instance.assetEnemy401.region);
        regions.add(Assets.instance.assetEnemy402.region);
        regions.add(Assets.instance.assetEnemy403.region);
        regions.add(Assets.instance.assetEnemy404.region);
        regions.add(Assets.instance.assetEnemy405.region);
        regions.add(Assets.instance.assetEnemy406.region);
        regions.add(Assets.instance.assetEnemy407.region);
        regions.add(Assets.instance.assetEnemy408.region);
        regions.add(Assets.instance.assetEnemy409.region);
        regions.add(Assets.instance.assetEnemy410.region);
        regions.add(Assets.instance.assetEnemy411.region);
        regions.add(Assets.instance.assetEnemy412.region);
        regions.add(Assets.instance.assetEnemy413.region);
        regions.add(Assets.instance.assetEnemy414.region);
        regions.add(Assets.instance.assetEnemy415.region);
        regions.add(Assets.instance.assetEnemy416.region);
        regions.add(Assets.instance.assetEnemy417.region);
        regions.add(Assets.instance.assetEnemy418.region);
        regions.add(Assets.instance.assetEnemy419.region);
        regions.add(Assets.instance.assetEnemy420.region);
        regions.add(Assets.instance.assetEnemy421.region);
        regions.add(Assets.instance.assetEnemy422.region);
        regions.add(Assets.instance.assetEnemy423.region);
        regions.add(Assets.instance.assetEnemy424.region);
        regions.add(Assets.instance.assetEnemy425.region);
        regions.add(Assets.instance.assetEnemy426.region);
        regions.add(Assets.instance.assetEnemy427.region);
        regions.add(Assets.instance.assetEnemy428.region);
        regions.add(Assets.instance.assetEnemy429.region);
        regions.add(Assets.instance.assetEnemy430.region);
        regions.add(Assets.instance.assetEnemy431.region);
        regions.add(Assets.instance.assetEnemy432.region);
        regions.add(Assets.instance.assetEnemy433.region);
        regions.add(Assets.instance.assetEnemy434.region);
        regions.add(Assets.instance.assetEnemy435.region);
        regions.add(Assets.instance.assetEnemy436.region);
        regions.add(Assets.instance.assetEnemy437.region);
        regions.add(Assets.instance.assetEnemy438.region);
        regions.add(Assets.instance.assetEnemy439.region);
        regions.add(Assets.instance.assetEnemy440.region);
        regions.add(Assets.instance.assetEnemy441.region);
        regions.add(Assets.instance.assetEnemy442.region);
        regions.add(Assets.instance.assetEnemy443.region);
        regions.add(Assets.instance.assetEnemy444.region);
        regions.add(Assets.instance.assetEnemy445.region);
        regions.add(Assets.instance.assetEnemy446.region);
        regions.add(Assets.instance.assetEnemy447.region);
        regions.add(Assets.instance.assetEnemy448.region);
        regions.add(Assets.instance.assetEnemy449.region);
        regions.add(Assets.instance.assetEnemy450.region);
        regions.add(Assets.instance.assetEnemy451.region);
        regions.add(Assets.instance.assetEnemy452.region);
        regions.add(Assets.instance.assetEnemy453.region);
        regions.add(Assets.instance.assetEnemy454.region);
        regions.add(Assets.instance.assetEnemy455.region);
        regions.add(Assets.instance.assetEnemy456.region);
        regions.add(Assets.instance.assetEnemy457.region);
        regions.add(Assets.instance.assetEnemy458.region);
        regions.add(Assets.instance.assetEnemy459.region);
        regions.add(Assets.instance.assetEnemy460.region);
        regions.add(Assets.instance.assetEnemy461.region);
        regions.add(Assets.instance.assetEnemy462.region);
        regions.add(Assets.instance.assetEnemy463.region);
        regions.add(Assets.instance.assetEnemy464.region);
        regions.add(Assets.instance.assetEnemy465.region);
        regions.add(Assets.instance.assetEnemy466.region);
        regions.add(Assets.instance.assetEnemy467.region);
        regions.add(Assets.instance.assetEnemy468.region);
        regions.add(Assets.instance.assetEnemy469.region);
        regions.add(Assets.instance.assetEnemy470.region);
        regions.add(Assets.instance.assetEnemy471.region);
        regions.add(Assets.instance.assetEnemy472.region);
        regions.add(Assets.instance.assetEnemy473.region);
        regions.add(Assets.instance.assetEnemy474.region);
        regions.add(Assets.instance.assetEnemy475.region);
        regions.add(Assets.instance.assetEnemy476.region);
        regions.add(Assets.instance.assetEnemy477.region);
        regions.add(Assets.instance.assetEnemy478.region);
        regions.add(Assets.instance.assetEnemy479.region);
        regions.add(Assets.instance.assetEnemy480.region);
        regions.add(Assets.instance.assetEnemy481.region);
        regions.add(Assets.instance.assetEnemy482.region);
        regions.add(Assets.instance.assetEnemy483.region);
        regions.add(Assets.instance.assetEnemy484.region);
        regions.add(Assets.instance.assetEnemy485.region);
        regions.add(Assets.instance.assetEnemy486.region);
        regions.add(Assets.instance.assetEnemy487.region);
        regions.add(Assets.instance.assetEnemy488.region);
        regions.add(Assets.instance.assetEnemy489.region);
        regions.add(Assets.instance.assetEnemy490.region);
        regions.add(Assets.instance.assetEnemy491.region);
        regions.add(Assets.instance.assetEnemy492.region);
        regions.add(Assets.instance.assetEnemy493.region);
        regions.add(Assets.instance.assetEnemy494.region);
        regions.add(Assets.instance.assetEnemy495.region);
        regions.add(Assets.instance.assetEnemy496.region);
        regions.add(Assets.instance.assetEnemy497.region);
        regions.add(Assets.instance.assetEnemy498.region);
        regions.add(Assets.instance.assetEnemy499.region);
        regions.add(Assets.instance.assetEnemy500.region);
        regions.add(Assets.instance.assetEnemy501.region);
        regions.add(Assets.instance.assetEnemy502.region);
        regions.add(Assets.instance.assetEnemy503.region);
        regions.add(Assets.instance.assetEnemy504.region);
        regions.add(Assets.instance.assetEnemy505.region);
        regions.add(Assets.instance.assetEnemy506.region);
        regions.add(Assets.instance.assetEnemy507.region);
        regions.add(Assets.instance.assetEnemy508.region);
        regions.add(Assets.instance.assetEnemy509.region);
        regions.add(Assets.instance.assetEnemy510.region);
        regions.add(Assets.instance.assetEnemy511.region);
        regions.add(Assets.instance.assetEnemy512.region);
        regions.add(Assets.instance.assetEnemy513.region);
        regions.add(Assets.instance.assetEnemy514.region);
        regions.add(Assets.instance.assetEnemy515.region);
        regions.add(Assets.instance.assetEnemy516.region);
        regions.add(Assets.instance.assetEnemy517.region);
        regions.add(Assets.instance.assetEnemy518.region);
        regions.add(Assets.instance.assetEnemy519.region);
        regions.add(Assets.instance.assetEnemy520.region);
        regions.add(Assets.instance.assetEnemy521.region);
        regions.add(Assets.instance.assetEnemy522.region);
        regions.add(Assets.instance.assetEnemy523.region);
        regions.add(Assets.instance.assetEnemy524.region);
        regions.add(Assets.instance.assetEnemy525.region);
        regions.add(Assets.instance.assetEnemy526.region);
        regions.add(Assets.instance.assetEnemy527.region);
        regions.add(Assets.instance.assetEnemy528.region);
        regions.add(Assets.instance.assetEnemy529.region);
        regions.add(Assets.instance.assetEnemy530.region);
        regions.add(Assets.instance.assetEnemy531.region);
        regions.add(Assets.instance.assetEnemy532.region);
        regions.add(Assets.instance.assetEnemy533.region);
        regions.add(Assets.instance.assetEnemy534.region);
        regions.add(Assets.instance.assetEnemy535.region);
        regions.add(Assets.instance.assetEnemy536.region);
        regions.add(Assets.instance.assetEnemy537.region);
        regions.add(Assets.instance.assetEnemy538.region);
        regions.add(Assets.instance.assetEnemy539.region);
        regions.add(Assets.instance.assetEnemy540.region);
        regions.add(Assets.instance.assetEnemy541.region);
        regions.add(Assets.instance.assetEnemy542.region);
        regions.add(Assets.instance.assetEnemy543.region);
        regions.add(Assets.instance.assetEnemy544.region);
        regions.add(Assets.instance.assetEnemy545.region);
        regions.add(Assets.instance.assetEnemy546.region);
        regions.add(Assets.instance.assetEnemy547.region);
        regions.add(Assets.instance.assetEnemy548.region);
        regions.add(Assets.instance.assetEnemy549.region);
        regions.add(Assets.instance.assetEnemy550.region);
        regions.add(Assets.instance.assetEnemy551.region);
        regions.add(Assets.instance.assetEnemy552.region);
        regions.add(Assets.instance.assetEnemy553.region);
        regions.add(Assets.instance.assetEnemy554.region);
        regions.add(Assets.instance.assetEnemy555.region);
        regions.add(Assets.instance.assetEnemy556.region);
        regions.add(Assets.instance.assetEnemy557.region);
        regions.add(Assets.instance.assetEnemy558.region);
        regions.add(Assets.instance.assetEnemy559.region);
        regions.add(Assets.instance.assetEnemy560.region);
        regions.add(Assets.instance.assetEnemy561.region);
        regions.add(Assets.instance.assetEnemy562.region);
        regions.add(Assets.instance.assetEnemy563.region);
        regions.add(Assets.instance.assetEnemy564.region);
        regions.add(Assets.instance.assetEnemy565.region);
        regions.add(Assets.instance.assetEnemy566.region);
        regions.add(Assets.instance.assetEnemy567.region);
        regions.add(Assets.instance.assetEnemy568.region);
        regions.add(Assets.instance.assetEnemy569.region);
        regions.add(Assets.instance.assetEnemy570.region);
        regions.add(Assets.instance.assetEnemy571.region);
        regions.add(Assets.instance.assetEnemy572.region);
        regions.add(Assets.instance.assetEnemy573.region);
        regions.add(Assets.instance.assetEnemy574.region);
        regions.add(Assets.instance.assetEnemy575.region);
        regions.add(Assets.instance.assetEnemy576.region);
        regions.add(Assets.instance.assetEnemy577.region);
        regions.add(Assets.instance.assetEnemy578.region);
        regions.add(Assets.instance.assetEnemy579.region);
        regions.add(Assets.instance.assetEnemy580.region);
        regions.add(Assets.instance.assetEnemy581.region);
        regions.add(Assets.instance.assetEnemy582.region);
        regions.add(Assets.instance.assetEnemy583.region);
        regions.add(Assets.instance.assetEnemy584.region);
        regions.add(Assets.instance.assetEnemy585.region);
        regions.add(Assets.instance.assetEnemy586.region);
        regions.add(Assets.instance.assetEnemy587.region);
        regions.add(Assets.instance.assetEnemy588.region);
        regions.add(Assets.instance.assetEnemy589.region);
        regions.add(Assets.instance.assetEnemy590.region);
        regions.add(Assets.instance.assetEnemy591.region);
        regions.add(Assets.instance.assetEnemy592.region);
        regions.add(Assets.instance.assetEnemy593.region);
        regions.add(Assets.instance.assetEnemy594.region);
        regions.add(Assets.instance.assetEnemy595.region);
        regions.add(Assets.instance.assetEnemy596.region);
        regions.add(Assets.instance.assetEnemy597.region);
        regions.add(Assets.instance.assetEnemy598.region);
        regions.add(Assets.instance.assetEnemy599.region);
        regions.add(Assets.instance.assetEnemy600.region);
        regions.add(Assets.instance.assetEnemy601.region);
        regions.add(Assets.instance.assetEnemy602.region);
        regions.add(Assets.instance.assetEnemy603.region);
        regions.add(Assets.instance.assetEnemy604.region);
        regions.add(Assets.instance.assetEnemy605.region);
        regions.add(Assets.instance.assetEnemy606.region);
        regions.add(Assets.instance.assetEnemy607.region);
        regions.add(Assets.instance.assetEnemy608.region);
        regions.add(Assets.instance.assetEnemy609.region);
        regions.add(Assets.instance.assetEnemy610.region);
        regions.add(Assets.instance.assetEnemy611.region);
        regions.add(Assets.instance.assetEnemy612.region);
        regions.add(Assets.instance.assetEnemy613.region);
        regions.add(Assets.instance.assetEnemy614.region);
        regions.add(Assets.instance.assetEnemy615.region);
        regions.add(Assets.instance.assetEnemy616.region);
        regions.add(Assets.instance.assetEnemy617.region);
        regions.add(Assets.instance.assetEnemy618.region);
        regions.add(Assets.instance.assetEnemy619.region);
        regions.add(Assets.instance.assetEnemy620.region);
        regions.add(Assets.instance.assetEnemy621.region);
        regions.add(Assets.instance.assetEnemy622.region);
        regions.add(Assets.instance.assetEnemy623.region);
        regions.add(Assets.instance.assetEnemy624.region);
        regions.add(Assets.instance.assetEnemy625.region);
        regions.add(Assets.instance.assetEnemy626.region);
        regions.add(Assets.instance.assetEnemy627.region);
        regions.add(Assets.instance.assetEnemy628.region);
        regions.add(Assets.instance.assetEnemy629.region);
        regions.add(Assets.instance.assetEnemy630.region);
        regions.add(Assets.instance.assetEnemy631.region);
        regions.add(Assets.instance.assetEnemy632.region);
        regions.add(Assets.instance.assetEnemy633.region);
        regions.add(Assets.instance.assetEnemy634.region);
        regions.add(Assets.instance.assetEnemy635.region);
        regions.add(Assets.instance.assetEnemy636.region);
        regions.add(Assets.instance.assetEnemy637.region);
        regions.add(Assets.instance.assetEnemy638.region);
        regions.add(Assets.instance.assetEnemy639.region);
        regions.add(Assets.instance.assetEnemy640.region);
        regions.add(Assets.instance.assetEnemy641.region);
        regions.add(Assets.instance.assetEnemy642.region);
        regions.add(Assets.instance.assetEnemy643.region);
        regions.add(Assets.instance.assetEnemy644.region);
        regions.add(Assets.instance.assetEnemy645.region);
        regions.add(Assets.instance.assetEnemy646.region);
        regions.add(Assets.instance.assetEnemy647.region);
        regions.add(Assets.instance.assetEnemy648.region);
        regions.add(Assets.instance.assetEnemy649.region);
        regions.add(Assets.instance.assetEnemy650.region);
        regions.add(Assets.instance.assetEnemy651.region);
        regions.add(Assets.instance.assetEnemy652.region);
        regions.add(Assets.instance.assetEnemy653.region);
        regions.add(Assets.instance.assetEnemy654.region);
        regions.add(Assets.instance.assetEnemy655.region);
        regions.add(Assets.instance.assetEnemy656.region);
        regions.add(Assets.instance.assetEnemy657.region);
        regions.add(Assets.instance.assetEnemy658.region);
        regions.add(Assets.instance.assetEnemy659.region);
        regions.add(Assets.instance.assetEnemy660.region);
        regions.add(Assets.instance.assetEnemy661.region);
        regions.add(Assets.instance.assetEnemy662.region);
        regions.add(Assets.instance.assetEnemy663.region);
        regions.add(Assets.instance.assetEnemy664.region);
        regions.add(Assets.instance.assetEnemy665.region);
        regions.add(Assets.instance.assetEnemy666.region);
        regions.add(Assets.instance.assetEnemy667.region);
        regions.add(Assets.instance.assetEnemy668.region);
        regions.add(Assets.instance.assetEnemy669.region);
        regions.add(Assets.instance.assetEnemy670.region);
        regions.add(Assets.instance.assetEnemy671.region);
        regions.add(Assets.instance.assetEnemy672.region);
        regions.add(Assets.instance.assetEnemy673.region);
        regions.add(Assets.instance.assetEnemy674.region);
        regions.add(Assets.instance.assetEnemy675.region);
        regions.add(Assets.instance.assetEnemy676.region);
        regions.add(Assets.instance.assetEnemy677.region);
        regions.add(Assets.instance.assetEnemy678.region);
        regions.add(Assets.instance.assetEnemy679.region);
        regions.add(Assets.instance.assetEnemy680.region);
        regions.add(Assets.instance.assetEnemy681.region);
        regions.add(Assets.instance.assetEnemy682.region);
        regions.add(Assets.instance.assetEnemy683.region);
        regions.add(Assets.instance.assetEnemy684.region);
        regions.add(Assets.instance.assetEnemy685.region);
        regions.add(Assets.instance.assetEnemy686.region);
        regions.add(Assets.instance.assetEnemy687.region);
        regions.add(Assets.instance.assetEnemy688.region);
        regions.add(Assets.instance.assetEnemy689.region);
        regions.add(Assets.instance.assetEnemy690.region);
        regions.add(Assets.instance.assetEnemy691.region);
        regions.add(Assets.instance.assetEnemy692.region);
        regions.add(Assets.instance.assetEnemy693.region);
        regions.add(Assets.instance.assetEnemy694.region);
        regions.add(Assets.instance.assetEnemy695.region);
        regions.add(Assets.instance.assetEnemy696.region);
        regions.add(Assets.instance.assetEnemy697.region);
        regions.add(Assets.instance.assetEnemy698.region);
        regions.add(Assets.instance.assetEnemy699.region);
        regions.add(Assets.instance.assetEnemy700.region);
        regions.add(Assets.instance.assetEnemy701.region);
        regions.add(Assets.instance.assetEnemy702.region);
        regions.add(Assets.instance.assetEnemy703.region);
        regions.add(Assets.instance.assetEnemy704.region);
        regions.add(Assets.instance.assetEnemy705.region);
        regions.add(Assets.instance.assetEnemy706.region);
        regions.add(Assets.instance.assetEnemy707.region);
        regions.add(Assets.instance.assetEnemy708.region);
        regions.add(Assets.instance.assetEnemy709.region);
        regions.add(Assets.instance.assetEnemy710.region);
        regions.add(Assets.instance.assetEnemy711.region);
        regions.add(Assets.instance.assetEnemy712.region);
        regions.add(Assets.instance.assetEnemy713.region);
        regions.add(Assets.instance.assetEnemy714.region);
        regions.add(Assets.instance.assetEnemy715.region);
        regions.add(Assets.instance.assetEnemy716.region);
        regions.add(Assets.instance.assetEnemy717.region);
        regions.add(Assets.instance.assetEnemy718.region);
        regions.add(Assets.instance.assetEnemy719.region);
        regions.add(Assets.instance.assetEnemy720.region);
        regions.add(Assets.instance.assetEnemy721.region);
        regions.add(Assets.instance.assetEnemy722.region);
        regions.add(Assets.instance.assetEnemy723.region);
        regions.add(Assets.instance.assetEnemy724.region);
        regions.add(Assets.instance.assetEnemy725.region);
        regions.add(Assets.instance.assetEnemy726.region);
        regions.add(Assets.instance.assetEnemy727.region);
        regions.add(Assets.instance.assetEnemy728.region);
        regions.add(Assets.instance.assetEnemy729.region);
        regions.add(Assets.instance.assetEnemy730.region);
        regions.add(Assets.instance.assetEnemy731.region);
        regions.add(Assets.instance.assetEnemy732.region);
        regions.add(Assets.instance.assetEnemy733.region);
        regions.add(Assets.instance.assetEnemy734.region);
        regions.add(Assets.instance.assetEnemy735.region);
        regions.add(Assets.instance.assetEnemy736.region);
        regions.add(Assets.instance.assetEnemy737.region);
        regions.add(Assets.instance.assetEnemy738.region);
        regions.add(Assets.instance.assetEnemy739.region);
        regions.add(Assets.instance.assetEnemy740.region);
        regions.add(Assets.instance.assetEnemy741.region);
        regions.add(Assets.instance.assetEnemy742.region);
        regions.add(Assets.instance.assetEnemy743.region);
        regions.add(Assets.instance.assetEnemy744.region);
        regions.add(Assets.instance.assetEnemy745.region);
        regions.add(Assets.instance.assetEnemy746.region);
        regions.add(Assets.instance.assetEnemy747.region);
        regions.add(Assets.instance.assetEnemy748.region);
        regions.add(Assets.instance.assetEnemy749.region);
        regions.add(Assets.instance.assetEnemy750.region);
        regions.add(Assets.instance.assetEnemy751.region);
        regions.add(Assets.instance.assetEnemy752.region);
        regions.add(Assets.instance.assetEnemy753.region);
        regions.add(Assets.instance.assetEnemy754.region);
        regions.add(Assets.instance.assetEnemy755.region);
        regions.add(Assets.instance.assetEnemy756.region);
        regions.add(Assets.instance.assetEnemy757.region);
        regions.add(Assets.instance.assetEnemy758.region);
        regions.add(Assets.instance.assetEnemy759.region);
        regions.add(Assets.instance.assetEnemy760.region);
        regions.add(Assets.instance.assetEnemy761.region);
        regions.add(Assets.instance.assetEnemy762.region);
        regions.add(Assets.instance.assetEnemy763.region);
        regions.add(Assets.instance.assetEnemy764.region);
        regions.add(Assets.instance.assetEnemy765.region);
        regions.add(Assets.instance.assetEnemy766.region);
        regions.add(Assets.instance.assetEnemy767.region);
        regions.add(Assets.instance.assetEnemy768.region);
        regions.add(Assets.instance.assetEnemy769.region);
        regions.add(Assets.instance.assetEnemy770.region);
        regions.add(Assets.instance.assetEnemy771.region);
        regions.add(Assets.instance.assetEnemy772.region);
        regions.add(Assets.instance.assetEnemy773.region);
        regions.add(Assets.instance.assetEnemy774.region);
        regions.add(Assets.instance.assetEnemy775.region);
        regions.add(Assets.instance.assetEnemy776.region);
        regions.add(Assets.instance.assetEnemy777.region);
        regions.add(Assets.instance.assetEnemy778.region);
        regions.add(Assets.instance.assetEnemy779.region);
        regions.add(Assets.instance.assetEnemy780.region);
        regions.add(Assets.instance.assetEnemy781.region);
        regions.add(Assets.instance.assetEnemy782.region);
        regions.add(Assets.instance.assetEnemy783.region);
        regions.add(Assets.instance.assetEnemy784.region);
        regions.add(Assets.instance.assetEnemy785.region);
        regions.add(Assets.instance.assetEnemy786.region);
        regions.add(Assets.instance.assetEnemy787.region);
        regions.add(Assets.instance.assetEnemy788.region);
        regions.add(Assets.instance.assetEnemy789.region);
        regions.add(Assets.instance.assetEnemy790.region);
        regions.add(Assets.instance.assetEnemy791.region);
        regions.add(Assets.instance.assetEnemy792.region);
        regions.add(Assets.instance.assetEnemy793.region);
        regions.add(Assets.instance.assetEnemy794.region);
        regions.add(Assets.instance.assetEnemy795.region);
        regions.add(Assets.instance.assetEnemy796.region);
        regions.add(Assets.instance.assetEnemy797.region);
        regions.add(Assets.instance.assetEnemy798.region);
        regions.add(Assets.instance.assetEnemy799.region);
        regions.add(Assets.instance.assetEnemy800.region);
        regions.add(Assets.instance.assetEnemy801.region);
        regions.add(Assets.instance.assetEnemy802.region);
        regions.add(Assets.instance.assetEnemy803.region);
        regions.add(Assets.instance.assetEnemy804.region);
        regions.add(Assets.instance.assetEnemy805.region);
        regions.add(Assets.instance.assetEnemy806.region);
        regions.add(Assets.instance.assetEnemy807.region);
        regions.add(Assets.instance.assetEnemy808.region);
        regions.add(Assets.instance.assetEnemy809.region);
        regions.add(Assets.instance.assetEnemy810.region);
        regions.add(Assets.instance.assetEnemy811.region);
        regions.add(Assets.instance.assetEnemy812.region);
        regions.add(Assets.instance.assetEnemy813.region);
        regions.add(Assets.instance.assetEnemy814.region);
        regions.add(Assets.instance.assetEnemy815.region);
        regions.add(Assets.instance.assetEnemy816.region);
        regions.add(Assets.instance.assetEnemy817.region);
        regions.add(Assets.instance.assetEnemy818.region);
        regions.add(Assets.instance.assetEnemy819.region);
        regions.add(Assets.instance.assetEnemy820.region);
        regions.add(Assets.instance.assetEnemy821.region);
        regions.add(Assets.instance.assetEnemy822.region);
        regions.add(Assets.instance.assetEnemy823.region);
        regions.add(Assets.instance.assetEnemy824.region);
        regions.add(Assets.instance.assetEnemy825.region);
        regions.add(Assets.instance.assetEnemy826.region);
        regions.add(Assets.instance.assetEnemy827.region);
        regions.add(Assets.instance.assetEnemy828.region);
        regions.add(Assets.instance.assetEnemy829.region);
        regions.add(Assets.instance.assetEnemy830.region);
        regions.add(Assets.instance.assetEnemy831.region);
        regions.add(Assets.instance.assetEnemy832.region);
        regions.add(Assets.instance.assetEnemy833.region);
        regions.add(Assets.instance.assetEnemy834.region);
        regions.add(Assets.instance.assetEnemy835.region);
        regions.add(Assets.instance.assetEnemy836.region);
        regions.add(Assets.instance.assetEnemy837.region);
        regions.add(Assets.instance.assetEnemy838.region);
        regions.add(Assets.instance.assetEnemy839.region);
        regions.add(Assets.instance.assetEnemy840.region);
        regions.add(Assets.instance.assetEnemy841.region);
        regions.add(Assets.instance.assetEnemy842.region);
        regions.add(Assets.instance.assetEnemy843.region);
        regions.add(Assets.instance.assetEnemy844.region);
        regions.add(Assets.instance.assetEnemy845.region);
        regions.add(Assets.instance.assetEnemy846.region);
        regions.add(Assets.instance.assetEnemy847.region);
        regions.add(Assets.instance.assetEnemy848.region);
        regions.add(Assets.instance.assetEnemy849.region);
        regions.add(Assets.instance.assetEnemy850.region);
        regions.add(Assets.instance.assetEnemy851.region);
        regions.add(Assets.instance.assetEnemy852.region);
        regions.add(Assets.instance.assetEnemy853.region);
        regions.add(Assets.instance.assetEnemy854.region);
        regions.add(Assets.instance.assetEnemy855.region);
        regions.add(Assets.instance.assetEnemy856.region);
        regions.add(Assets.instance.assetEnemy857.region);
        regions.add(Assets.instance.assetEnemy858.region);
        regions.add(Assets.instance.assetEnemy859.region);
        regions.add(Assets.instance.assetEnemy860.region);
        regions.add(Assets.instance.assetEnemy861.region);
        regions.add(Assets.instance.assetEnemy862.region);
        regions.add(Assets.instance.assetEnemy863.region);
        regions.add(Assets.instance.assetEnemy864.region);
        regions.add(Assets.instance.assetEnemy865.region);
        regions.add(Assets.instance.assetEnemy866.region);
        regions.add(Assets.instance.assetEnemy867.region);
        regions.add(Assets.instance.assetEnemy868.region);
        regions.add(Assets.instance.assetEnemy869.region);
        regions.add(Assets.instance.assetEnemy870.region);
        regions.add(Assets.instance.assetEnemy871.region);
        regions.add(Assets.instance.assetEnemy872.region);
        regions.add(Assets.instance.assetEnemy873.region);
        regions.add(Assets.instance.assetEnemy874.region);
        regions.add(Assets.instance.assetEnemy875.region);
        regions.add(Assets.instance.assetEnemy876.region);
        regions.add(Assets.instance.assetEnemy877.region);
        regions.add(Assets.instance.assetEnemy878.region);
        regions.add(Assets.instance.assetEnemy879.region);
        regions.add(Assets.instance.assetEnemy880.region);
        regions.add(Assets.instance.assetEnemy881.region);
        regions.add(Assets.instance.assetEnemy882.region);
        regions.add(Assets.instance.assetEnemy883.region);
        regions.add(Assets.instance.assetEnemy884.region);
        regions.add(Assets.instance.assetEnemy885.region);
        regions.add(Assets.instance.assetEnemy886.region);
        regions.add(Assets.instance.assetEnemy887.region);
        regions.add(Assets.instance.assetEnemy888.region);
        regions.add(Assets.instance.assetEnemy889.region);
        regions.add(Assets.instance.assetEnemy890.region);
        regions.add(Assets.instance.assetEnemy891.region);
        regions.add(Assets.instance.assetEnemy892.region);
        regions.add(Assets.instance.assetEnemy893.region);
        regions.add(Assets.instance.assetEnemy894.region);
        regions.add(Assets.instance.assetEnemy895.region);
        regions.add(Assets.instance.assetEnemy896.region);
        regions.add(Assets.instance.assetEnemy897.region);
        regions.add(Assets.instance.assetEnemy898.region);
        regions.add(Assets.instance.assetEnemy899.region);
        regions.add(Assets.instance.assetEnemy900.region);
        regions.add(Assets.instance.assetEnemy901.region);
        regions.add(Assets.instance.assetEnemy902.region);
        regions.add(Assets.instance.assetEnemy903.region);
        regions.add(Assets.instance.assetEnemy904.region);
        regions.add(Assets.instance.assetEnemy905.region);
        regions.add(Assets.instance.assetEnemy906.region);
        regions.add(Assets.instance.assetEnemy907.region);
        regions.add(Assets.instance.assetEnemy908.region);
        regions.add(Assets.instance.assetEnemy909.region);
        regions.add(Assets.instance.assetEnemy910.region);
        regions.add(Assets.instance.assetEnemy911.region);
        regions.add(Assets.instance.assetEnemy912.region);
        regions.add(Assets.instance.assetEnemy913.region);
        regions.add(Assets.instance.assetEnemy914.region);
        regions.add(Assets.instance.assetEnemy915.region);
        regions.add(Assets.instance.assetEnemy916.region);
        regions.add(Assets.instance.assetEnemy917.region);
        regions.add(Assets.instance.assetEnemy918.region);
        regions.add(Assets.instance.assetEnemy919.region);
        regions.add(Assets.instance.assetEnemy920.region);
        regions.add(Assets.instance.assetEnemy921.region);
        regions.add(Assets.instance.assetEnemy922.region);
        regions.add(Assets.instance.assetEnemy923.region);
        regions.add(Assets.instance.assetEnemy924.region);
        regions.add(Assets.instance.assetEnemy925.region);
        regions.add(Assets.instance.assetEnemy926.region);
        regions.add(Assets.instance.assetEnemy927.region);
        regions.add(Assets.instance.assetEnemy928.region);
        regions.add(Assets.instance.assetEnemy929.region);
        regions.add(Assets.instance.assetEnemy930.region);
        regions.add(Assets.instance.assetEnemy931.region);
        regions.add(Assets.instance.assetEnemy932.region);
        regions.add(Assets.instance.assetEnemy933.region);
        regions.add(Assets.instance.assetEnemy934.region);
        regions.add(Assets.instance.assetEnemy935.region);
        regions.add(Assets.instance.assetEnemy936.region);
        regions.add(Assets.instance.assetEnemy937.region);
        regions.add(Assets.instance.assetEnemy938.region);
        regions.add(Assets.instance.assetEnemy939.region);
        regions.add(Assets.instance.assetEnemy940.region);
        regions.add(Assets.instance.assetEnemy941.region);
        regions.add(Assets.instance.assetEnemy942.region);
        regions.add(Assets.instance.assetEnemy943.region);
        regions.add(Assets.instance.assetEnemy944.region);
        regions.add(Assets.instance.assetEnemy945.region);
        regions.add(Assets.instance.assetEnemy946.region);
        regions.add(Assets.instance.assetEnemy947.region);
        regions.add(Assets.instance.assetEnemy948.region);
        regions.add(Assets.instance.assetEnemy949.region);
        regions.add(Assets.instance.assetEnemy950.region);
        regions.add(Assets.instance.assetEnemy951.region);
        regions.add(Assets.instance.assetEnemy952.region);
        regions.add(Assets.instance.assetEnemy953.region);
        regions.add(Assets.instance.assetEnemy954.region);
        regions.add(Assets.instance.assetEnemy955.region);
        regions.add(Assets.instance.assetEnemy956.region);
        regions.add(Assets.instance.assetEnemy957.region);
        regions.add(Assets.instance.assetEnemy958.region);
        regions.add(Assets.instance.assetEnemy959.region);
        regions.add(Assets.instance.assetEnemy960.region);
        regions.add(Assets.instance.assetEnemy961.region);
        regions.add(Assets.instance.assetEnemy962.region);
        regions.add(Assets.instance.assetEnemy963.region);
        regions.add(Assets.instance.assetEnemy964.region);
        regions.add(Assets.instance.assetEnemy965.region);
        regions.add(Assets.instance.assetEnemy966.region);
        regions.add(Assets.instance.assetEnemy967.region);
        regions.add(Assets.instance.assetEnemy968.region);
        regions.add(Assets.instance.assetEnemy969.region);
        regions.add(Assets.instance.assetEnemy970.region);
        regions.add(Assets.instance.assetEnemy971.region);
        regions.add(Assets.instance.assetEnemy972.region);
        regions.add(Assets.instance.assetEnemy973.region);
        regions.add(Assets.instance.assetEnemy974.region);
        regions.add(Assets.instance.assetEnemy975.region);
        regions.add(Assets.instance.assetEnemy976.region);
        regions.add(Assets.instance.assetEnemy977.region);
        regions.add(Assets.instance.assetEnemy978.region);
        regions.add(Assets.instance.assetEnemy979.region);
        regions.add(Assets.instance.assetEnemy980.region);
        regions.add(Assets.instance.assetEnemy981.region);
        regions.add(Assets.instance.assetEnemy982.region);
        regions.add(Assets.instance.assetEnemy983.region);
        regions.add(Assets.instance.assetEnemy984.region);
        regions.add(Assets.instance.assetEnemy985.region);
        regions.add(Assets.instance.assetEnemy986.region);
        regions.add(Assets.instance.assetEnemy987.region);
        regions.add(Assets.instance.assetEnemy988.region);
        regions.add(Assets.instance.assetEnemy989.region);
        regions.add(Assets.instance.assetEnemy990.region);
        regions.add(Assets.instance.assetEnemy991.region);
        regions.add(Assets.instance.assetEnemy992.region);
        regions.add(Assets.instance.assetEnemy993.region);
        regions.add(Assets.instance.assetEnemy994.region);
        regions.add(Assets.instance.assetEnemy995.region);
        regions.add(Assets.instance.assetEnemy996.region);
        regions.add(Assets.instance.assetEnemy997.region);
        regions.add(Assets.instance.assetEnemy998.region);
        regions.add(Assets.instance.assetEnemy999.region);
        regions.add(Assets.instance.assetEnemy1000.region);
        regions.add(Assets.instance.assetEnemy1001.region);
        regions.add(Assets.instance.assetEnemy1002.region);
        regions.add(Assets.instance.assetEnemy1003.region);
        regions.add(Assets.instance.assetEnemy1004.region);
        regions.add(Assets.instance.assetEnemy1005.region);
        regions.add(Assets.instance.assetEnemy1006.region);
        regions.add(Assets.instance.assetEnemy1007.region);
        regions.add(Assets.instance.assetEnemy1008.region);
        regions.add(Assets.instance.assetEnemy1009.region);
        regions.add(Assets.instance.assetEnemy1010.region);
        regions.add(Assets.instance.assetEnemy1011.region);
        regions.add(Assets.instance.assetEnemy1012.region);
        regions.add(Assets.instance.assetEnemy1013.region);
        regions.add(Assets.instance.assetEnemy1014.region);
        regions.add(Assets.instance.assetEnemy1015.region);
        regions.add(Assets.instance.assetEnemy1016.region);
        regions.add(Assets.instance.assetEnemy1017.region);
        regions.add(Assets.instance.assetEnemy1018.region);
        regions.add(Assets.instance.assetEnemy1019.region);
        regions.add(Assets.instance.assetEnemy1020.region);
        regions.add(Assets.instance.assetEnemy1021.region);
        regions.add(Assets.instance.assetEnemy1022.region);
        regions.add(Assets.instance.assetEnemy1023.region);
        regions.add(Assets.instance.assetEnemy1024.region);
        regions.add(Assets.instance.assetEnemy1025.region);
        regions.add(Assets.instance.assetEnemy1026.region);
        regions.add(Assets.instance.assetEnemy1027.region);
        regions.add(Assets.instance.assetEnemy1028.region);
        regions.add(Assets.instance.assetEnemy1029.region);
        regions.add(Assets.instance.assetEnemy1030.region);
        regions.add(Assets.instance.assetEnemy1031.region);
        regions.add(Assets.instance.assetEnemy1032.region);
        regions.add(Assets.instance.assetEnemy1033.region);
        regions.add(Assets.instance.assetEnemy1034.region);
        regions.add(Assets.instance.assetEnemy1035.region);
        regions.add(Assets.instance.assetEnemy1036.region);
        regions.add(Assets.instance.assetEnemy1037.region);
        regions.add(Assets.instance.assetEnemy1038.region);
        regions.add(Assets.instance.assetEnemy1039.region);
        regions.add(Assets.instance.assetEnemy1040.region);
        regions.add(Assets.instance.assetEnemy1041.region);
        regions.add(Assets.instance.assetEnemy1042.region);
        regions.add(Assets.instance.assetEnemy1043.region);
        regions.add(Assets.instance.assetEnemy1044.region);
        regions.add(Assets.instance.assetEnemy1045.region);
        regions.add(Assets.instance.assetEnemy1046.region);
        regions.add(Assets.instance.assetEnemy1047.region);
        regions.add(Assets.instance.assetEnemy1048.region);
        regions.add(Assets.instance.assetEnemy1049.region);
        regions.add(Assets.instance.assetEnemy1050.region);
        regions.add(Assets.instance.assetEnemy1051.region);
        regions.add(Assets.instance.assetEnemy1052.region);
        regions.add(Assets.instance.assetEnemy1053.region);
        regions.add(Assets.instance.assetEnemy1054.region);
        regions.add(Assets.instance.assetEnemy1055.region);
        regions.add(Assets.instance.assetEnemy1056.region);
        regions.add(Assets.instance.assetEnemy1057.region);
        regions.add(Assets.instance.assetEnemy1058.region);
        regions.add(Assets.instance.assetEnemy1059.region);
        regions.add(Assets.instance.assetEnemy1060.region);
        regions.add(Assets.instance.assetEnemy1061.region);
        regions.add(Assets.instance.assetEnemy1062.region);
        regions.add(Assets.instance.assetEnemy1063.region);
        regions.add(Assets.instance.assetEnemy1064.region);
        regions.add(Assets.instance.assetEnemy1065.region);
        regions.add(Assets.instance.assetEnemy1066.region);
        regions.add(Assets.instance.assetEnemy1067.region);
        regions.add(Assets.instance.assetEnemy1068.region);
        regions.add(Assets.instance.assetEnemy1069.region);
        regions.add(Assets.instance.assetEnemy1070.region);
        regions.add(Assets.instance.assetEnemy1071.region);
        regions.add(Assets.instance.assetEnemy1072.region);
        regions.add(Assets.instance.assetEnemy1073.region);
        regions.add(Assets.instance.assetEnemy1074.region);
        regions.add(Assets.instance.assetEnemy1075.region);
        regions.add(Assets.instance.assetEnemy1076.region);
        regions.add(Assets.instance.assetEnemy1077.region);
        regions.add(Assets.instance.assetEnemy1078.region);
        regions.add(Assets.instance.assetEnemy1079.region);
        regions.add(Assets.instance.assetEnemy1080.region);
        regions.add(Assets.instance.assetEnemy1081.region);
        regions.add(Assets.instance.assetEnemy1082.region);
        regions.add(Assets.instance.assetEnemy1083.region);
        regions.add(Assets.instance.assetEnemy1084.region);
        regions.add(Assets.instance.assetEnemy1085.region);
        regions.add(Assets.instance.assetEnemy1086.region);
        regions.add(Assets.instance.assetEnemy1087.region);
        regions.add(Assets.instance.assetEnemy1088.region);
        regions.add(Assets.instance.assetEnemy1089.region);
        regions.add(Assets.instance.assetEnemy1090.region);
        regions.add(Assets.instance.assetEnemy1091.region);
        regions.add(Assets.instance.assetEnemy1092.region);
        regions.add(Assets.instance.assetEnemy1093.region);
        regions.add(Assets.instance.assetEnemy1094.region);
        regions.add(Assets.instance.assetEnemy1095.region);
        regions.add(Assets.instance.assetEnemy1096.region);
        regions.add(Assets.instance.assetEnemy1097.region);
        regions.add(Assets.instance.assetEnemy1098.region);
        regions.add(Assets.instance.assetEnemy1099.region);
        regions.add(Assets.instance.assetEnemy1100.region);
        regions.add(Assets.instance.assetEnemy1101.region);
        regions.add(Assets.instance.assetEnemy1102.region);
        regions.add(Assets.instance.assetEnemy1103.region);
        regions.add(Assets.instance.assetEnemy1104.region);
        regions.add(Assets.instance.assetEnemy1105.region);
        regions.add(Assets.instance.assetEnemy1106.region);
        regions.add(Assets.instance.assetEnemy1107.region);
        regions.add(Assets.instance.assetEnemy1108.region);
        regions.add(Assets.instance.assetEnemy1109.region);
        regions.add(Assets.instance.assetEnemy1110.region);
        regions.add(Assets.instance.assetEnemy1111.region);
        regions.add(Assets.instance.assetEnemy1112.region);
        regions.add(Assets.instance.assetEnemy1113.region);
        regions.add(Assets.instance.assetEnemy1114.region);
        regions.add(Assets.instance.assetEnemy1115.region);
        regions.add(Assets.instance.assetEnemy1116.region);
        regions.add(Assets.instance.assetEnemy1117.region);
        regions.add(Assets.instance.assetEnemy1118.region);
        regions.add(Assets.instance.assetEnemy1119.region);
        regions.add(Assets.instance.assetEnemy1120.region);
        regions.add(Assets.instance.assetEnemy1121.region);
        regions.add(Assets.instance.assetEnemy1122.region);
        regions.add(Assets.instance.assetEnemy1123.region);
        regions.add(Assets.instance.assetEnemy1124.region);
        regions.add(Assets.instance.assetEnemy1125.region);
        regions.add(Assets.instance.assetEnemy1126.region);
        regions.add(Assets.instance.assetEnemy1127.region);
        regions.add(Assets.instance.assetEnemy1128.region);
        regions.add(Assets.instance.assetEnemy1129.region);
        regions.add(Assets.instance.assetEnemy1130.region);
        regions.add(Assets.instance.assetEnemy1131.region);
        regions.add(Assets.instance.assetEnemy1132.region);
        regions.add(Assets.instance.assetEnemy1133.region);
        regions.add(Assets.instance.assetEnemy1134.region);
        regions.add(Assets.instance.assetEnemy1135.region);
        regions.add(Assets.instance.assetEnemy1136.region);
        regions.add(Assets.instance.assetEnemy1137.region);
        regions.add(Assets.instance.assetEnemy1138.region);
        regions.add(Assets.instance.assetEnemy1139.region);
        regions.add(Assets.instance.assetEnemy1140.region);
        regions.add(Assets.instance.assetEnemy1141.region);
        regions.add(Assets.instance.assetEnemy1142.region);
        regions.add(Assets.instance.assetEnemy1143.region);
        regions.add(Assets.instance.assetEnemy1144.region);
        regions.add(Assets.instance.assetEnemy1145.region);
        regions.add(Assets.instance.assetEnemy1146.region);
        regions.add(Assets.instance.assetEnemy1147.region);
        regions.add(Assets.instance.assetEnemy1148.region);
        regions.add(Assets.instance.assetEnemy1149.region);
        regions.add(Assets.instance.assetEnemy1150.region);
        regions.add(Assets.instance.assetEnemy1151.region);
        regions.add(Assets.instance.assetEnemy1152.region);
        regions.add(Assets.instance.assetEnemy1153.region);
        regions.add(Assets.instance.assetEnemy1154.region);
        regions.add(Assets.instance.assetEnemy1155.region);
        regions.add(Assets.instance.assetEnemy1156.region);
        regions.add(Assets.instance.assetEnemy1157.region);
        regions.add(Assets.instance.assetEnemy1158.region);
        regions.add(Assets.instance.assetEnemy1159.region);
        regions.add(Assets.instance.assetEnemy1160.region);
        regions.add(Assets.instance.assetEnemy1161.region);
        regions.add(Assets.instance.assetEnemy1162.region);
        regions.add(Assets.instance.assetEnemy1163.region);
        regions.add(Assets.instance.assetEnemy1164.region);
        regions.add(Assets.instance.assetEnemy1165.region);
        regions.add(Assets.instance.assetEnemy1166.region);
        regions.add(Assets.instance.assetEnemy1167.region);
        regions.add(Assets.instance.assetEnemy1168.region);
        regions.add(Assets.instance.assetEnemy1169.region);
        regions.add(Assets.instance.assetEnemy1170.region);
        regions.add(Assets.instance.assetEnemy1171.region);
        regions.add(Assets.instance.assetEnemy1172.region);
        regions.add(Assets.instance.assetEnemy1173.region);
        regions.add(Assets.instance.assetEnemy1174.region);
        regions.add(Assets.instance.assetEnemy1175.region);
        regions.add(Assets.instance.assetEnemy1176.region);
        regions.add(Assets.instance.assetEnemy1177.region);
        regions.add(Assets.instance.assetEnemy1178.region);
        regions.add(Assets.instance.assetEnemy1179.region);
        regions.add(Assets.instance.assetEnemy1180.region);
        regions.add(Assets.instance.assetEnemy1181.region);
        regions.add(Assets.instance.assetEnemy1182.region);
        regions.add(Assets.instance.assetEnemy1183.region);
        regions.add(Assets.instance.assetEnemy1184.region);
        regions.add(Assets.instance.assetEnemy1185.region);
        regions.add(Assets.instance.assetEnemy1186.region);
        regions.add(Assets.instance.assetEnemy1187.region);
        regions.add(Assets.instance.assetEnemy1188.region);
        regions.add(Assets.instance.assetEnemy1189.region);
        regions.add(Assets.instance.assetEnemy1190.region);
        regions.add(Assets.instance.assetEnemy1191.region);
        regions.add(Assets.instance.assetEnemy1192.region);
        regions.add(Assets.instance.assetEnemy1193.region);
        regions.add(Assets.instance.assetEnemy1194.region);
        regions.add(Assets.instance.assetEnemy1195.region);
        regions.add(Assets.instance.assetEnemy1196.region);
        regions.add(Assets.instance.assetEnemy1197.region);
        regions.add(Assets.instance.assetEnemy1198.region);
        regions.add(Assets.instance.assetEnemy1199.region);
        regions.add(Assets.instance.assetEnemy1200.region);
        regions.add(Assets.instance.assetEnemy1201.region);
        regions.add(Assets.instance.assetEnemy1202.region);
        regions.add(Assets.instance.assetEnemy1203.region);
        regions.add(Assets.instance.assetEnemy1204.region);
        regions.add(Assets.instance.assetEnemy1205.region);
        regions.add(Assets.instance.assetEnemy1206.region);
        regions.add(Assets.instance.assetEnemy1207.region);
        regions.add(Assets.instance.assetEnemy1208.region);
        regions.add(Assets.instance.assetEnemy1209.region);
        regions.add(Assets.instance.assetEnemy1210.region);
        regions.add(Assets.instance.assetEnemy1211.region);
        regions.add(Assets.instance.assetEnemy1212.region);
        regions.add(Assets.instance.assetEnemy1213.region);
        regions.add(Assets.instance.assetEnemy1214.region);
        regions.add(Assets.instance.assetEnemy1215.region);
        regions.add(Assets.instance.assetEnemy1216.region);
        regions.add(Assets.instance.assetEnemy1217.region);
        regions.add(Assets.instance.assetEnemy1218.region);
        regions.add(Assets.instance.assetEnemy1219.region);
        regions.add(Assets.instance.assetEnemy1220.region);
        regions.add(Assets.instance.assetEnemy1221.region);
        regions.add(Assets.instance.assetEnemy1222.region);
        regions.add(Assets.instance.assetEnemy1223.region);
        regions.add(Assets.instance.assetEnemy1224.region);
        regions.add(Assets.instance.assetEnemy1225.region);
        regions.add(Assets.instance.assetEnemy1226.region);
        regions.add(Assets.instance.assetEnemy1227.region);
        regions.add(Assets.instance.assetEnemy1228.region);
        regions.add(Assets.instance.assetEnemy1229.region);
        regions.add(Assets.instance.assetEnemy1230.region);
        regions.add(Assets.instance.assetEnemy1231.region);
        regions.add(Assets.instance.assetEnemy1232.region);
        regions.add(Assets.instance.assetEnemy1233.region);
        regions.add(Assets.instance.assetEnemy1234.region);
        regions.add(Assets.instance.assetEnemy1235.region);
        regions.add(Assets.instance.assetEnemy1236.region);
        regions.add(Assets.instance.assetEnemy1237.region);
        regions.add(Assets.instance.assetEnemy1238.region);
        regions.add(Assets.instance.assetEnemy1239.region);
        regions.add(Assets.instance.assetEnemy1240.region);
        regions.add(Assets.instance.assetEnemy1241.region);
        regions.add(Assets.instance.assetEnemy1242.region);
        regions.add(Assets.instance.assetEnemy1243.region);
        regions.add(Assets.instance.assetEnemy1244.region);
        regions.add(Assets.instance.assetEnemy1245.region);
        regions.add(Assets.instance.assetEnemy1246.region);
        regions.add(Assets.instance.assetEnemy1247.region);
        regions.add(Assets.instance.assetEnemy1248.region);
        regions.add(Assets.instance.assetEnemy1249.region);
        regions.add(Assets.instance.assetEnemy1250.region);
        regions.add(Assets.instance.assetEnemy1251.region);
        regions.add(Assets.instance.assetEnemy1252.region);
        regions.add(Assets.instance.assetEnemy1253.region);
        regions.add(Assets.instance.assetEnemy1254.region);
        regions.add(Assets.instance.assetEnemy1255.region);
        regions.add(Assets.instance.assetEnemy1256.region);
        regions.add(Assets.instance.assetEnemy1257.region);
        regions.add(Assets.instance.assetEnemy1258.region);
        regions.add(Assets.instance.assetEnemy1259.region);
        regions.add(Assets.instance.assetEnemy1260.region);
        regions.add(Assets.instance.assetEnemy1261.region);
        regions.add(Assets.instance.assetEnemy1262.region);
        regions.add(Assets.instance.assetEnemy1263.region);
        regions.add(Assets.instance.assetEnemy1264.region);
        regions.add(Assets.instance.assetEnemy1265.region);
        regions.add(Assets.instance.assetEnemy1266.region);
        regions.add(Assets.instance.assetEnemy1267.region);
        regions.add(Assets.instance.assetEnemy1268.region);
        regions.add(Assets.instance.assetEnemy1269.region);
        regions.add(Assets.instance.assetEnemy1270.region);
        regions.add(Assets.instance.assetEnemy1271.region);
        regions.add(Assets.instance.assetEnemy1272.region);
        regions.add(Assets.instance.assetEnemy1273.region);
        regions.add(Assets.instance.assetEnemy1274.region);
        regions.add(Assets.instance.assetEnemy1275.region);
        regions.add(Assets.instance.assetEnemy1276.region);
        regions.add(Assets.instance.assetEnemy1277.region);
        regions.add(Assets.instance.assetEnemy1278.region);
        regions.add(Assets.instance.assetEnemy1279.region);
        regions.add(Assets.instance.assetEnemy1280.region);
        regions.add(Assets.instance.assetEnemy1281.region);
        regions.add(Assets.instance.assetEnemy1282.region);
        regions.add(Assets.instance.assetEnemy1283.region);
        regions.add(Assets.instance.assetEnemy1284.region);
        regions.add(Assets.instance.assetEnemy1285.region);
        regions.add(Assets.instance.assetEnemy1286.region);
        regions.add(Assets.instance.assetEnemy1287.region);
        regions.add(Assets.instance.assetEnemy1288.region);
        regions.add(Assets.instance.assetEnemy1289.region);
        regions.add(Assets.instance.assetEnemy1290.region);
        regions.add(Assets.instance.assetEnemy1291.region);
        regions.add(Assets.instance.assetEnemy1292.region);
        regions.add(Assets.instance.assetEnemy1293.region);
        regions.add(Assets.instance.assetEnemy1294.region);
        regions.add(Assets.instance.assetEnemy1295.region);
        regions.add(Assets.instance.assetEnemy1296.region);
        regions.add(Assets.instance.assetEnemy1297.region);
        regions.add(Assets.instance.assetEnemy1298.region);
        regions.add(Assets.instance.assetEnemy1299.region);
        regions.add(Assets.instance.assetEnemy1300.region);
        regions.add(Assets.instance.assetEnemy1301.region);
        regions.add(Assets.instance.assetEnemy1302.region);
        regions.add(Assets.instance.assetEnemy1303.region);
        regions.add(Assets.instance.assetEnemy1304.region);
        regions.add(Assets.instance.assetEnemy1305.region);
        regions.add(Assets.instance.assetEnemy1306.region);
        regions.add(Assets.instance.assetEnemy1307.region);
        regions.add(Assets.instance.assetEnemy1308.region);
        regions.add(Assets.instance.assetEnemy1309.region);
        regions.add(Assets.instance.assetEnemy1310.region);
        regions.add(Assets.instance.assetEnemy1311.region);
        regions.add(Assets.instance.assetEnemy1312.region);
        regions.add(Assets.instance.assetEnemy1313.region);
        regions.add(Assets.instance.assetEnemy1314.region);
        regions.add(Assets.instance.assetEnemy1315.region);
        regions.add(Assets.instance.assetEnemy1316.region);
        regions.add(Assets.instance.assetEnemy1317.region);
        regions.add(Assets.instance.assetEnemy1318.region);
        regions.add(Assets.instance.assetEnemy1319.region);
        regions.add(Assets.instance.assetEnemy1320.region);
        regions.add(Assets.instance.assetEnemy1321.region);
        regions.add(Assets.instance.assetEnemy1322.region);
        regions.add(Assets.instance.assetEnemy1323.region);
        regions.add(Assets.instance.assetEnemy1324.region);
        regions.add(Assets.instance.assetEnemy1325.region);
        regions.add(Assets.instance.assetEnemy1326.region);
        regions.add(Assets.instance.assetEnemy1327.region);
        regions.add(Assets.instance.assetEnemy1328.region);
        regions.add(Assets.instance.assetEnemy1329.region);
        regions.add(Assets.instance.assetEnemy1330.region);
        regions.add(Assets.instance.assetEnemy1331.region);
        regions.add(Assets.instance.assetEnemy1332.region);
        regions.add(Assets.instance.assetEnemy1333.region);
        regions.add(Assets.instance.assetEnemy1334.region);
        regions.add(Assets.instance.assetEnemy1335.region);
        regions.add(Assets.instance.assetEnemy1336.region);
        regions.add(Assets.instance.assetEnemy1337.region);
        regions.add(Assets.instance.assetEnemy1338.region);
        regions.add(Assets.instance.assetEnemy1339.region);
        regions.add(Assets.instance.assetEnemy1340.region);
        regions.add(Assets.instance.assetEnemy1341.region);
        regions.add(Assets.instance.assetEnemy1342.region);
        regions.add(Assets.instance.assetEnemy1343.region);
        regions.add(Assets.instance.assetEnemy1344.region);
        regions.add(Assets.instance.assetEnemy1345.region);
        regions.add(Assets.instance.assetEnemy1346.region);
        regions.add(Assets.instance.assetEnemy1347.region);
        regions.add(Assets.instance.assetEnemy1348.region);
        regions.add(Assets.instance.assetEnemy1349.region);
        regions.add(Assets.instance.assetEnemy1350.region);
        regions.add(Assets.instance.assetEnemy1351.region);
        regions.add(Assets.instance.assetEnemy1352.region);
        regions.add(Assets.instance.assetEnemy1353.region);
        regions.add(Assets.instance.assetEnemy1354.region);
        regions.add(Assets.instance.assetEnemy1355.region);
        regions.add(Assets.instance.assetEnemy1356.region);
        regions.add(Assets.instance.assetEnemy1357.region);
        regions.add(Assets.instance.assetEnemy1358.region);
        regions.add(Assets.instance.assetEnemy1359.region);
        regions.add(Assets.instance.assetEnemy1360.region);
        regions.add(Assets.instance.assetEnemy1361.region);
        regions.add(Assets.instance.assetEnemy1362.region);
        regions.add(Assets.instance.assetEnemy1363.region);
        regions.add(Assets.instance.assetEnemy1364.region);
        regions.add(Assets.instance.assetEnemy1365.region);
        regions.add(Assets.instance.assetEnemy1366.region);
        regions.add(Assets.instance.assetEnemy1367.region);
        regions.add(Assets.instance.assetEnemy1368.region);
        regions.add(Assets.instance.assetEnemy1369.region);
        regions.add(Assets.instance.assetEnemy1370.region);
        regions.add(Assets.instance.assetEnemy1371.region);
        regions.add(Assets.instance.assetEnemy1372.region);
        regions.add(Assets.instance.assetEnemy1373.region);
        regions.add(Assets.instance.assetEnemy1374.region);
        regions.add(Assets.instance.assetEnemy1375.region);
        regions.add(Assets.instance.assetEnemy1376.region);
        regions.add(Assets.instance.assetEnemy1377.region);
        regions.add(Assets.instance.assetEnemy1378.region);
        regions.add(Assets.instance.assetEnemy1379.region);
        regions.add(Assets.instance.assetEnemy1380.region);
        regions.add(Assets.instance.assetEnemy1381.region);
        regions.add(Assets.instance.assetEnemy1382.region);
        regions.add(Assets.instance.assetEnemy1383.region);
        regions.add(Assets.instance.assetEnemy1384.region);
        regions.add(Assets.instance.assetEnemy1385.region);
        regions.add(Assets.instance.assetEnemy1386.region);
        regions.add(Assets.instance.assetEnemy1387.region);
        regions.add(Assets.instance.assetEnemy1388.region);
        regions.add(Assets.instance.assetEnemy1389.region);
        regions.add(Assets.instance.assetEnemy1390.region);
        regions.add(Assets.instance.assetEnemy1391.region);
        regions.add(Assets.instance.assetEnemy1392.region);
        regions.add(Assets.instance.assetEnemy1393.region);
        regions.add(Assets.instance.assetEnemy1394.region);
        regions.add(Assets.instance.assetEnemy1395.region);
        regions.add(Assets.instance.assetEnemy1396.region);
        regions.add(Assets.instance.assetEnemy1397.region);
    }
}
