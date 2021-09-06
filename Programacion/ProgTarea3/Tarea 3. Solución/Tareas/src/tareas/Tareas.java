/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

/**
 *
 * @author alfredo
 */
public class Tareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tarea t= new Tarea();
        t.setPrioridad(5);
        t.aumentarPrioridad();
        System.out.println("La prioridad es " +t.getPrioridad() );
        t.setPrioridad(10);
        t.aumentarPrioridad();
            System.out.println("La prioridad es " +t.getPrioridad() );
        t.setDescripcion("Tarea nueva");
        System.out.println("La descripción de la tarea es "+ t.getDescripcion());

    }
    
}
