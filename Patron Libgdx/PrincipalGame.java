package com.patrones;

import com.badlogic.gdx.Game;

/**
 * Created by Carlos Zamora on 02/01/2017.
 */
public class PrincipalGame extends Game {

    Pantalla pantalla;

    @Override
    public void create() {
        pantalla = new Pantalla(this);
        this.setScreen(pantalla);
    }
}
