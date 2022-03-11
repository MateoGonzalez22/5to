package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alumno extends Persona {

    private String curso;
    private HashMap<String,ArrayList<Float>> notasPorMateria;



    public Alumno() {
        super();
        this.curso = "3C";
        this.notasPorMateria = new HashMap<>();
    }

    public Alumno(String nombre, int edad, int dni, String direccion, String telefono, String curso, HashMap<String, ArrayList<Float>> notasPorMateria) {
        super(nombre, edad, dni, direccion, telefono);
        this.curso = curso;
        this.notasPorMateria = new HashMap<>();
    }



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public HashMap<String, ArrayList<Float>> getNotasPorMateria() {
        return notasPorMateria;
    }

    public void setNotasPorMateria(HashMap<String, ArrayList<Float>> notasPorMateria) {
        this.notasPorMateria = notasPorMateria;
    }



    public void agregarNota() {

        ArrayList<Float> notas = new ArrayList<>();

        Scanner stringInput = new Scanner(System.in);
        Scanner floatInput = new Scanner(System.in);

        System.out.println("\n<<Agregar nota>>");

        System.out.println("\nPara terminar ingrese < x >");
        System.out.println("\nIngrese la materia: ");
        String materia = stringInput.next();

        boolean existe = false;
        for (String i : notasPorMateria.keySet()) {

            if (i.equals(materia)) {

                System.out.println("\nIngrese una nota: ");
                float nota = floatInput.nextFloat();

                existe = true;
                notas = notasPorMateria.get(materia);
                notas.add(nota);
                System.out.println("\nNotas de " + materia + ": " + notas + "\n");
                notasPorMateria.put(materia, new ArrayList<>(notas));
            }
        }

        if (!existe) {
            System.out.println("\nLa materia que ingreso no existe!");
            System.out.println("Agregue la materia en la sección <Agregar Materia>");
        }
    }


    public void menorNota(){

        ArrayList<Float> notas = new ArrayList<>();

        ArrayList<Float> arrMenorNota = new ArrayList<>();

        Scanner stringInput = new Scanner(System.in);
        Scanner floatInput = new Scanner(System.in);

        System.out.println("\nIngrese materia: ");
        String materia = stringInput.next();

        boolean existe = false;
        float menor = 100;

        for (String i : notasPorMateria.keySet()) {

            if (i.equals(materia)) {
                existe = true;
                notas = notasPorMateria.get(materia);
                System.out.println("\nNotas" + notas + "\n");

                for (Float nota : notas) {
                    if (nota < menor){
                        menor = nota;
                    }
                }
            }
        }
        if (!existe){
            System.out.println("\nLa materia que ingreso no existe");
        }
        if (existe){
            System.out.println("Menor nota: " + menor);
        }
    }


    public void mayorNota(){
        ArrayList<Float> notas = new ArrayList<>();
        Scanner stringInput = new Scanner(System.in);
        Scanner floatInput = new Scanner(System.in);

        ArrayList<Float> arrMayorNota = new ArrayList<>();

        System.out.println("\nIngrese materia: ");
        String materia = stringInput.next();

        boolean existe = false;
        float mayor = -100;



        for (String i : notasPorMateria.keySet()) {

            if (i.equals(materia)) {
                existe = true;
                notas = notasPorMateria.get(materia);
                System.out.println("\nNotas" + notas + "\n");

                for (Float nota : notas) {
                    if (nota > mayor){
                        mayor = nota;
                    }
                }
            }
        }
        if (!existe){
            System.out.println("\nLa materia que ingreso no existe");
        }
        if (existe){
            System.out.println("Mayor nota: " + mayor + "\n\n");
        }
    }

    public void promedioNotas(){
        ArrayList<Float> notas = new ArrayList<>();

        Scanner stringInput = new Scanner(System.in);

        System.out.println("\nIngrese la materia: ");
        String materia = stringInput.nextLine();

        for (String i : notasPorMateria.keySet()) {

            if (i.equals(materia)){

                notas = notasPorMateria.get(materia);
                int x = 0;
                float promedio = 0;
                for (Float nota : notas) {
                    promedio = promedio + nota;
                    x = x + 1;
                }
                promedio = promedio / x;
                System.out.println("\nEl promedio de las notas de " + materia + " es: " + promedio + "\n");
            }
        }
    }

    public void agregarMateria(String nombreDeMateria){

        Scanner stringInput = new Scanner(System.in);
        Scanner floatInput = new Scanner(System.in);

        String materia = nombreDeMateria;

        boolean yaExistia = false;

        for (String i : notasPorMateria.keySet()) {

            if (i.equals(materia)){
                yaExistia = true;
                break;
            }
        }

        if (yaExistia){
            System.out.println("\nLa materia <" + materia + "> ya existe!");
            System.out.println("Puede agregarle notas en la seccion <Agregar Notas>");
        }
        else{
            notasPorMateria.put(materia, new ArrayList<>());
            System.out.println("\nMateria agregada con exito!\n\n");
        }

    }

}

