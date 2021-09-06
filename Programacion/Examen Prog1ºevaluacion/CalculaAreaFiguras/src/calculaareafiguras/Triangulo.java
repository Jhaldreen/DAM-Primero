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
public class Triangulo extends Figura {
    double lado1,lado2,lado3;
    public Triangulo(double lado1, double lado2, double lado3) {
        super("Triángulo");
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            System.out.println("Esto no es un triángulo");
        }
    }

    @Override
    public double CalculaArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.pow(s * (s - lado1) * (s - lado2) * (s - lado3), 0.5);
        return area;
    }

    public String getNombre() {
        return nombre;
    }

}
