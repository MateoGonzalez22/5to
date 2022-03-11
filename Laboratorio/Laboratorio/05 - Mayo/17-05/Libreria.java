package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Libreria {

    private HashMap<String, Integer> hashVendidos;
    private ArrayList<Libro> arrVendidos;
    private ArrayList<String> editoriales;

    public Libreria(){

        this.hashVendidos = new HashMap<>();
        this.arrVendidos = new ArrayList<>();
        this.editoriales = new ArrayList<>();

        hashVendidos.put("Kapelusz", 0);
        hashVendidos.put("Sudamericana", 0);
        hashVendidos.put("Atlántida", 0);
        hashVendidos.put("ElAteneo", 0);
        hashVendidos.put("Interzona", 0);
        hashVendidos.put("Sur", 0);
        hashVendidos.put("Alianza", 0);

    }

    public void comprarLibro(ArrayList<Libro> libros) {

        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        System.out.println("\n----------------------------------------");
        System.out.println("\nLibros en venta: \n");


        for (Libro libro : libros) {
            String nombre = libro.getNombre();
            float precio = libro.getPrecio();
            String editorial = libro.getEditorial();

            for (int i = 0; nombre.length() < 25; i++) {
                nombre = nombre + " ";
            }

            System.out.print("Libro: " + nombre);
            System.out.print("          Precio: " + precio);
            System.out.println("          Editorial: " + editorial);
        }
        boolean existe = false;
        System.out.println("\n\nIngrese el nombre del libro que quiere comprar: ");
        String input = stringInput.nextLine();
        for (Libro libro : libros) {
            String nombreLibro = libro.getNombre();

            if (input.equals(nombreLibro)){

                String nombre = libro.getNombre();
                float precio = libro.getPrecio();
                String editorial = libro.getEditorial();

                arrVendidos.add(libro);
                int cant = hashVendidos.get(editorial);
                hashVendidos.put(editorial, cant + 1);
                existe = true;
                System.out.println("\nLibro comprado con exito!\n");

            }
        }

        if (!existe){
            System.out.println("\nEl libro que ingreso no existe");
        }
    }

    public void verVentas(){

        System.out.println("\n----------------------------------------");
        System.out.println("\nLibros vendidos: ");

        for (Libro libro : arrVendidos) {
            String nombre = libro.getNombre();
            float precio = libro.getPrecio();
            String editorial = libro.getEditorial();

            for (int i = 0; nombre.length() < 25; i++) {
                nombre = nombre + " ";
            }

            System.out.println("Libro: " + nombre + "        Precio: $" + precio + "                    Editorial: " + editorial);
        }

    }


    public void verEditorialConMasVentas(){

        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        System.out.println("\n----------------------------------------");
        System.out.println("\nVentas en el dia según editorial: \n");

        System.out.println("En el dia, la editorial Kapelusz vendió " + hashVendidos.get("Kapelusz") + " libros");
        System.out.println("En el dia, la editorial Sudamericana vendió " + hashVendidos.get("Sudamericana") + " libros");
        System.out.println("En el dia, la editorial Atlántida vendió " + hashVendidos.get("Atlántida") + " libros");
        System.out.println("En el dia, la editorial ElAteneo vendió " + hashVendidos.get("ElAteneo") + " libros");
        System.out.println("En el dia, la editorial Interzona vendió " + hashVendidos.get("Interzona") + " libros");
        System.out.println("En el dia, la editorial Sur vendió " + hashVendidos.get("Sur") + " libros");
        System.out.println("En el dia, la editorial Alianza vendió " + hashVendidos.get("Alianza") + " libros");

    }
}
