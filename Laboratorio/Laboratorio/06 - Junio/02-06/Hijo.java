package com.company;

public class Hijo extends Persona{

    private String escuela;
    private String juegoFavorito;


    public Hijo(){
        super();
        this.escuela = "Tomas Devoto";
        this.juegoFavorito = "Minecraft";
    }

    public Hijo(String nombre, int edad, int dni, String direccion, String telefono, String escuela, String juegoFavorito){
        super(nombre, edad, dni, direccion, telefono);
        this.escuela = escuela;
        this.juegoFavorito = juegoFavorito;

    }
}
