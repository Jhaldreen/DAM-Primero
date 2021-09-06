/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class PrincipalListas {


    public static void main(String[] args) {
//1.	Se almacenarán los candidatos a jefe de la sección 1 en una lista doblemente enlazada llamada listado.

        LinkedList<Candidato> listado = new LinkedList();

//2.	Los candidatos serán seis:
//"ana", 53	"bea", 57     "oliver", 59        “leo", 63        "lia", 55        “anais", 51

        Candidato cand1 = new Candidato("ana", 53);
        Candidato cand2 = new Candidato("bea", 57);
        Candidato cand3 = new Candidato("oliver", 59);
        Candidato cand4 = new Candidato("leo", 63);
        Candidato cand5 = new Candidato("lia", 55);
        Candidato cand6 = new Candidato("anais", 51);

        //Candidatos a jefe seccion1    
// 3.	Añado al listado los 4 primeros. 

        listado.add(cand1);
        listado.add(cand2);
        listado.add(cand3);
        listado.add(cand4);
       
// 4.	Me doy cuenta de que el quinto candidato iría mejor en la segunda posición.
        listado.add(1, cand5);

// 5.El primer candidato llama y deja su puesto al sexto candidato, con lo cual este será sustituido
        listado.set(0, cand6);

// 6. El que inscribí como tercer candidato cand3 abandona.
        listado.remove(cand3);

//7.	Me llaman de personal y me piden reducir el número de entrevistas a tres. 
        //He de eliminar el que ahora ocupa el último lugar (ya no recuerdo la longitud de mi listado)     
        //listado.removeLast();
        listado.remove(listado.size()- 1);

//  8. ¿Qué lugar ocupa cand5?
        System.out.println("Lugar que opcupa el candidato 5" + listado.indexOf(cand5));
        //System.out.println(listado.lastIndexOf(cand5));

/*       9.	Quiero ver el contenido del listado. (No valdría aplicar toString directamente, pero sí sobreescrito). 
         *    Además hay tres métodos diferentes para recorrer el Arraylist
         •	Bucle for que ya conocemos
         •	Bucle for-each
         •	Iterador

10.	Implementamos los tres modos de ver el contenido de los objetos candidatos.
         */

        //Sobreescribiendo toString
        //Si no sobreescribimos toString nos imprimiría por pantalla referencias de memoria y no  la información que reconocemos del objeto
        System.out.println("Con toString SOBREESCRITO");

        System.out.println("Todo el listado " + listado.toString()); // Nos deja ver la información

        
        System.out.println("Recorriendo el ArrayList con for-posicional");
        //Vista de los elementos del listado
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(i + "   " + listado.get(i));
// alternativa: Candidato c=listado.get(i);
//              System.out.println(i + ") " + c.getNombre() + " " + c.getEdad());
        }

        System.out.println("Recorriendo el ArrayList con for-each");

        for (Candidato c : listado) {
//      System.out.println("\t " + c.nombre + " " + c.edad);
            System.out.println(c);
        }

        System.out.println("Recorriendo el ArrayList con iterador");
        //Creamos un iterador
        Iterator<Candidato> it = listado.iterator();
        while (it.hasNext()) {
            Candidato c = it.next();
//          System.out.println("Elemento almacenado: " + c.nombre + "  " + c.edad);
            System.out.println(c);
//          listado.remove(c);  //Da resultados impredecibles 
                                //por borrar del listado y no del iterador
            it.remove();   //elimina del iterador y de la colección    
        }
        
        System.out.println("Listado una vez aplicado el remove()"
                + listado.toString());


        listado.add(cand6);
        listado.add(cand5);
        listado.add(cand2);

////      10.	Hacemos una sublista desde la posición 1 (dejamos el 0 fuera) hasta el final de la lista. 
//        //Y vemos el contenido de esta nueva lista con un iterador.
//
        List<Candidato> sublistaNueva = new LinkedList<>();

        sublistaNueva = listado.subList(1, listado.size());
        System.out.println("Veamos la sublista Nueva ");

        Iterator<Candidato> it2 = sublistaNueva.iterator();
        while (it2.hasNext()) {
            Candidato t = it2.next();
            System.out.println(t);
//            System.out.println(  t.nombre + "  " + t.edad);
        }

  
//        //candidatos a jefe seccion 2
////11. Se almacenarán los candidatos a jefe de la sección 2 en una lista  de tipo ArrayList  listado2.
////      "tomás", 40		"teresa", 43	

        List<Candidato> listado2 = new ArrayList<>();
        Candidato cand11 = new Candidato("tomás", 40);
        Candidato cand12 = new Candidato("teresa", 43);
// // 12.	Se añaden estos candidatos al listado2 y vemos el contenido de los objetos, 
////esta vez creando para ello un iterador.

        listado2.add(cand11);
        listado2.add(cand12);

        System.out.println("todo el listado2  con toString"
                + listado2.toString());//Veo el interior del objeto
        System.out.println("todo el listado2  con iterador");

        Iterator<Candidato> it3 = listado2.iterator();
        while (it3.hasNext()) {
            Candidato t = it3.next();
            System.out.println(t);
//            System.out.println(t.nombre + "  " + t.edad);
        }

////13.	Uno las dos colecciones indicando la posición de listado donde quiero introducir
//        //el listado2, por ejemplo al principio.
        listado.addAll(0, listado2);

//        //Uno las dos colecciones indicando la posición donde quiero 
//        //introducirlo
//        //A partir de aquí listado lleva  a todos los candidatos
//
        System.out.println("Todo el listado completo ");

        Iterator<Candidato> it4 = listado.iterator();
        while (it4.hasNext()) {
            Candidato t = it4.next();
            System.out.println("Elemento almacenado: " + t.getNombre() + "  " + t.getEdad());
        }
// // 14.	A partir de aquí listado lleva  a todos los candidatos. Lo vemos con el bucle for-each. Y podrá ser tratado como LinkedList.
//        System.out.println("\n LISTADO");
        for(Candidato c: listado){
        
        System.out.println("Elemento " + c.getNombre() + "  " + c.getEdad());
        }
    }
}

