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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce número de cinco dígitos");
        int numero=sc.nextInt();
        int unidades=numero%10;
        int decenas= ((int)(numero/10))%10;
        int centenas= ((int) (numero/100))%10;
        int unidades_de_millar = ((int) (numero/1000))%10;
        int decenas_de_millar =(int)(numero/10000);
        System.out.println("Unidades: "+unidades);
        System.out.println("decenas: "+decenas);
        System.out.println("centenas: "+centenas);
        System.out.println("unidades de millar: "+unidades_de_millar);
        System.out.println("decenas de millar: "+decenas_de_millar);
        System.out.println(decenas_de_millar+" "+unidades_de_millar+" "+centenas+" "+decenas+" "+unidades);
        
    }
    
}
