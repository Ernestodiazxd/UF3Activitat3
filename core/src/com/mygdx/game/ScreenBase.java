package com.mygdx.game;

import com.badlogic.gdx.Screen;

public abstract class ScreenBase implements Screen {

    protected MyGdxGame joc;

    public ScreenBase(MyGdxGame joc) {
        this.joc = joc;
    }
}
