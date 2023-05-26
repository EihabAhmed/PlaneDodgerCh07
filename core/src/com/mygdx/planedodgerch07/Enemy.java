package com.mygdx.planedodgerch07;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

public class Enemy extends BaseActor {
    public Enemy(float x, float y, Stage s) {
        super(x, y, s);

        String[] filenames = {"planeRed0.png", "planeRed1.png", "planeRed2.png", "planeRed1.png"};

        loadAnimationFromFiles(filenames, 0.1f, true);

        setSpeed(100);
        setMotionAngle(180);
        setBoundaryPolygon(8);
    }

    @Override
    public void act(float dt) {
        super.act(dt);
        applyPhysics(dt);
    }
}
