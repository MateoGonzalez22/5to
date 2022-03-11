package com.company;

public class Usuario {
    private String nombre;
    private float precioTotal;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.precioTotal = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
}
