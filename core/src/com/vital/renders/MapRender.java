package com.vital.renders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.vital.world.GameMap;

/**
 * Created by DzEN on 18.02.2015.
 */
public class MapRender {
    private SpriteBatch batch;
    private TextureAtlas atlas;
    private Array<TextureAtlas.AtlasRegion> textures;
    private int[][] map;

    public MapRender(SpriteBatch batch){
        this.batch = batch;
        atlas = new TextureAtlas(Gdx.files.internal("textures/map.atlas"),Gdx.files.internal("textures"));
        textures = atlas.findRegions("cell");
        GameMap map = new GameMap(20,20);
        this.map = map.getMap();
    }

    public void draw(){
        TextureRegion reg;
        int width = 64, height = 64;
        batch.begin();

        for(int h = 0; h < map.length; h++){
            for(int w = 0; w < map[0].length; w++){
                reg = textures.get(map[h][w] - 1);
                reg.setRegionWidth(width);
                reg.setRegionHeight(height);
                batch.draw(reg, w*width, h*height);
            }
        }

        batch.end();
    }
}
