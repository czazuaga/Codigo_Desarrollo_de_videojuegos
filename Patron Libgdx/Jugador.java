package com.patrones;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

/**
 * Created by Carlos Zamora on 02/01/2017.
 */
public class Jugador {

    private Game game;

    private enum Estado {SALTANDO, ANDANDO, CORRIENDO, ATACANDO}
    private Estado estadoActual;

    public Jugador (Game game){
        this.game = game;
    }

    private void saltar (){
        estadoActual = Estado.SALTANDO;
    }

    private void andar (){
        estadoActual = Estado.ANDANDO;
    }

    private void correr (){
        estadoActual = Estado.CORRIENDO;
    }

    private void morir (){
        game.setScreen((Screen) new PantallaGameOver());
    }

    private Estado getEstado (){
        return estadoActual;
    }

    private void cambiarAnimacion (Estado estado){
        switch (estado){
            case SALTANDO:{} //Animacion.set("saltar")
            case ANDANDO:{} //Animacion.set("andar")
            case CORRIENDO:{} //Animacion.set("correr")
        }
    }

    public void update(){
        cambiarAnimacion(getEstado());
    }


}
