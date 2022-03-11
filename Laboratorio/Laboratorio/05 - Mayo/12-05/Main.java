package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Programa1 programa1 = new Programa1();
        Programa2 programa2 = new Programa2();
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 - Ingresar al programa 1");
            System.out.println("2 - Ingresar al programa 2");
            System.out.println("3 - Salir");
            int x = input.nextInt();

            if (x == 1) programa1.iniciarPrograma1();
            else if(x == 2) programa2.iniciarPrograma2();
            else if(x == 3){
                System.out.println("\nbye!");
                break;
            }
            else{
                System.out.println("\nIngrese 1, 2 o 3");
            }
        }
    }
}

