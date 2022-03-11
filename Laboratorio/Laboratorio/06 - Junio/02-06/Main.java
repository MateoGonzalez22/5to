package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Madre madre = new Madre();

        Hijo hijo = new Hijo();
        Hijo hijo1 = new Hijo();
        Hijo hijo2 = new Hijo();

        madre.getHijos().add(hijo);
        madre.getHijos().add(hijo1);
        madre.getHijos().add(hijo2);

        HashSet<Hijo> menores = madre.hijosMenoresDeEdad();

        System.out.println(menores);
    }
}
