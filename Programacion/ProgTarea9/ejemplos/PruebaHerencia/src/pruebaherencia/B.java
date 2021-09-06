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
public class B extends A{
    
    private int c;
    
    public void metodoB () {
        //Error porque vara es privado
        System.out.println(vara);
        //Se puede acceder al contenido de vara mediante el método get
        System.out.println(getVara());
    }
    
}
