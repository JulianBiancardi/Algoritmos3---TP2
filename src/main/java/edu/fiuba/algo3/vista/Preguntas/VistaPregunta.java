package edu.fiuba.algo3.vista.Preguntas;

import edu.fiuba.algo3.modelo.Entidades.Jugador;
import edu.fiuba.algo3.modelo.Entidades.Preguntas.Pregunta;
import edu.fiuba.algo3.modelo.Entidades.Respuestas.Respuesta;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public abstract class VistaPregunta extends GridPane{
    protected Pregunta preguntaAsociada;

    public VistaPregunta(Pregunta pregunta){
        preguntaAsociada = pregunta;

        this.setAlignment(Pos.CENTER);
        this.setPrefSize(1200,200);
        this.setHgap(5);
        this.setVgap(5);
        this.setPadding(new Insets(10, 10 , 10 , 10));
    }

    public abstract Respuesta obtenerRespuesta(Jugador jugador);

    // public abstract void inicializarOpciones();
}