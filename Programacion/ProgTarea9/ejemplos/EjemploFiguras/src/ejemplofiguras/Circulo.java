/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofiguras;

/**
 *
 * @author joaqf
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo (String color, double radio) {
        super(color);
        this.radio=radio;
    }
       
    @Override
    public void dibujar() {
        System.out.println("Soy un círculo");
    }
    
    @Override
    public double area() {
        return Math.PI*radio*radio;
    }
    

    @Override
    public String toString() {
        return "CIRCULO: "+ super.toString()+" y el radio: "+ radio;
    }

}
