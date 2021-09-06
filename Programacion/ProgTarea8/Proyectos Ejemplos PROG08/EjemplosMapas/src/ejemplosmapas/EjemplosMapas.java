package ejemplosmapas;

import java.util.HashMap;

public class EjemplosMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("MAPA mapa1");
        HashMap<String, String> mapa = new HashMap<>();

        //Se añaden elementos al mapa
        System.out.println("Se añaden tres parejas de elementos String  String al mapa");

        mapa.put("Madrid", "Espania");
        mapa.put("Paris", "Francia");
        mapa.put("Roma", "Italia");
        System.out.println("----------------------------------------------");

        System.out.println("Valor asociado a Madrid: " + mapa.get("Madrid"));
        System.out.println("Valor asociado a Londres: " + mapa.get("Londres"));

        System.out.println("Valor asociado a Madrid que quitamos del mapa: " + mapa.remove("Madrid"));
        System.out.println("----------------------------------------------");
        System.out.println("tamaño del mapa " + mapa.size());
        System.out.println("----------------------------------------------");
        System.out.println("Bucle para ver los elementos del mapa");
        //Bucle para ver los elementos del mapa
        for (String llave : mapa.keySet()) {
            String valor = mapa.get(llave);
            System.out.println(llave + "  " + valor);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Listado de values");
        System.out.println(mapa.values());
        System.out.println("Listado de keys");
        System.out.println(mapa.keySet());
        System.out.println("Listado de parejas");
        System.out.println(mapa.entrySet());

        System.out.println("----------------------------------------------\n\n");
        //Se crea otro mapa de trabajo con parejas de elementos String-Objeto

        System.out.println("MAPA mapa2");
        HashMap< String, Persona> mapa2 = new HashMap<>();

        Persona persona1 = new Persona("pepe", "sanchez", "calle 13", 987987987);
        Persona persona2 = new Persona("paco", "perez", "calle 15", 876876876);
        Persona persona3 = new Persona("pipo", "lopez", "calle 17", 345345345);

        System.out.println("Se añaden tres parejas de elementos Persona-String al mapa");
        mapa2.put("20191817Z", persona1);
        mapa2.put("20203132S", persona2);
        mapa2.put("20209192X", persona3);

        System.out.println("Bucle para ver los elementos del mapa");
        for (String llave : mapa2.keySet()) {
            Persona valor = mapa2.get(llave);
            System.out.println(llave + "  " + valor);
        }

        System.out.println("Quito el elemento de dni 20191817Z");
        mapa2.remove("20191817Z");

        System.out.println("----------------------------------------------");
        System.out.println("Listado de values");
        System.out.println(mapa2.values());  //Si no se sobreescribe toString, los objetos Persona no se ven son referencias de memoria
        System.out.println("Listado de keys");
        System.out.println(mapa2.keySet());
        System.out.println("Listado de parejas");
        System.out.println(mapa2.entrySet().toString());//Si no se sobreescribe toString los objetos Persona no se ven son referencias de memoria

        //Se crea otro mapa de trabajo con parejas de elementos Objeto-String

        /*
         HashMap<Persona, String> mapa2 = new HashMap<>();
         Persona persona1 = new Persona("pepe", "sanchez", "calle 13", 987987987);
         Persona persona2 = new Persona("paco", "perez", "calle 15", 876876876);
         Persona persona3 = new Persona("pipo", "lopez", "calle 17", 345345345);
         System.out.println("---------------Se añaden tres parejas de elementos Persona-String al mapa-------------------------------");
         mapa2.put(persona1, "20191817Z");
         mapa2.put(persona2, "20203132S");
         mapa2.put(persona3, "20209192X");

         System.out.println("-----Bucle para ver los elementos del mapa--------------------------");
         for (Persona llave : mapa2.keySet()) {
         String valor = mapa2.get(llave);
         System.out.println(llave.nombre + "  " + valor);
         }

         System.out.println("----------------------------------------------");
         System.out.println("-----Listado de values-----------------------------------------");
         System.out.println(mapa2.values());
         System.out.println("-----Listado de keys-----------------------------------------");
         System.out.println(mapa2.keySet());//Los objetos Persona no se ven son referencias de memoria
         System.out.println("-----Listado de parejas---------------------------------------");
         System.out.println(mapa2.entrySet().toString());//Los objetos Persona no se ven son referencias de memoria
         }
         * */
    }
}
