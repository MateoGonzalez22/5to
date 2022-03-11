package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputStrings = new Scanner(System.in);
        Scanner inputFloats = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.println("Desea ingresar un producto?\n1 para SI\n2 para NO");
        int enter = inputInt.nextInt();
        float precioTotal = 0;


        while(enter == 1){

            System.out.println("Ingrese nombre del producto");
            String nombre = inputStrings.nextLine();

            System.out.println("Ingrese precio del producto");
            float precio = inputFloats.nextFloat();
            precioTotal += precio;

            Producto producto = new Producto(nombre, precio);
            System.out.println("\nNombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Precio total hasta el momento: $" + precioTotal);
            System.out.println("\nDesea ingresar un producto?\n1 para SI\n2 para NO");
            int salir = inputInt.nextInt();

            if(salir == 2){
                System.out.println("Importe total a pagar: $" + precioTotal);
                enter++;

            }
        }
    }
}

