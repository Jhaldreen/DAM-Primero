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
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado (String color, double lado) {
        super(color);
        this.lado=lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
    @Override
    public void dibujar() {
         System.out.println("Soy un cuadrado");
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "CUADRADO: "+ super.toString()+" y el lado: "+ lado;
    }
    
    
    
}
