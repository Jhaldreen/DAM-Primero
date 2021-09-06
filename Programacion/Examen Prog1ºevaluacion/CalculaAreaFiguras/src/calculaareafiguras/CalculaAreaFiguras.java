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
public class CalculaAreaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo t = new Triangulo(5, 4, 3);
        System.out.println(t.getNombre());
        System.out.println("El área es " + t.CalculaArea());

        Circulo c = new Circulo(1.0);
        System.out.println(c.getNombre());
        System.out.println("El área es " + c.CalculaArea());

        Cuadrado c2 = new Cuadrado(2.0);
        System.out.println(c2.getNombre());
        System.out.println("El área es " + c2.CalculaArea());
    }

}
