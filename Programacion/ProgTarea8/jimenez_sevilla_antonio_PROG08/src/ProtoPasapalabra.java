
import java.util.Scanner;

/**
 *
 * @author Antonio Jimenez
 */
public class ProtoPasapalabra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pregunta p;
        GeneraListaPreguntas g = new GeneraListaPreguntas();
        for (int i = 0; i < 5; i++) {
            p = g.getLista(); // trae la siguiente pregunta
            System.out.println(p.getIdentificador());
            System.out.println(p.getEnunciado());
            String r = sc.nextLine().trim();
            if (r.equals(p.getRespuesta())) {
                p.cambiaRespuestaCorrecta();
            } else if (r.equals("Pasapalabra")) {
                p.cambiaPasapalabra();
            } else {
                p.cambiaRespuestaIncorrecta();
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Mostramos el estado actual del \"rosco\"");
        System.out.println("----------------------------------------------");
         for (int i = 0; i < 5; i++) {
            p = g.getLista(); // trae la siguiente pregunta
            System.out.println(p.getIdentificador());
            System.out.println(p.getEnunciado());
            System.out.println(p.getRespuesta_correcta());
        }       
    }
}
