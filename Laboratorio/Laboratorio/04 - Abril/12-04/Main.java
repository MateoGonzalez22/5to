package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputStrings = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String nombre = inputStrings.nextLine();

        System.out.println("Ingrese edad");
        int edad = inputInt.nextInt();

        System.out.println("Ingrese DNI");
        int DNI = inputInt.nextInt();

        System.out.println("Ingrese direccion");
        String direccion = inputStrings.nextLine();

        System.out.println("Ingrese telefono");
        String telefono = inputStrings.nextLine();

        Persona Persona1 = new Persona(nombre, edad, DNI, direccion, telefono);

        System.out.println("\nNombre: " + Persona1.getNombre());
        System.out.println("Edad: " + Persona1.getEdad());
        System.out.println("DNI: " + Persona1.getDNI());
        System.out.println("Direccion: " + Persona1.getDireccion());
        System.out.println("Telefono: " + Persona1.getTelefono() + "\n");

        System.out.println("Quiere editar algún valor?\n");
        System.out.println("Ingrese 1 para SI \nIngrese cualquier número para un NO\n");

        int edit = inputInt.nextInt();


        if(edit == 1){
            System.out.println("\nQue valor quiere editar");
            String valor = inputStrings.nextLine();

            if(valor.equals("nombre")){
                System.out.println("Ingrese nuevo nombre");
                nombre = inputStrings.nextLine();
                Persona1.setNombre(nombre);
            }
            else if(valor.equals("edad")){
                System.out.println("Ingrese nueva edad");
                edad = inputInt.nextInt();
                Persona1.setEdad(edad);
            }
            else if(valor.equals("DNI")){
                System.out.println("Ingrese nuevo DNI");
                DNI = inputInt.nextInt();
                Persona1.setDNI(DNI);
            }
            else if(valor.equals("direccion")){
                System.out.println("Ingrese nueva direccion");
                direccion = inputStrings.nextLine();
                Persona1.setDireccion(direccion);
            }
            else if(valor.equals("telefono")){
                System.out.println("Ingrese nuevo telefono");
                telefono = inputStrings.nextLine();
                Persona1.setTelefono(telefono);
            }
            else{
                System.out.println(valor);
                System.out.println("Vuelva a ingresar correctamente el valor a editar");
            }

            System.out.println("\nNombre: " + Persona1.getNombre());
            System.out.println("Edad: " + Persona1.getEdad());
            System.out.println("DNI: " + Persona1.getDNI());
            System.out.println("Direccion: " + Persona1.getDireccion());
            System.out.println("Telefono: " + Persona1.getTelefono() + "\n");
        }

    }
}
