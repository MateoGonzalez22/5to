package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Programa2 {

    public void iniciarPrograma2(){

        Scanner input = new Scanner(System.in);
        HashSet<Integer> numHash1 = new HashSet<>();
        HashSet<Integer> numHash2 = new HashSet<>();
        ArrayList<Integer> numArr1 = new ArrayList<>();
        ArrayList<Integer> numArr2 = new ArrayList<>();

        System.out.println("\nIngrese numeros enteros para el 1er Array: Para salir ingrese <s>");

        while (true){

            if (input.hasNextInt()){
                numArr1.add(input.nextInt());
            }
            else if (input.hasNextFloat()){
                float fl = input.nextFloat();
                System.out.println("Ingrese números enteros");
            }
            else if(input.hasNext()){
                String s = input.nextLine();
                if (input.next().equals("s")){
                    break;
                }
            }
        }
        System.out.println("\nPrimer Array: " + numArr1);

        for (Integer num : numArr1) {
            numHash1.add(num);
        }

        System.out.println("\nIngrese numeros enteros para el 2ndo Array: Para salir ingrese <s>");

        while (true){

            if (input.hasNextInt()){
                numArr2.add(input.nextInt());
            }
            else if (input.hasNextFloat()){
                float fl = input.nextFloat();
                System.out.println("Ingrese números enteros");
            }
            else if(input.hasNext()){
                String s = input.nextLine();
                if (input.next().equals("s")){
                    break;
                }
            }
        }
        System.out.println("\nSegundo Array: " + numArr2);

        for (Integer num : numArr2) {
            numHash2.add(num);
        }

        if (numHash1.equals(numHash2)){
            System.out.println("\nAmbos HashSet tienen los mismos elementos");
        }
        else{
            System.out.println("\nLos HashSets NO contienen los mismos elementos");
        }
    }
}
