package com.vital.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.vital.renders.MapRender;

/**
 * Created by vitaliy on 18.02.15.
 */
public class GameScreen implements Screen {
    OrthographicCamera cam;
    SpriteBatch batch;
    Texture texture;
    MapRender mapRender;

    public GameScreen(){
        batch = new SpriteBatch();
        texture = new Texture("textures/green.png");
        mapRender = new MapRender(batch);
        cam = new OrthographicCamera(1280, 1280);
        cam.position.set(cam.viewportWidth / 2f, cam.viewportHeight / 2f, 0);
        cam.update();
        batch.setProjectionMatrix(cam.combined);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        mapRender.draw();
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
