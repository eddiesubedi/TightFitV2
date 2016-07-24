package com.tightfit.model.Entities;

import box2dLight.RayHandler;
import com.badlogic.gdx.graphics.Color;

/**
 * Created by Eddie on 2/26/2016.
 */
public abstract class Item extends GameObject {
    public abstract void addLight(RayHandler handler, Color color);
}
