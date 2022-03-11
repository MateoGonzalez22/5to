package com.company;

import java.util.ArrayList;
import java.util.Scanner;




public class SistemaDeRegistro {
    private ArrayList<Producto> prods;

    public SistemaDeRegistro() {
        this.prods = new ArrayList<Producto>();

    }


    public void registarProducto() {

        Scanner floatInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        while (true) {
            System.out.println("Desea ingresar un producto? 1: Si   2: No");
            float enter = floatInput.nextFloat();

            if (enter == 2){
                verImporteTotal();
                break;
            }

            System.out.println("\nIngrese nombre del producto: ");
            String nombre = stringInput.nextLine();
            System.out.println("Ingrese precio del producto");
            float precio = floatInput.nextFloat();
            Producto producto = new Producto(nombre, precio);
            prods.add(producto);
            verImporteParcial();
        }
    }

    public void verImporteParcial(){

        float precioParcial = 0;

        for (Producto producto : this.prods){

            precioParcial = precioParcial + producto.getPrecio();
        }

        System.out.println("\nPrecio Parcial: " + precioParcial);
    }

    public void verImporteTotal(){

        float precioTotal = 0;
        System.out.println("\nImporte Total\n");

        for (Producto producto : this.prods){

            System.out.println(producto.getNombre() + "     " + producto.getPrecio());
            precioTotal = precioTotal + producto.getPrecio();
        }

        System.out.println("\nPrecio Total: " + precioTotal);
    }
}