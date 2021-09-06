/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;


/**
 *
 * @author adlpr
 */
import java.util.Scanner;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,aux;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce valor de a: ");
        a=sc.nextInt();
        System.out.println("Introduce valor de b: ");
        b= sc.nextInt();
        System.out.println("Ahora a vale "+a);
        System.out.println("Ahora b vale "+b);
        System.out.println("Intercambiamos valores ");
        aux=a;
        a=b;
        b=aux;
        System.out.println("Ahora a vale "+a);
        System.out.println("Ahora b vale "+b);
        
        
        
    }
    
}
