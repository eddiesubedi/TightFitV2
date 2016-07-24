package com.tightfit.model.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import net.dermetfan.gdx.graphics.g2d.Box2DSprite;

import static com.tightfit.util.Constants.GROUP_PLAYER;

public class PlayerCircle extends Player{
    public PlayerCircle(float x, float y, float radius, Sprite sprite){
        setX(x);
        setY(y);
        setSize(radius);
        setSprite(sprite);
    }

    @Override
    public void addToWorld(World world) {
        BodyDef bodyDef = new BodyDef();
        FixtureDef fixtureDef = new FixtureDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(getX(), getY());
        // circular shape
        CircleShape circleShape = new CircleShape();
        circleShape.setRadius(getSize());
        // fixture
        fixtureDef.filter.groupIndex = GROUP_PLAYER;
        fixtureDef.shape = circleShape;
        fixtureDef.friction = .75f;
        fixtureDef.restitution = .1f;
        fixtureDef.density = .1f;
        //create the body
        setBody(world.createBody(bodyDef));
        Fixture fixture = getBody().createFixture(fixtureDef);
        Box2DSprite box2DSprite = new Box2DSprite(getSprite());
        getBody().setUserData(box2DSprite); // will draw on whole body
        fixture.setUserData(this);
        getBody().setLinearDamping(8);
        circleShape.dispose();
    }
}
