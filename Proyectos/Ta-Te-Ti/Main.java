package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Inicio inicio = new Inicio();

        /*String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (int i = 0; i < fonts.length; i++) {
            System.out.println(fonts[i]);
        }*/


        /*String[][] arr = new String[3][3];


        arr[0][0] = "○";
        arr[0][1] = "○";
        arr[0][2] = "○";

        arr[1][0] = "○";
        arr[1][1] = "X";
        arr[1][2] = "X";

        arr[2][0] = "X";
        arr[2][1] = "X";
        arr[2][2] = "X";


        int a = 0;
        int b = 1;
        int c = 2;
        int count = 0;
        int d = 0;
        int e = 0;

        //1- HORIZONTAL     2- VERTICAL     3-DIAGONALES

        for (int i = 0; i < 6; i++) {

            if (count == 3){i = 0; b = 0; c = 0; d = 1; e = 2;}
            else if(count == 4){i = 0; a = 1; b = 1; c = 1;}
            else if(count == 5){i = 0; a = 2; b = 2; c = 2;}
            else if (count == 6){i = 0; a = 0; b = 1;}
            else if(count == 7){i = 2; b = 1; c = 2; d = -1; e = -2;}
            else if (count == 8){break;}

            if(Objects.equals(arr[i][a], arr[i+d][b]) && Objects.equals(arr[i][a], arr[i+e][c])){

                System.out.println("Gano");
                if (Objects.equals(arr[i][a], "X") || Objects.equals(arr[i][a], "○")){

                }
                else{

                }

            }else{
                System.out.println("No gano");
            }
            count ++;

        }
        
        
        

        System.out.println(Arrays.deepToString(arr));*/
    }
}
