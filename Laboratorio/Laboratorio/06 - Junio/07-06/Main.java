package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Alumno alumno = new Alumno();

        Scanner stringInput = new Scanner(System.in);
        Scanner floatInput = new Scanner(System.in);

        System.out.println("--------------- Sistema de Registro de Notas ---------------");

        while(true) {
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("\n1 - Agregar Nota");
            System.out.println("2 - Ver Menor Nota");
            System.out.println("3 - Ver Mayor Nota");
            System.out.println("4 - Ver Promedio de Notas");
            System.out.println("5 - Agregar Materia");
            System.out.println("6 - Salir");

            float input = floatInput.nextFloat();

            if (input == 1) alumno.agregarNota();
            else if (input == 2) alumno.menorNota();
            else if (input == 3) alumno.mayorNota();
            else if (input == 4) alumno.promedioNotas();
            else if (input == 5){
                System.out.println("\n<<Agregar materia>>");
                System.out.println("\nIngrese la materia: ");
                String nombreDeMateria = stringInput.nextLine();
                alumno.agregarMateria(nombreDeMateria);
            }
            else if (input == 6){
                System.out.println("\nbye!");
                break;
            }
        }
    }
}
