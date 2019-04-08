package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class MyGdxGame extends Game {
	SpriteBatch batch;
	int altura,amplada;
	TextureAtlas atlas;
	Entrada entrada;


	public SpriteBatch getBatch() {
		return batch;
	}

	public int getAltura() {
		return altura;
	}

	public int getAmplada() {
		return amplada;
	}

	public TextureAtlas getAtlas() {
		return atlas;
	}

	@Override
	public void create () {
		batch = new SpriteBatch();
		atlas=new TextureAtlas("fitxerAtlas.atlas");
		altura = Gdx.graphics.getHeight();
		amplada=Gdx.graphics.getWidth();


		Pantalla1 p1 = new Pantalla1(this);
		setScreen(p1);
		entrada=new Entrada(this);
		Gdx.input.setInputProcessor(entrada);

	}

	@Override
	public void dispose () {
		batch.dispose();
		atlas.dispose();
	}
}
