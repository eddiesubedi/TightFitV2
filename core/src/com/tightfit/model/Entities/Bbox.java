package com.tightfit.model.Entities;

import com.badlogic.gdx.physics.box2d.*;

import static com.tightfit.util.Constants.GROUP_PLAYER;

public class Bbox extends GameObject{
    private float width, height;
    public Bbox(float x, float y, float width, float height){
        setX(x);
        setY(y);
        this.width = width;
        this.height = height;
    }
    @Override
    public void addToWorld(World world) {
        BodyDef bodyDef = new BodyDef();
        FixtureDef fixtureDef = new FixtureDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(getX(), getY());


        PolygonShape boxShape = new PolygonShape();
        boxShape.setAsBox(width, height);
        // fixture
        fixtureDef.shape = boxShape;
        fixtureDef.friction = .74f;
        fixtureDef.restitution = .1f;
        fixtureDef.density = 50;
        fixtureDef.filter.groupIndex = GROUP_PLAYER;
        //create the body
        setBody(world.createBody(bodyDef));
        Fixture fixture = getBody().createFixture(fixtureDef);
        getBody().setUserData(this); // will draw on whole body
        fixture.setUserData(this);

        boxShape.dispose();
    }
    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
