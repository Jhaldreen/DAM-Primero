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
public class A {
    //Sólo puede ser accesible desde la clase A
    private int vara;
    //Atributo protegido accedido desde todas las subclases anunque estén en el mismo paquete
    protected int varb;

    public int getVara() {
        return vara;
    }

    public void setVara(int vara) {
        this.vara = vara;
    }

    public int getVarb() {
        return varb;
    }

    public void setVarb(int varb) {
        this.varb = varb;
    }
    
    
}
