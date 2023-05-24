package com.mygdx.planedodgerch07;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Plane extends BaseActor {
    public Plane(float x, float y, Stage s) {
        super(x, y, s);
        String[] filenames = {"planeGreen0.png", "planeGreen1.png", "planeGreen2.png", "planeGreen1.png"};

        loadAnimationFromFiles(filenames, 0.1f, true);

        setMaxSpeed(800);
        setBoundaryPolygon(8);
    }

    @Override
    public void act(float dt) {
        super.act(dt);

        // simulate force of gravity
        setAcceleration(800);
        accelerateAtAngle(270);
        applyPhysics(dt);

        // stop plane from passing through the ground
        for (BaseActor g : BaseActor.getList(this.getStage(), "com.mygdx.planedodgerch07.Ground")) {
            if (this.overlaps(g)) {
                setSpeed(0);
                preventOverlap(g);
            }
        }

        // stop plane from moving past top of screen
        setSpeed(0);
        boundToWorld();
    }

    public void boost() {
        setSpeed(300);
        setMotionAngle(90);
    }
}
