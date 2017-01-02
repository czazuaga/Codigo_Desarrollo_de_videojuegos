package com.patrones;

import com.badlogic.gdx.Game;

/**
 * Created by Carlos Zamora on 02/01/2017.
 */
public class Pantalla extends ScreenCreator {

    private Jugador jugador;
    private Game mainGame;
    private PrincipalGame principalGame;

    public Pantalla(Game mainGame) {
        super(mainGame);
        this.mainGame = mainGame;
        this.principalGame = principalGame;
    }

    @Override
    public void show() {
        jugador = new Jugador(principalGame);
    }

    @Override
    public void render(float delta) {
        jugador.update();
    }

}
