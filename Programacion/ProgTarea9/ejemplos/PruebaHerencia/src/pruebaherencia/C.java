/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaherencia;

/**
 *
 * @author joaqf
 */
//Clase que está en el mismo paquete que A pero no hereda de A
public class C {
    
    
    public void metodoC() {
        A claseA= new A();
        //Tiene acceso a la variable varb que es protegida porque C está en el mismo paquete
        System.out.println(claseA.varb);
    }
    
}
