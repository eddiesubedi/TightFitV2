package com.tightfit.model.Entities;

import box2dLight.PointLight;
import box2dLight.RayHandler;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;
import net.dermetfan.gdx.graphics.g2d.Box2DSprite;

import static com.tightfit.util.Constants.GROUP_ENEMY;

public class Gem extends Item {
    private float size;
    private PointLight pointLight;
    public Gem(float x, float y, float size, Sprite sprite){
        setX(x);
        setY(y);
        setSprite(sprite);
        this.size = size;
    }


    public float getSize() {
        return size;
    }


    public PointLight getPointLight() {
        return pointLight;
    }

    @Override
    public void addToWorld(World world) {
        BodyDef bodyDef = new BodyDef();
        FixtureDef fixtureDef = new FixtureDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(getX(), getY());

        PolygonShape boxShape = new PolygonShape();
        boxShape.setAsBox(size/2, size/2);
        // fixture
        fixtureDef.shape = boxShape;
        fixtureDef.density = 0.000001f;
        fixtureDef.filter.groupIndex = GROUP_ENEMY;

        setBody(world.createBody(bodyDef));
        Fixture fixture = getBody().createFixture(fixtureDef);
        Box2DSprite box2DSprite = new Box2DSprite(getSprite());
        getBody().setUserData(box2DSprite); // will draw on whole body
        fixture.setUserData(this);

        float angle = (float) Math.toRadians(45);
        getBody().setTransform(getBody().getWorldCenter(),angle);
        boxShape.dispose();
    }

    @Override
    public void addLight(RayHandler handler, Color color) {
        pointLight = new PointLight(handler,300,color,getSize()*5,0,0);
        pointLight.attachToBody(getBody());
    }
}
