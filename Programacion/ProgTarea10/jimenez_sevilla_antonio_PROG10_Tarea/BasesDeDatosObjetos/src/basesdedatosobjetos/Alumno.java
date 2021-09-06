package basesdedatosobjetos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class Alumno {
    String curso;
    String nombre;
    int edad;

    Alumno(String cur, String nombre, int ed) {
        curso = cur;
        this.nombre = nombre;
        edad = ed;
    }
    
    Alumno() {
        this.pedirCurso();
        this.pedirNombre();
        this.pedirEdad();
    }
    
    void visualAlumno() {
        System.out.println("-------------------------------");
        System.out.println("\n\tCURSO: " + curso);
        System.out.println("\n\tNOMBRE: " + nombre);
        System.out.println("\n\tEDAD: " + edad);
    }
    
    void pedirEdad() {
        Scanner sc = new Scanner (System.in);
        System.out.println("\n\tIndique la edad del alumno");
        edad = sc.nextInt();
    }
    
    void pedirCurso() {
        Scanner sc = new Scanner (System.in);
        System.out.println("\n\tIndique el nombre del curso");
        curso = sc.nextLine();
    }
    
    void pedirNombre() {
        Scanner sc = new Scanner (System.in);
        System.out.println("\n\tIndique el nombre del alumno");
        nombre = sc.nextLine();
    }
    
    void asignarCurso(String cursoEnv) {curso = cursoEnv;}
}
