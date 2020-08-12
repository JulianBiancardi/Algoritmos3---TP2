package edu.fiuba.algo3.modelo.Entidades.Opciones;

public class OpcionOrdenada implements Opcion {
    private String descripcion;
    private int posicionActual;
    private int posicionEsperada;

    public OpcionOrdenada(String descripcion) { this.descripcion = descripcion; }

    public void setPosicionEsperada (int posicionEsperada){
        this.posicionEsperada = posicionEsperada;
    }

    public void setPosicionActual(int posicion){ posicionActual = posicion; }

    @Override
    public boolean esCorrecta() {
        return (posicionEsperada == posicionActual);
    }
}