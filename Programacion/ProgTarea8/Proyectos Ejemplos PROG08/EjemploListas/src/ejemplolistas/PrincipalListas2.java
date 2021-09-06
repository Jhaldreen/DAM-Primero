/*
 * Clase en la que se ve que ocurre si se declara una Lista sin indicar el tipo 
 * de obeto que va a almacenar
 */
package ejemplolistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PrincipalListas2 {

    public static void main(String[] args) {
        List listado2 = new ArrayList<>();  //NO LE HE DICHO QUE VA A LLEVAR Objetos tipo Candidato
       
        //Veamos si podemos recorrer la lista de objetos
        
        System.out.println(listado2.size());
        
        Candidato cand11 = new Candidato("tomás", 40);
        Candidato cand12 = new Candidato("teresa", 43);

        listado2.add(cand11);
        listado2.add(cand12);

        System.out.println("\nlistado2  con toString\n"
                + listado2.toString());//Veo el interior del objeto



        System.out.println("\nlistado2 con for posicional");
        for (int i = 0; i < listado2.size(); i++) {

            System.out.println(i + "   " + listado2.get(i));

        }


        System.out.println("\nlistado2  con iterador de Candidatos");
        Iterator<Candidato> it3 = listado2.iterator();
        while (it3.hasNext()) {
            Candidato t = it3.next();
            System.out.println(t);
        }
        
//Lo mismo, de otro modo
        
//      System.out.println("\nlistado2  con iterador haciendo casting");
//        Iterator it4 = listado2.iterator();
//        while (it4.hasNext()) {
//            Candidato t =(Candidato) it4.next();
//            System.out.println(t);
//        }
        
        
        System.out.println("No puedo usar el for-each porque no sé qué tipo de objeto tengo ");
//      for(Candidato c: listado2){ // NO puedo usarlo porque no le dije que listado2 llevaba Candidatos
//        
//        System.out.println(c);
//        }
    }
}
