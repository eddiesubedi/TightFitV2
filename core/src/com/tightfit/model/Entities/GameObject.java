package com.tightfit.model.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

public abstract class GameObject {
    private Body body;
    private Sprite sprite;
    private float x, y;
    private boolean deleteBody;
    abstract void addToWorld(World world);
    public GameObject(){
        sprite = new Sprite();
    }

    public boolean isDeleteBody() {
        return deleteBody;
    }

    public void setDeleteBody(boolean deleteBody) {
        this.deleteBody = deleteBody;
    }

    public Body getBody() {
        return body;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }
}
