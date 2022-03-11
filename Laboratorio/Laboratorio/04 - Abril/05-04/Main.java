package com.company;

public class Main {

    public static void main(String[]args){

        Persona2 p1 = new Persona2();
        Persona2 p2 = new Persona2("Tomas");

        p2.setEdad(40);
        p2.setDireccion("Argentina 4487");
        p2.setTelefono("541178986554");
        p2.setDNI(45341452);
        
        Persona2 p3 = new Persona2("Tomas", 40, 45341452, "Argentina 4487", "541178986554");

        System.out.println(p1.esMayorDeEdad());
        System.out.println(p3.sonLaMismaPersona(p2));
    }
}

