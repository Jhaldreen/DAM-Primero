/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

import java.util.Scanner;

/**
 *
 * @author adlpr
 */
public class Joven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean jasp=true;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la edad del sujeto");
        int edad= sc.nextInt();
        jasp=(edad>28)?false:true;
        System.out.println("Introduce el nivel de estudios del sujeto (de 1 a 5");
        int nivel = sc.nextInt();
        jasp=(nivel<3)?false:true;
        System.out.println("Introduce el salario del sujeto");
        int salario= sc.nextInt();
        jasp=(salario<28000)?false:true;
        System.out.println("¿Está el joven sobradamente preparado?");
        String respuesta=(jasp)?"Verdadero":"Falso";
        System.out.println(respuesta);
    }
    
}
