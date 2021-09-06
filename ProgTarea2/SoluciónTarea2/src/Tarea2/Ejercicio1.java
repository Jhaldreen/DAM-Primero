/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

import java.util.*;

/**
 *
 * @author adlpr
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.print("\nIntroduce el primer número: ");
        double x=sc.nextDouble();
        System.out.print("\nIntroduce el segundo número: ");
        double y=sc.nextDouble();
        System.out.print("x = "+ x+","+"y = "+y);
        System.out.println("x + y = "+(x+y));
        System.out.println("x - y = "+(x-y));
        System.out.println("x * y = "+(x*y));
        System.out.println("x / y = "+(x/y));
        System.out.println("x^2   = "+(Math.pow(x,2)));
        System.out.println("√x    = "+(Math.sqrt(x)));
    
    
    }
    
}
