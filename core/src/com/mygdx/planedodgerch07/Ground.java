package com.mygdx.planedodgerch07;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Ground extends BaseActor {

    public Ground(float x, float y, Stage s) {
        super(x, y, s);
        loadTexture("ground.png");
        setSpeed(100);
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
