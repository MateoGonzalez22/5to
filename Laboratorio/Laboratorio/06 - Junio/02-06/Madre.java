package com.company;

import java.util.HashSet;

public class Madre extends Persona{

    private String empresaTrabajo;
    private HashSet<Hijo> hijos;

    public Madre() {
        super();
        this.empresaTrabajo = "IPM";
        this.hijos = new HashSet<>();
    }

    public Madre(String nombre, int edad, int dni, String direccion, String telefono, String empresaTrabajo, HashSet<Hijo> hijos) {
        super(nombre, edad, dni, direccion, telefono);
        this.empresaTrabajo = empresaTrabajo;
        this.hijos = hijos;
    }

    public String getEmpresaTrabajo() {
        return empresaTrabajo;
    }

    public void setEmpresaTrabajo(String empresaTrabajo) {
        this.empresaTrabajo = empresaTrabajo;
    }

    public HashSet<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(HashSet<Hijo> hijos) {
        this.hijos = hijos;
    }

    public HashSet<Hijo> hijosMenoresDeEdad(){

        HashSet<Hijo> menores = new HashSet<>();

        for (Hijo hijo : hijos) {
            if (hijo.getEdad() <= 17){
                menores.add(hijo);
            }
        }
        return menores;
    }
}
