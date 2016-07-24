package com.tightfit.view;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.utils.Disposable;
import com.tightfit.model.Entities.Boost;
import com.tightfit.model.Entities.Gem;
import com.tightfit.model.GameWorld;
import net.dermetfan.gdx.graphics.g2d.Box2DSprite;

import static com.tightfit.util.Constants.h;
import static com.tightfit.util.Constants.w;

public class Renderer implements Disposable{
    private final int VELOCITYITERATIONS = 8, POSITIONITERATION = 3;
    private final float TIMESET = 1 / 60f;
    private Box2DDebugRenderer debugRenderer;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private GameWorld gw;

    public Renderer(GameWorld gw){
        this.gw = gw;
        init();
    }

    private void init(){
        camera = new OrthographicCamera(w, h);
        camera.setToOrtho(false, w, h);
        batch = new SpriteBatch();
        debugRenderer = new Box2DDebugRenderer();
    }
    public void render(){
        gw.getWorld().step(TIMESET, VELOCITYITERATIONS, POSITIONITERATION);
        if(gw.isReset()){
            gw.getTimer().cancel();
            for(int i = 0;i<gw.getGameObjects().size();i++){
                if(gw.getGameObjects().get(i) instanceof Gem){
                    ((Gem) gw.getGameObjects().get(i)).getPointLight().remove();
                }
                gw.getWorld().destroyBody(gw.getGameObjects().get(i).getBody());
            }
            gw.getGameObjects().clear();
            gw.initObjects();
            gw.setReset(false);
        }
        deleteBodies();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        Box2DSprite.draw(batch, gw.getWorld());
        for(int i = 0;i<gw.getGameObjects().size();i++){
            if(gw.getGameObjects().get(i) instanceof Boost){
                Boost temp = (Boost) gw.getGameObjects().get(i);
                Vector2 bottlePos = temp.getBody().getPosition().sub(temp.getBodyOrigin());
                temp.getSprite().setPosition(bottlePos.x, bottlePos.y);
                temp.getSprite().setOrigin(temp.getBodyOrigin().x, temp.getBodyOrigin().y);
                temp.getSprite().setRotation(temp.getBody().getAngle() * MathUtils.radiansToDegrees);
                temp.getSprite().setSize(temp.getSize(),temp.getSize());
                temp.getSprite().draw(batch);
            }
        }
        batch.end();
        camera.update();
        gw.getRayHandler().setCombinedMatrix(camera);
        gw.getRayHandler().updateAndRender();
//        debugRenderer.render(gw.getWorld(), camera.combined);
    }

    private void deleteBodies() {
        for(int i = 0; i<gw.getGameObjects().size();i++){
            if(gw.getGameObjects().get(i).isDeleteBody()){
                gw.getWorld().destroyBody(gw.getGameObjects().get(i).getBody());
                gw.getGameObjects().remove(i);
            }
        }
    }

    public void resize(int width, int height){
        camera.viewportWidth = width / 25;
        camera.viewportHeight = height / 25;
        camera.update();
    }

    @Override
    public void dispose() {
        gw.getRayHandler().dispose();
        batch.dispose();
    }

    public OrthographicCamera getCamera() {
        return camera;
    }
}
