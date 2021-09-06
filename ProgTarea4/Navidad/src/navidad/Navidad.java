/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navidad;

/**
 *
 * @author alfredo
 */
public class Navidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0;i<=19;i++){
            if (i%2!=0){
            for (int j=9;j>i/2;j--){
            System.out.print(" ");}
            for (int k=0;k<i;k++){ 
            System.out.print("*");
            }
            
            System.out.println("");
        }
        }
        for(int i=0;i<4;i++)
            System.out.println("         *");
        for(int i=0;i<20;i++)
            System.out.print("*");
    System.out.println("\n* ¡FELIZ NAVIDAD!  *");    
    for(int i=0;i<20;i++)
            System.out.print("*");    
    System.out.println("");    
    }
    }
    

