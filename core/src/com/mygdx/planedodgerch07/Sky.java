package com.mygdx.planedodgerch07;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Sky extends BaseActor {

    public Sky(float x, float y, Stage s) {
        super(x, y, s);
        loadTexture("sky.png");
        setSpeed(25);
        setMotionAngle(180);
    }

    @Override
    public void act(float dt) {
        super.act(dt);
        applyPhysics(dt);

        if (getX() + getWidth() < 0) {
            moveBy(2 * getWidth(), 0);
        }
    }
}
