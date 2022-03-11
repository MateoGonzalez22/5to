package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SistemaDeRegistro sistema = new SistemaDeRegistro();

        Scanner stringInput = new Scanner(System.in);
        Scanner floatInput = new Scanner(System.in);


        while (true){
            System.out.println("Desea ingresar un producto? 1: Si   2: No");
            float enter = floatInput.nextFloat();

            if (enter != 1) {
                sistema.importeTotal();
                break;
            }
            System.out.println("Ingrese un producto: ");
            String nombre = stringInput.nextLine();
            System.out.println("Ingrese su precio: ");
            float precio = floatInput.nextFloat();
            Producto producto = new Producto(nombre, precio);

            sistema.registarProducto(producto);
            sistema.importeParcial();


        }



    }
}
