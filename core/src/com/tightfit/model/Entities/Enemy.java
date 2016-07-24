package com.tightfit.model.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import net.dermetfan.gdx.graphics.g2d.Box2DSprite;

import static com.tightfit.util.Constants.GROUP_ENEMY;

public class Enemy extends GameObject{
    private float width, height;
    public Enemy(float x, float y, float width, float height, Sprite sprite){
        setX(x);
        setY(y);
        setSprite(sprite);
        this.width = width;
        this.height = height;
    }
    @Override
    public void addToWorld(World world) {
        BodyDef bodyDef = new BodyDef();
        FixtureDef fixtureDef = new FixtureDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(getX(), getY());

        // box shape
        PolygonShape boxShape = new PolygonShape();
        boxShape.setAsBox(width, height);
        // fixture
        fixtureDef.shape = boxShape;
        fixtureDef.friction = .75f;
        fixtureDef.restitution = .1f;
        fixtureDef.density = 50;
        fixtureDef.filter.groupIndex = GROUP_ENEMY;
        //create the body
        setBody(world.createBody(bodyDef));
        Fixture fixture = getBody().createFixture(fixtureDef);
        Box2DSprite box2DSprite = new Box2DSprite(getSprite());
        getBody().setUserData(box2DSprite); // will draw on whole body
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
