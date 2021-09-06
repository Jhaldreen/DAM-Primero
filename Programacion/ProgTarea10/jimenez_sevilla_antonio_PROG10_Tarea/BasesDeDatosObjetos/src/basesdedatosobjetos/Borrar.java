/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdedatosobjetos;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import java.io.File;

/**
 *
 * @author Antonio
 */
public class Borrar {
    public static void main (String args[]) {
        // Vacio primero la base de datos para tener sólo tres objetos que se 
        // van a insertar en dicho ejemplo
        File bd = new File("baseDatos");
        bd.delete();
        
        ObjectContainer baseDatos = Db4oEmbedded.openFile("baseDatos");
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        Alumno a3 = new Alumno();
        
        baseDatos.store(a1);
        baseDatos.store(a2);
        baseDatos.store(a3);
        a3 = a1;
        baseDatos.delete(a1);
        
        baseDatos.close();
        
    }
    
}
