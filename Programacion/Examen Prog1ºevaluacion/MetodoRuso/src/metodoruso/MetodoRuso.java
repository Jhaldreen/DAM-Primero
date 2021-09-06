/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoruso;

import java.util.Scanner;


/**
 *
 * @author Win 7 User
 */
public class MetodoRuso {
   public static void main(String[] args) {

    
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1= sc.nextInt();
        System.out.println("Introduce el segundo número");
        int num2= sc.nextInt();
        
        //System.out.println("La suma por el método recursivo es "+mult_rusa_r(num1,num2));
        System.out.println("La multiplicación por el método ruso es "+mult_rusa_i(num1,num2));
        
    }
    public static int mult_rusa_i(int num1,int num2){
        int suma=0;
        while(num1>=1){
            if (num1%2!=0){
            suma+=num2;
            System.out.println("num1: "+num1+" | num2: "+num2);
            }
            else{
            System.out.println("num1: "+num1+" | num2: "+num2 +" No se suma porque el elemento de A es par");
            }
            num2*=2;//num2=num2*2
            num1=num1/2;
           
        }
        return suma;
         
    
    }
    public static int mult_rusa_r(int A,int B){
    
     if(A==1){
            return (B);
            }
     if(A%2!=0){
            return (B+mult_rusa_r( A/2 , B*2));
            }
    else{
            return(mult_rusa_r( A/2 , B*2));
          }   
    }
}
