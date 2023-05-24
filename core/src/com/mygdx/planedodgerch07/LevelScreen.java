package com.mygdx.planedodgerch07;

import com.badlogic.gdx.Input.Keys;

public class LevelScreen extends BaseScreen {

    Plane plane;
    @Override
    public void initialize() {
        new Sky(0, 0, mainStage);
        new Sky(800, 0, mainStage);
        new Ground(0, 0, mainStage);
        new Ground(800, 0, mainStage);

        plane = new Plane(100, 500, mainStage);
        BaseActor.setWorldBounds(800, 600);
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Keys.SPACE)
            plane.boost();

        return true;
    }
}
