/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Facturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         Scanner teclado=new Scanner(System.in);
        int opcion;
      
        
        File f=new File("misFacturasV.dat");
        do{
            System.out.println("1.- Añadir factura");
           System.out.println("2.- Listado morosos");
           System.out.println("3.- Eliminar todo el archivo");
           System.out.println("4.- Salir");
            System.out.println("\t pulse opcion");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    Facturacion.grabar(f);
                    break;
                 case 2:
                    Facturacion.morosos(f);
                    break;
                 case 3:
                     Facturacion.borrar(f);
                    break;
                  case 4:
                    break;
                  default:
                      System.out.println("opcion erronea");
            }
        }while(opcion!=4);
            
            
}
}