/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaareafiguras;

/**
 *
 * @author Win 7 User
 */
public abstract class Figura {
    String nombre;
    public abstract double CalculaArea();
    public Figura (String nombre){this.nombre=nombre;}
}
