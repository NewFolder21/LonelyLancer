package com.vital;


import com.badlogic.gdx.Game;
import com.vital.screens.GameScreen;

public class MainGameClass extends Game{

    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
