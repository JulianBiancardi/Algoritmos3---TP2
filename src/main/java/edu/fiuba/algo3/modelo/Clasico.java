package edu.fiuba.algo3.modelo;

public class Clasico implements ModoPregunta {

    static final int PUNTAJE = 1;

    @Override
    public void modificarPuntos(Jugador jugador, int aciertos, int errores){
        if(errores == 0)
            jugador.sumarPuntos(PUNTAJE);
    }
}
/*
 * cantidadCorrectas = 3;
 *
 * incorrectas = cantidadCorrectas - lasQueVosC
 */
