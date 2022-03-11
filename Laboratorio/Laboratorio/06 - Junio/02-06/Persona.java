package com.company;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private String direccion;
    private String telefono;

    public Persona() {

        nombre = "Mateo";
        edad = 15;
        dni = 43282393;
        direccion = "Argentina 4438";
        telefono = "541135683362";

    }


    public Persona(String nombre, int edad, int dni, String direccion, String telefono) {

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDNI() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int DNI) {
        this.dni = DNI;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}


