package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

public class Entrada extends InputAdapter {
    MyGdxGame joc;
    Pantalla_S ps;
    Pantalla_A pa;

    public Entrada(MyGdxGame joc) {
        this.joc = joc;
        this.pa=new Pantalla_A(joc);
        this.ps=new Pantalla_S(joc);
    }

    @Override
    public boolean keyDown(int keycode){
        Gdx.app.log("LOG1","ControlInput");

        switch (keycode){
            case Input.Keys.A:
                joc.setScreen(this.pa);
                return true;
            case Input.Keys.S:
                joc.setScreen(this.ps);
                return true;
            default:
                return false;

        }

    }
}
