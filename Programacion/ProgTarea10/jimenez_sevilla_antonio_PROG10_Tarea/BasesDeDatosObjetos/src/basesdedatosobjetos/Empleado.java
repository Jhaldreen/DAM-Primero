/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdedatosobjetos;

/**
 *
 * @author Antonio
 */
public class Empleado {
    String nombre;
    String estudios;
    int edad;
    int antiguedad;
    
    
    public Empleado(String nom, String estudios, int edad, int antiguedad) {
        this.nombre = nom;
        this.estudios = estudios;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }
    
    void incAntiguedad (int incremento) {
    this.antiguedad += incremento;
        
    }
    
    void visualEmpleado() {
        System.out.println("------------------------------------");
        System.out.println("\n\tNOMBRE: " + nombre);
        System.out.println("\n\tESTUDIOS: " + estudios);
        System.out.println("\n\tEDAD: " + edad);
        System.out.println("\n\tANTIGUEDAD " + antiguedad);
    }
}
