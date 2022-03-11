package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        HashSet<Usuario> usuarios = new HashSet<>();

        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        Libro libro1 = new Libro("Farenheit 451", 200, "Kapelusz");
        Libro libro2 = new Libro("Crimen y castigo", 300, "Sudamericana");
        Libro libro3 = new Libro("La casa de los espiritus", 450, "Sudamericana");
        Libro libro4 = new Libro("Las almas muertas", 350, "ElAteneo");
        Libro libro5 = new Libro("El principito", 900, "Atlántida");
        Libro libro6 = new Libro("El faro", 550, "Sudamericana");
        Libro libro7 = new Libro("El amanecer", 600, "Interzona");
        Libro libro8 = new Libro("Perdidos", 750, "Sudamericana");
        Libro libro9 = new Libro("Secuestro", 100, "Sur");
        Libro libro10 = new Libro("Argentina", 440, "Alianza");

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        libros.add(libro6);
        libros.add(libro7);
        libros.add(libro8);
        libros.add(libro9);
        libros.add(libro10);

        System.out.println("\n---------- Bienvenido a la Libreria ----------");

        while (true) {
            System.out.println("\n<salir> para cerrar");
            System.out.println("\nIngrese su nombre de usuario: ");
            String usuarioNombre = stringInput.nextLine();

            if (usuarioNombre.equals("salir")){
                System.out.println("\nbye!");
                break;
            }

            Usuario usuario = new Usuario(usuarioNombre);

            System.out.println("<<<<<<Bienvenido " + usuarioNombre + ">>>>>>");

            usuarios.add(usuario);


            while (true) {
                System.out.println("\n--------------------------------------------");
                System.out.println("\n1 - Comprar un Libro");
                System.out.println("2 - Ver libros vendidos");
                System.out.println("3 - Ver editorial con más libros vendidos");
                System.out.println("4 - Ver precios de compras de clientes");
                System.out.println("5 - Agregar editoriales con descuento");
                System.out.println("6 - Salir");
                int input = intInput.nextInt();


                if (input == 1) libreria.comprarLibro(libros, usuario, usuarios);
                else if (input == 2) libreria.verVentas();
                else if (input == 3) libreria.verEditorialConMasVentas();
                else if (input == 4) libreria.comprasDeUsuario(usuario, usuarios);
                else if (input == 5) libreria.agregarEditorialesConDescuento();
                else if (input == 6) {
                    System.out.println("\nbye!");
                    break;
                }
            }
        }
    }
}
