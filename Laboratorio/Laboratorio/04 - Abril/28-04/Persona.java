package com.company;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private String direccion;
    private String telefono;

    public Persona(String nombre, int edad, int dni, String direccion, String telefono){

        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void printDatos(){
        System.out.println(this.getNombre());
        System.out.println(this.getEdad());
        System.out.println(this.getDni());
        System.out.println(this.getDireccion());
        System.out.println(this.getTelefono());
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
