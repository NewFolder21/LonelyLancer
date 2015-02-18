package com.vital.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by vitaliy on 18.02.15.
 */
public class GameScreen implements Screen {

    SpriteBatch batch;
    Texture texture;

    public GameScreen(){
        batch = new SpriteBatch();
        texture = new Texture("textures/green.jpg");

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(texture, 150, 150);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
