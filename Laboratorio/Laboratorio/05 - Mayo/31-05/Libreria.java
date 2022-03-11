package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Libreria {

    private HashMap<String, Integer> hashVendidos;
    private ArrayList<Libro> arrVendidos;
    private ArrayList<String> editoriales;
    private HashSet<String> editorialesConDescuento;

    public Libreria() {

        this.hashVendidos = new HashMap<>();
        this.arrVendidos = new ArrayList<>();
        this.editoriales = new ArrayList<>();
        this.editorialesConDescuento = new HashSet<>();

        hashVendidos.put("Kapelusz", 0);
        hashVendidos.put("Sudamericana", 0);
        hashVendidos.put("Atlántida", 0);
        hashVendidos.put("ElAteneo", 0);
        hashVendidos.put("Interzona", 0);
        hashVendidos.put("Sur", 0);
        hashVendidos.put("Alianza", 0);

    }

    public void comprarLibro(ArrayList<Libro> libros, Usuario usuario, HashSet<Usuario> usuarios) {

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

            if (input.equals(nombreLibro)) {
                String nombre = libro.getNombre();
                float precio = libro.getPrecio();
                String editorial = libro.getEditorial();

                for (String i : editorialesConDescuento) {
                    if (i.equals(editorial)){
                        precio = precio / 2;
                        libro.setPrecio(precio);
                    }
                }

                arrVendidos.add(libro);
                int cant = hashVendidos.get(editorial);
                hashVendidos.put(editorial, cant + 1);
                existe = true;
                System.out.println("\nLibro comprado con exito!\n");

                for (Usuario usuario1 : usuarios) {
                    if (usuario1.getNombre().equals(usuario.getNombre())) {
                        usuario1.setPrecioTotal(usuario1.getPrecioTotal() + precio);
                    }
                }
            }
        }

        if (!existe) {
            System.out.println("\nEl libro que ingreso no existe");
        }
    }

    public void verVentas() {

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


    public void verEditorialConMasVentas() {

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

    public void comprasDeUsuario(Usuario usuario, HashSet<Usuario> usuarios) {

        System.out.println("\nPrecio total de sus compras: ");

        for (Usuario usuario1 : usuarios) {
            if (usuario1.equals(usuario)) {
                String nombre = usuario1.getNombre();
                float precioTotal = usuario1.getPrecioTotal();

                System.out.println("Usuario: " + nombre + "         Compras Totales: $" + precioTotal);
            }
        }

        System.out.println("\nTodos los clientes: ");

        for (Usuario usuario1 : usuarios) {
            String nombre = usuario1.getNombre();
            float precioTotal = usuario1.getPrecioTotal();

            System.out.println("Usuario: " + nombre + "         Compras Totales: $" + precioTotal);
        }
    }

    public void agregarEditorialesConDescuento() {

        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        if (editorialesConDescuento.isEmpty()) {
            System.out.println("\nNo hay editoriales con descuento!");
        }
        else{
            System.out.println("\nEditoriales con descuento: \n");
            for (String s : editorialesConDescuento) {
                System.out.println(s);

            }
        }
        System.out.println("\nAgregar editoriales con 50% de descuento");
        System.out.println("\nIngrese la editorial: ");

        String input = stringInput.nextLine();

        editorialesConDescuento.add(input);
    }
}
