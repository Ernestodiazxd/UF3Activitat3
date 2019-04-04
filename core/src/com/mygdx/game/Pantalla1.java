package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Pantalla1 extends ScreenBase {

    BitmapFont font;
    SpriteBatch batch;
    int altura,amplada;




    public Pantalla1(MyGdxGame joc) {
        super(joc);

        font=new BitmapFont();
        batch=joc.getBatch();
        altura=joc.getAltura();
        amplada=joc.getAmplada();


    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        font.setColor(Color.BLACK);

        Gdx.app.log("myTag","Render pantalla");

        batch.begin();
        Gdx.gl.glClearColor(1f,1f,1f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        font.draw(batch,"Apreta S para la pantalla 1",(amplada/2)-100,(altura/2)+100);
        font.draw(batch,"Apreta A para la pantalla 2",(amplada/2)-100,(altura/2)-100);
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
