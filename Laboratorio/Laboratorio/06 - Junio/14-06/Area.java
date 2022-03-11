package com.company;

public class Area {
    static double PI = 3.14159265359;

    static void areaCirculo(double radio){
        double area = PI * radio * radio;
        System.out.println(area);
    }

    static void areaEsfera(double radio){
        double area = 4 * PI * radio * radio;
        System.out.println(area);
    }

    static void areaCuadrado(double lado){
        double area = lado * lado;
        System.out.println(area);
    }

    static void areaCubo(double lado){
        double area = 6 * lado * lado;
        System.out.println(area);
    }

    static void areaTriangulo(double base, double altura){
        double area = base * altura / 2;
        System.out.println(area);
    }
}
