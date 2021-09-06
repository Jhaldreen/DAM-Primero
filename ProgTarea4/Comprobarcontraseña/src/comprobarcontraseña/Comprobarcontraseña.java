/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobarcontraseña;

/**
 *
 * @author alfredo
 */
import java.util.*;
public class Comprobarcontraseña {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        String cadena1;
        String cadena2;
        Boolean correcta=false;
        while(!correcta){
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce contraseña");
        cadena1=sc.nextLine();
        System.out.println("Introduce de nuevo la contraseña");
        cadena2=sc.nextLine();
        if(cadena1.equals(cadena2)){
            correcta=true;}
        else{System.out.println("Las contraseñas no coinciden. No se procede al cambio de contraseña");}
        }
           System.out.println("Las contraseñas coinciden. se procede al cambio de contraseña");
    }
    
}
