/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesdedatosobjetos;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Query;
import java.io.File;

/**
 *
 * @author jorca
 */
public class BasesdeDatosObjetos {

    public static void main(String[] args) {
        File fichero = new File("BDAlumEmp");
        fichero.delete();

        ObjectContainer baseDatos = Db4oEmbedded.openFile("BDAlumEmp");
        baseDatos.store(new Empleado("Pepe", "Sin estudios", 23, 5));
        baseDatos.store(new Empleado("Juan Luis", "Grado", 53, 25));
        baseDatos.store(new Empleado("Juanjo", "Sin estudios", 62, 5));
        baseDatos.store(new Empleado("Juanjo", "Sin estudios", 62, 5));
        baseDatos.store(new Empleado("Alba", "Sin estudios", 59, 2));
        baseDatos.store(new Empleado("David", "Tecnico Superior", 59, 4));
        baseDatos.store(new Empleado("Paula", "Grado", 59, 16));
        baseDatos.store(new Empleado("Pedro", "Sin estudios", 42, 2)); // añadido
        baseDatos.store(new Empleado("Alberto", "Tecnico Superior", 39, 4)); // añadido

        baseDatos.store(new Alumno("DAM", "Fatima", 23));
        baseDatos.store(new Alumno("DAM", "Miguel", 0));
        baseDatos.store(new Alumno("", "Lidia", 0));
        baseDatos.store(new Alumno("ASIR", "Sergio", 25));
        baseDatos.close();

        ObjectContainer baseDatos9 = Db4oEmbedded.openFile("BDAlumEmp");
        Alumno a9 = new Alumno("DAM", null, 0);
        System.out.println("La información de los alumnos de Dam es: \n");
        ObjectSet result2 = baseDatos9.queryByExample(a9);
        while (result2.hasNext()) {
            a9 = (Alumno) result2.next();
            a9.visualAlumno();
        }
        baseDatos9.close();

        System.out.println("==========================================\n");

        ObjectContainer baseDatos2 = Db4oEmbedded.openFile("BDAlumEmp");
        Alumno a1 = new Alumno("", null, 0);
        // Empleado e1 = new Empleado(null, null, 0, 0);
        System.out.println("Alumnos que no están matriculados en ningún ciclo\n");
        ObjectSet result = baseDatos2.queryByExample(a1);
        while (result.hasNext()) {
            a1 = (Alumno) result.next();
            a1.visualAlumno();
        }
        baseDatos2.close();
 System.out.println("----------------------------------------------\n");
        // En el siguiente ejercicio mostramos todos los empleados que haya en la
        // base de datos que tengan 59 años
        ObjectContainer baseDatos10 = Db4oEmbedded.openFile("BDAlumEmp");
        Empleado e3 = new Empleado(null, null, 59, 0);
        System.out.println("La información de los empleados con 59 años es\n\n");
        ObjectSet result5 = baseDatos10.queryByExample(e3);
        while (result5.hasNext()) {
            e3 = (Empleado) result5.next();
            e3.visualEmpleado();
        }
        baseDatos10.close();
        
        
        System.out.println("=======================================================\n");
        System.out.println("Empleados entre 30 y 45 años \n\n");
        Empleado emplConsultado;
        ObjectSet inforSolic;
        Query todo2;
        ObjectContainer baseDatos5 = Db4oEmbedded.openFile("BDAlumEmp");
        todo2 = baseDatos5.query();
        todo2.constrain(Empleado.class);
        todo2.descend("edad").constrain(30).greater();
        todo2.descend("edad").constrain(45).smaller(); // doble restricción
        inforSolic = todo2.execute();
        while (inforSolic.hasNext()) {
            emplConsultado = (Empleado) inforSolic.next();
            emplConsultado.visualEmpleado();
        }
        baseDatos5.close();
        
        
        System.out.println("=======================================================\n");

        System.out.println("Datos de los empleados que no están entre 30 y 45 años \n");
        Empleado emplConsultado2;
        ObjectSet inforSolic3;
        Query todo3;
        ObjectContainer baseDatos6 = Db4oEmbedded.openFile("BDAlumEmp");
        todo3 = baseDatos6.query();
        todo3.constrain(Empleado.class);
        todo3.descend("edad").constrain(30).greater();
        todo3.descend("edad").constrain(45).smaller().not();
        inforSolic3 = todo3.execute();
        while (inforSolic3.hasNext()) {
            emplConsultado2 = (Empleado) inforSolic3.next();
            emplConsultado2.visualEmpleado();
        }
        baseDatos6.close();

        System.out.println("===============================================================");
        System.out.println("Datos de los empleados que llevan un mínimo de 4 años en la empresa y son técnicos superiores");
        System.out.println("o llevan más de 15 años en la empresa \n");
        Empleado emplConsultado3;
        ObjectSet inforSolic4;
        Query todo4;
        ObjectContainer baseDatos7 = Db4oEmbedded.openFile("BDAlumEmp");
        todo4 = baseDatos7.query();
        todo4.constrain(Empleado.class);
        Constraint segundCond = todo4.descend("antiguedad").constrain(3).greater().and(todo4.descend("estudios").constrain("Tecnico Superior"));
        todo4.descend("antiguedad").constrain(15).greater().or(segundCond);
        inforSolic4 = todo4.execute();
        while (inforSolic4.hasNext()) {
            emplConsultado3 = (Empleado) inforSolic4.next();
            emplConsultado3.visualEmpleado();
        }
        baseDatos7.close();
        
            System.out.println("Empleados que tienen mas de 50 años");
        Empleado emplModificado;
        ObjectSet inforSolic2;
        Query todo12;
        ObjectContainer baseDatos12 = Db4oEmbedded.openFile("BDAlumEmp");
        todo12 = baseDatos12.query();
        todo12.constrain(Empleado.class);
        todo12.descend("edad").constrain(50).greater();
        inforSolic = todo12.execute();
        while (inforSolic.hasNext()) {
            emplModificado = (Empleado)inforSolic.next();
            emplModificado.visualEmpleado();
        }
        
        inforSolic = todo12.execute();
        System.out.println("Ahora le vamos a aumentar la antigüedad en 5 años\n");
        while (inforSolic.hasNext()) {
            emplModificado = (Empleado)inforSolic.next();
            emplModificado.incAntiguedad(5); // se le incrementa la antiguedad en 5 años
            baseDatos12.store(emplModificado);
            emplModificado.visualEmpleado();
        }
        
        System.out.println("Ahora mostramos empleados modificados\n");
        inforSolic = todo12.execute();
        while (inforSolic.hasNext()) {
            emplModificado = (Empleado)inforSolic.next();
            emplModificado.visualEmpleado();
        }
        
        baseDatos12.close();
        System.out.println("=======================================================\n");
        
        
        
        
        
        System.out.println("==========================================\n\n\n\n\n");
        System.out.println("Ahora mostramos todos los alumnos que hay en la base de datos\n");

        ObjectContainer baseDatos11 = Db4oEmbedded.openFile("BDAlumEmp");
        Alumno a11 = new Alumno(null , null, 0);
        ObjectSet result3 = baseDatos11.queryByExample(a11);
        
        while(result3.hasNext()) {
            a11 = (Alumno)result3.next();
            a11.visualAlumno();
        }
        
        System.out.println("Alumnos que están matriculados en DAM");
        
        a11 = new Alumno("DAM", null, 0);
        
        System.out.println("Ahora vamos a borrar los alumnos que estan matriculados en DAM\n");
        result3 = baseDatos11.queryByExample(a11);
        while(result3.hasNext()) {
            a11 = (Alumno)result3.next();
            a11.visualAlumno();
            baseDatos11.delete(a11);
        }
        
        // Ahora vamos a borrar los alumnos que están en el DAM
        System.out.println("Ahora mostramos los alumnos que quedan en la base de datos\n");
        a11 = new Alumno(null , null, 0);
        result3 = baseDatos11.queryByExample(a11);
        
        while(result3.hasNext()) {
            a11 = (Alumno)result3.next();
            a11.visualAlumno();
        }
        baseDatos11.close();
         
    }

}
