package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistro {
    private ArrayList<Producto> prods;

    public SistemaDeRegistro(){
        this.prods = new ArrayList<Producto>();


    }


    public void registarProducto(Producto producto){
        this.prods.add(producto);

    }

    public void importeParcial(){
        float parcial = 0;

        for (Producto producto: prods){

            parcial = parcial + producto.getPrecio();

        }
        System.out.println("Importe parcial: $" + parcial);

    }

    public void importeTotal(){

        float total = 0;

        for (Producto producto: prods){

            total = total + producto.getPrecio();

        }
        System.out.println("El importe total es de: $" + total);
    }
}
