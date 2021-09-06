/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofiguras;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author joaqf
 */
public class EjemploFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Figura f;//Variable polimórfica
       f= new Circulo("Rojo", 3.65);
       //Se llama al método de círculo. La ligadura dinámica en tiempo de ejecución llama al método 
       //correspondiente al guardado en la variable polimórfica
        System.out.println(f.toString());
        //Dibujará un círculo
        f.dibujar();
        //El área del círculo
        System.out.println("El área del círculo es: " + f.area());
        
        LinkedList <Figura> listaFiguras= new LinkedList();
        
        //Añado la figura anterior
        listaFiguras.add(f);
        //Añado más figuras a la lista de figuras
        listaFiguras.add(new Cuadrado("Verde", 23));
        listaFiguras.add(new Triangulo("Azul", 10, 2));
        listaFiguras.add(new Cuadrado("Amarillo", 2));
        listaFiguras.add(new Cuadrado("Azul", 15));
        listaFiguras.add(new Circulo("Morado", 2));
        listaFiguras.add(new Circulo("Verde", 23));
        listaFiguras.add(new Triangulo("Rojo", 4,3.0));
        listaFiguras.add(new Cuadrado("Verde", 23));  
        
        
        Iterator it=listaFiguras.iterator();
        
        //Imprimo las figuras que he guardado anteriormente
        //Como se puede observar es un código muy genérico, si en un futuro se tuviera que añadir
        //al código otra figura este código seguiría funcionando, ya que no tiene if preguntando
        //por qué figura dibujar
        System.out.println("LAS FIGURAS DE LA LISTA SON");
        while (it.hasNext()) {
            Figura figura= (Figura) it.next();
            System.out.println(figura.toString());
        }
       
    }
    
}
