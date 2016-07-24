package com.tightfit.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector3;
import com.tightfit.model.GameWorld;
import com.tightfit.util.Constants;
import com.tightfit.view.Renderer;

public class MainScreen extends InputAdapter implements Screen {
    private GameWorld world;
    private Renderer renderer;
    private boolean paused;
    float w;
    float h;
    @Override
    public void show() {
        w = Gdx.graphics.getWidth() / 25;
        h =  Gdx.graphics.getHeight() / 25;
        world = new GameWorld();
        renderer = new Renderer(world);
        paused = false;
        InputMultiplexer multiplexer = new InputMultiplexer();
        multiplexer.addProcessor(this);
        multiplexer.addProcessor(world);
        Gdx.input.setInputProcessor(multiplexer);
    }

    @Override
    public void render(float delta) {
        if (!paused) {
            world.update(Gdx.graphics.getDeltaTime());
        }
        Gdx.gl.glClearColor(19/255.0f,54/255.0f,68/255.0f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
    }

    @Override
    public void pause() {
        paused = true;
    }

    @Override
    public void resume() {
        paused = false;
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        renderer.dispose();
    }
    @Override
    public boolean scrolled(int amount) {
        renderer.getCamera().zoom += amount / 25f;
        return true;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if(!world.isReset()){
            Vector3 tmp = new Vector3();
            renderer.getCamera().unproject(tmp.set(screenX, screenY, 0));
            float x = Constants.w / tmp.x;
            float y = Constants.h / tmp.y;

            if (tmp.x<Constants.w/2) {
                world.setLeftKeyPressed(true);
            }else{
                world.setRightKeyPressed(true);
            }

            System.out.println("w/" + x + "f ," + "h/" + y + "f");
            System.out.println(tmp.x + "f ," + tmp.y + "f");
            System.out.println("-------------------");
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        if(!world.isReset()){
            Vector3 tmp = new Vector3();
            renderer.getCamera().unproject(tmp.set(screenX, screenY, 0));

            if (tmp.x<Constants.w/2) {
                world.setLeftKeyPressed(false);
                world.setLeftKeyCounter(0);
            }else{
                world.setRightKeyPressed(false);
                world.setRightKeyCounter(0);
            }
            world.getPlayerBody().setLinearVelocity(0, 0);
        }
        return false;
    }

}
