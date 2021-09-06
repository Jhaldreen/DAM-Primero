/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdedatosobjetos;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EjemploModificacion {
    public static void main(String args[]) {
        
        Alumno enc;
        String nomBusc;
        int pos;
        Query consulta;
        ObjectSet result;
        ObjectContainer baseDatos = Db4oEmbedded.openFile("BDAlumEmp");
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("\n\nIndique el nombre del alumno del que quiere cambiar de curso");
        //nomBusc = sc.nextLine();
        
        //result = baseDatos.queryByExample(new Alumno(null, nomBusc, 0));
        result = baseDatos.queryByExample(new Empleado(null, null, 50, 0));
        
        if(result.size() == 0) {
            System.out.println("\n\nNo hay empleados con mas de 50 años");
        } else {
            while(result.hasNext()) {
                //enc = (Alumno)result.next();
               // System.out.println("\n\nLos datos del alumno que queremos cambiar son: ");
               // enc.visualAlumno();
              //  System.out.println("\n\nSe va a proceder a pedir el nombre de curso donde  se va a matricular");
               // enc.pedirCurso();
               // baseDatos.store(enc);
            }
        }
        
        pos = 0;
        System.out.println("\n\nLa base de datos se ha quedado con la siguiente información: ");
        consulta = baseDatos.query();
        consulta.constrain(Alumno.class);
        result = consulta.execute();
        while(result.hasNext()) {
            System.out.println("\n\nDatos del alumno " + (pos + 1) + ": ");
            enc = (Alumno)result.next();
            enc.visualAlumno();
            pos++;
        }
        
        baseDatos.close();
    }
}
