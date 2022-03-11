package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Programa1 {

    public void iniciarPrograma1() {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numArr = new ArrayList<Integer>();

        System.out.println("\nIngrese numeros enteros: s para salir\n");

        while (true) {

            if (input.hasNextInt()) {
                numArr.add(input.nextInt());
            }
            else if (input.hasNextFloat()) {
                float fl = input.nextFloat();
                System.out.println("Ingrese números enteros");
            }
            else if (input.hasNext()) {
                String s = input.nextLine();
                if (input.next().equals("s")) {
                    break;
                }
            }
        }
        System.out.println("\nArray que ingreso el ususario: " + numArr);

        HashSet<Integer> numHash = new HashSet<Integer>();

        for (Integer num : numArr) {
            numHash.add(num);
        }

        System.out.println("\nArray sin repeticiones: " + numHash);
    }
}