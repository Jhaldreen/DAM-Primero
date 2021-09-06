/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistas;

public class Candidato {

    private String nombre;
    private int edad;

    public Candidato(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Candidato() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return this.nombre + "   " + this.edad;

    }
}
