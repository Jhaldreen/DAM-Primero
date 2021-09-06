/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoconan;

/**
 *
 * @author adlpr
 */
public class JuegoConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Introducción I1= new Introducción();
        System.out.println(I1.getCadena());
        System.out.println("");
        System.out.println("");
        Jugador j1= new Jugador();
        j1.mostrarEstado();
        Jugador j2= new Jugador("Thoth-Amon");
        j2.mostrarEstado();
        
        System.out.println("Conan ataca");
        j1.atacar(j2);
        System.out.println("Sacamos el estado actual de ambos contendientes");
        j1.mostrarEstado();
        j2.mostrarEstado();
        System.out.println("Thoth-Amon utiliza un escudo para salvarse de la siguiente acometida de Conan");
        j2.setDefensa(true);
        System.out.println("Vemos su estado actual");
        j2.mostrarEstado();
        System.out.println("Conan vuelve a atacar");
        j1.atacar(j2);
        System.out.println("Volvemos a sacar por pantalla el estado de ambos contendientes");
        j1.mostrarEstado();
        j2.mostrarEstado();
    }
    
}
