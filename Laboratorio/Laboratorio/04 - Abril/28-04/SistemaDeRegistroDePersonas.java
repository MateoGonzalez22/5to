package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {
    private ArrayList<Persona> personas;

    SistemaDeRegistroDePersonas() {
        this.personas = new ArrayList<>();
    }

    public void iniciarSistema() {

        System.out.println("\n<<<<<<<<<<<<<< Sistema ABM iniciado >>>>>>>>>>>>>>\n");

        while (true) {
            Scanner intInput = new Scanner(System.in);
            Scanner stringInput = new Scanner(System.in);

            System.out.println("\n\n\n--------------------------------------------------");
            System.out.println("\n1 - Realizar el alta de una persona");
            System.out.println("2 - Realizar la baja de una persona");
            System.out.println("3 - Realizar la modificacion de una persona");
            System.out.println("4 - Ver nombres de personas mayores a 18 años");
            System.out.println("5 - Ver listado de todas las personas registradas");
            System.out.println("6 - Salir del Sistema ABM\n");
            System.out.println("¿Que desea realizar?\n");
            int eleccion = intInput.nextInt();

            if (eleccion == 1) this.registrarPersona();
            else if (eleccion == 2) this.eliminarPersona();
            else if (eleccion == 3) this.modificarPersona();
            else if (eleccion == 4) this.mayores18();
            else if (eleccion == 5) this.verListado();
            else if (eleccion == 6) {System.out.println("bye!"); break;}
        }
    }


    public void registrarPersona() {
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        System.out.println("\n<<<<<<<<<<<<<< Nuevo registro de persona >>>>>>>>>>>>>>\n");
        System.out.println("\nIngrese el nombre: ");
        String nombre = stringInput.next();
        System.out.println("\nIngrese la edad: ");
        int edad = intInput.nextInt();
        System.out.println("\nIngrese el DNI: ");
        int dni = intInput.nextInt();
        System.out.println("\nIngrese la dirección");
        String direccion = stringInput.next();
        System.out.println("\nIngrese el teléfono");
        String telefono = stringInput.next();

        Persona nuevaPersona = new Persona(nombre, edad, dni, direccion, telefono);
        personas.add(nuevaPersona);
    }


    public void eliminarPersona() {
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        System.out.println("\nIngrese dni de la persona: ");
        int dniInput = intInput.nextInt();

        for (int i = 0; i < this.personas.size(); i++) {
            int dni = this.personas.get(i).getDni();
            if (dni == dniInput) {
                personas.remove(i);
            }
        }
    }


    public void modificarPersona() {
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        while (true) {

            boolean dniExiste = false;
            int posPersona = 0;
            int personaActual = 0;

            System.out.println("\n\nIngrese el DNI de la persona que quiere modificar: ");
            System.out.println("Para salir, ingrese <1>");
            int dniInput = intInput.nextInt();

            if (dniInput == 1) {
                break;
            } else {

                for (int i = 0; i < this.personas.size(); i++) {
                    int dni = this.personas.get(i).getDni();
                    if (dniInput == dni) {
                        posPersona = i;
                        dniExiste = true;
                    }
                }
                if (!dniExiste) {
                    System.out.println("\n\nEl DNI que ingreso no existe");
                    break;
                }

                System.out.println("\n\nIngrese el dato que desea modificar(nombre, edad, dni, direccion, telefono) ");
                System.out.println("Para salir ingrese <1>");
                String input = stringInput.nextLine();
                System.out.println("\n");


                switch (input) {
                    case "nombre" -> {
                        System.out.println("Ingrese el nuevo nombre: ");
                        String nuevoNombre = stringInput.nextLine();
                        this.personas.get(posPersona).setNombre(nuevoNombre);
                    }
                    case "edad" -> {
                        System.out.println("Ingrese la nueva edad: ");
                        int nuevaEdad = intInput.nextInt();
                        this.personas.get(posPersona).setEdad(nuevaEdad);
                    }
                    case "dni" -> {
                        System.out.println("Ingrese el nuevo dni: ");
                        int nuevoDni = intInput.nextInt();
                        this.personas.get(posPersona).setDni(nuevoDni);
                    }
                    case "direccion" -> {
                        System.out.println("Ingrese la nueva direccion: ");
                        String nuevaDireccion = stringInput.nextLine();
                        this.personas.get(posPersona).setDireccion(nuevaDireccion);
                    }
                    case "telefono" -> {
                        System.out.println("Ingrese nuevo telefono: ");
                        String nuevoTelefono = stringInput.nextLine();
                        this.personas.get(posPersona).setTelefono(nuevoTelefono);
                    }
                    case "1" -> System.out.println("Modificación de persona cancelada!");
                }

                System.out.println("\nDatos de persona: \n");
                this.personas.get(posPersona).printDatos();
                }
            }
        }


    public void mayores18() {

        System.out.println("\n\n\n<<<<<<<<<<<<<< Personas mayores a 18 >>>>>>>>>>>>>>\n");

        for (Persona persona : this.personas) {
            int mayor18 = persona.getEdad();
            if (mayor18 >= 18) {
                String nombre = persona.getNombre();
                System.out.println("\n- " + nombre);
            }
        }
    }


    public void verListado() {

        System.out.println("\n\n\n<<<<<<<<<<<<<< Personas registradas >>>>>>>>>>>>>>\n");

        for (Persona persona : this.personas) {
            String nombres = persona.getNombre();
            System.out.println("\n- " + nombres);
        }
    }
}
