/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROG04;


import java.util.Scanner;

/**
 *
 * @author jhaldreen
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);  
       
       String contrasegna, contrasegna2;
              do{
               System.out.println("introduce la contraseña");
               contrasegna = teclado.nextLine();
               
               
               System.out.println("introduce la contraseña");
               contrasegna2 = teclado.nextLine();
               
        if(contrasegna.equals(contrasegna2)) {
               System.out.println("Son iguales");
        }
        else {
            System.out.println("Vuelve a introducir la contraseña");
        }
    }  while (!contrasegna.equals(contrasegna2)) ;   
    }
    
}



