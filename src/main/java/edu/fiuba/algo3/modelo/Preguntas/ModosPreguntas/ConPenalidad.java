package edu.fiuba.algo3.modelo.Preguntas.ModosPreguntas;

import edu.fiuba.algo3.modelo.Respuesta;

public class ConPenalidad implements ModoPregunta {
    static final int PUNTAJE = 1;

    @Override
    public void modificarPuntos(Respuesta respuestaJugador, int cantidadOpcionesCorrectasDeLaPregunta) {
        int aciertosJugador = respuestaJugador.cantidadOpcionesCorrectas();
        int erroresJugador = respuestaJugador.cantidadOpcionesIncorrectas();

        respuestaJugador.puntuarJugador(PUNTAJE * aciertosJugador);
        respuestaJugador.penalizarJugador(PUNTAJE * erroresJugador);
    }
}