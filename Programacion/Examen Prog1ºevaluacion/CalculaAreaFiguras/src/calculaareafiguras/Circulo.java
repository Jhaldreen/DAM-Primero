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
public class Circulo extends Figura {
    double radio;
    public Circulo(Double r){         
    super("Círculo");
    this.radio=r;}
    @Override
    public double CalculaArea() {
        double area= Math.PI*(Math.pow(radio, 2));
        return area;
    }
      public String getNombre(){return nombre;}
}
