package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.Entidades.Juego;
import edu.fiuba.algo3.vista.VistaFinJuego;
import edu.fiuba.algo3.vista.VistaIntroPregunta;
import edu.fiuba.algo3.vista.VistaPrincipal;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControladorSiguiente implements EventHandler<ActionEvent> {
    Stage stage;
    Juego juego;

    public ControladorSiguiente (Stage stage, Juego juego){
        this.stage = stage;
        this.juego = juego;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        if(juego.hayRondaSiguiente()) {
            juego.siguienteRonda();
            VistaIntroPregunta vistaIntroPregunta = new VistaIntroPregunta(stage,juego);
            stage.setScene(new Scene(vistaIntroPregunta));
        }
        else{
            VistaFinJuego vistaFinJuego = new VistaFinJuego(juego.obtenerJugadores());
            stage.setScene(new Scene(vistaFinJuego));
        }
        stage.setFullScreen(true);
    }
}
