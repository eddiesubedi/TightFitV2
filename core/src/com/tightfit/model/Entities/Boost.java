package com.tightfit.model.Entities;

import box2dLight.PointLight;
import box2dLight.RayHandler;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.tightfit.util.BodyEditorLoader;


public class Boost extends Item{
    private float size;
    private Vector2 bodyOrigin = new Vector2();
    private PointLight pointLight;
    public Boost(float x, float y, float size){
        setX(x);
        setY(y);
        setSprite(new Sprite(new Texture("rocket.png")));
        this.size = size;
    }
    @Override
    public void addToWorld(World world) {
        BodyEditorLoader loader = new BodyEditorLoader(Gdx.files.internal("Bodies.json"));

        // 1. Create a BodyDef, as usual.
        BodyDef bd = new BodyDef();
        bd.position.set(getX(), getY());
        bd.type = BodyDef.BodyType.DynamicBody;

        // 2. Create a FixtureDef, as usual.
        FixtureDef fd = new FixtureDef();
        fd.density = 0.000001f;
        fd.friction = 0.5f;
        fd.restitution = 0.3f;

        // 3. Create a Body, as usual.
        setBody(world.createBody(bd));

        // 4. Create the body fixture automatically by using the loader.
        loader.attachFixture(getBody(), "Rocket", fd, size);
        bodyOrigin = loader.getOrigin("Rocket", size).cpy();

        getBody().setUserData(this);
    }

    @Override
    public void addLight(RayHandler handler, Color color) {
        pointLight = new PointLight(handler,300,color,getSize()*5,0,0);
        pointLight.attachToBody(getBody());
    }

    public Vector2 getBodyOrigin() {
        return bodyOrigin;
    }

    public float getSize() {
        return size;
    }
}
