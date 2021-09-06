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
public class Triangulo extends Figura{
    private double base;
    private double altura;
    
    public Triangulo (String color, double base, double altura) {
        super(color);
        this.base=base;
        this.altura=altura;
    }
    
    @Override
    public void dibujar() {
         System.out.println("Soy un cuadrado");
    }

    @Override
    public double area() {
        return (base*altura)/2.0;
    }

    @Override
    public String toString() {
        return "TRIÁNGULO: "+ super.toString()+" la base: "+ base + " y la altura: "+ altura;
    }
    
    
    
}
