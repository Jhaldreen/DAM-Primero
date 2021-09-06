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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número entre 1 y 10");
        int numero= sc.nextInt();
        String respuesta= (numero%3==0)?"Es múltiplo de 3":"No es múltiplo de 3";
        System.out.println(respuesta);
    }
    
}
