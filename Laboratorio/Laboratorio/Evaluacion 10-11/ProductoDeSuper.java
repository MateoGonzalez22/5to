package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class ProductoDeSuper implements Producto{

    private String nombre;
    private String origen;
    private int codigo;
    private float costo;


    public ProductoDeSuper(String nombre, String origen, int codigo, float costo){

        this.nombre = nombre;
        this.origen = origen;
        this.codigo = codigo;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getCosto() {
        return costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
