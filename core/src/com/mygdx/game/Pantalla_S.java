package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Pantalla_S extends ScreenBase{
    SpriteBatch batch;
    int altura,amplada;
    Sprite boss;
    TextureRegion region;
    TextureAtlas atlas;



    public Pantalla_S(MyGdxGame joc) {
        super(joc);

        batch=joc.getBatch();
        altura=joc.getAltura();
        amplada=joc.getAmplada();
        atlas=joc.getAtlas();

    }

    @Override
    public void show() {
        region=atlas.findRegion("darksaber");
        boss=new Sprite(region,0,0,region.getRegionWidth(),region.getRegionHeight());
        boss.setPosition(amplada/2,altura/2);
        boss.rotate(45);
        boss.flip(true,false);

    }

    @Override
    public void render(float delta) {

        batch.begin();
        Gdx.gl.glClearColor(1f,1f,1f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        boss.draw(batch);
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
