package com.company;

public class Persona2 {

    private String nombre;
    private int edad;
    private int DNI;
    private String direccion;
    private String telefono;

    public Persona2() {

        nombre = "Mateo";
        edad = 27;
        DNI = 43282393;
        direccion = "Argentina 4438";
        telefono = "541135683362";

    }

    public Persona2(String nuevoNombre) {

        nombre = nuevoNombre;
        edad = 27;
        DNI = 43282393;
        direccion = "Argentina 4438";
        telefono = "541135683362";
    }

    public Persona2(String nuevoNombre, int nuevaEdad, int nuevoDNI, String nuevaDireccion, String nuevoTelefono) {

        nombre = nuevoNombre;
        edad = nuevaEdad;
        DNI = nuevoDNI;
        direccion = nuevaDireccion;
        telefono = nuevoTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDNI() {
        return DNI;
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

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean esMayorDeEdad(){
        if (edad>17){
            return true;
        }
        else{
            return false;
        }

        }
    public boolean sonLaMismaPersona(Persona2 p1){
        boolean sonIguales = false;

        if(nombre == p1.getNombre() && edad == p1.getEdad()
                && DNI == p1.getDNI() && telefono==p1.getTelefono() && direccion==p1.getDireccion()){
        sonIguales=true;
        }

        return sonIguales;
    }
    public boolean tienenLaMismaEdad(Persona2 p1){
        boolean mismaEdad = false;

        if(edad == p1.getEdad()){
            mismaEdad=true;
        }
        return mismaEdad;
    }


}
