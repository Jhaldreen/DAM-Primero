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
public class Cuadrado extends Figura{
    double lado;
    public Cuadrado(Double lado){
        super("Cuadrado");
        this.lado=lado;
    }
     public double CalculaArea() {
 
        double area = Math.pow(lado,2);
        return area;
    }
    public String getNombre(){return nombre;}
}
