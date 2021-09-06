
package PROG04;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        boolean[] arrayDeBooleanos = new boolean[4];
        
    arrayDeBooleanos[0]=true;   
    arrayDeBooleanos[1]=false;
    arrayDeBooleanos[2]=true;  
    arrayDeBooleanos[3]=false; 
    String respuesta;
    
System.out.println("\"Una variable es un espacio de almacenamiento en memoria, "
        + "cuyo contenido puede cambiar a lo largo de la ejecución del programa"
        + "V/F ");
        respuesta = teclado.next();
        System.out.println("Una estructura iterativa es aquella que nos permite"
                + " elegir entre dos o mas opciones ");
        respuesta = teclado.next();
        System.out.println("Una estructura selectiva es aquella que nos permite"
                + " elegir entre dos o mas opciones ");
        respuesta = teclado.next();
        System.out.println("las estructuras while y do-while son equivalentes ");
        respuesta = teclado.next();

    for(int i=0; i < 4; i++)
    {
      System.out.println("la respuesta a la pregunta "+ (i + 1) + " ha sido " + arrayDeBooleanos[i]);
 
   }
    }
}
