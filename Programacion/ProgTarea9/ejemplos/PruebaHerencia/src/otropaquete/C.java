
package otropaquete;

//Tengo que importar la clase A porque está en otro paquete.
import pruebaherencia.A;

/**
 *
 * @author joaqf
 */
//La clase C está en otro paquete y hereda de A
public class C extends A {
    
    public void metodoC () {
        //No se puede acceder a vara porque es privado
        System.out.println(vara);
        //Se puede acceder a varb porque es protegido y C hereda de A
        System.out.println(varb);
    }
    
}
