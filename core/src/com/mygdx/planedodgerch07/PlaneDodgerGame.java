package com.mygdx.planedodgerch07;

public class PlaneDodgerGame extends BaseGame {
    public void create() {
        super.create();
        setActiveScreen(new LevelScreen());
    }
}
