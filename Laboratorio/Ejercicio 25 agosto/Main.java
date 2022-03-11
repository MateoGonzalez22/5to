package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Persona Persona1 = new Persona("Mateo", "Gonzalez", "4433223344", "18");
        Persona Persona2 = new Persona("Luca", "Trias", "443444655", "18");
        Persona Persona3 = new Persona("Rami", "Moyi", "4433254444", "18");

        ArrayList <Persona> personas = new ArrayList<>();
        personas.add(Persona1);
        personas.add(Persona2);
        personas.add(Persona3);

        HashSet<String> hashSet = new HashSet<>();
        HashMap <String, String> hashMap = new HashMap<>();

        for (Persona i: personas){
            hashSet.add(i.getApellido());
            hashMap.put(i.getDni(), i.getEdad());
        }
    }
}
