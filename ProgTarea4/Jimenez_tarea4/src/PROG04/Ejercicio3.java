
package PROG04;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double[] precios = {239.99, 129.75, 99.95, 350.89};
        double total = 0;
                int articulosVendidos;
                
        for(int i = 0; i < precios.length; i++){
            System.out.println("Introduzca cuantos elementos de artículo " + (i + 1)
            + " vendió el empleado");
            articulosVendidos = teclado.nextInt();
            total += articulosVendidos * precios[i];    
            
        }
        System.out.println("El total de ventas de sujeto "+total);    
        
       double comision = total * .09 ;
        
        System.out.println("La comision del sujeto es "+comision);
        
        double sueldo =comision + 200;
        
        System.out.println("El sueldo del sujeto es "+sueldo);
        
        
            
            
    }
}

