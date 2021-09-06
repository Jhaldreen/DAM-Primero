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
public abstract class Figura {
    private String color;
    
    public Figura (String color) {
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Método que imprime el color
    @Override
    public String toString() {
        return "color=" + color;
    }
    
    //Toda figura se puede dibujar
    public abstract void dibujar ();
    
    //En toda figura se puede calcular el área
    public abstract double area();
    
    
}
