package com.company;

public class Libro {

    private String nombre;
    private float precio;
    private String editorial;


    public Libro(String nombre, float precio, String editorial){

        this.nombre = nombre;
        this.precio = precio;
        this.editorial = editorial;

    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
