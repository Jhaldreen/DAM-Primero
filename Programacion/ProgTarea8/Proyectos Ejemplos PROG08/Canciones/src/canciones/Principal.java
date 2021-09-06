/* Diseñar una clase llamada Canción con los atributos privados: título y autor y un constructor y métodos que permitan devolverlos. 

En otra clase Reproductor crea un atributo colección que almacene objetos de tipo Canción.
 (Observ: también se puede crear un atributo posición que será compartido por los métodos)

Un método llamado dameCancion que muestra el título y autor de la canción de la posición indicada.
Un método llamado avance que muestra la siguiente canción.
Un método llamado retroceso que muestra la anterior canción.
Un método llamado inicio que muestra la primera canción.
Un método llamado fin que muestra la última canción. 
Un método llamada aleatorio que genera los datos de una canción aleatoriamente.
Podéis anadir otros métodos que os parezcan útiles.
Poner en práctica los métodos anteriores en una clase Principal, cargando el ArrayList con 10 canciones y presentando un menú al usuario.
 */
package canciones;

import java.util.*;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc = 0;

        Cancion can00 = new Cancion("Cancion 0", "Autor 0");
        Cancion can01 = new Cancion("Cancion 1", "Autor 1");
        Cancion can02 = new Cancion("Cancion 2", "Autor 2");
        Cancion can03 = new Cancion("Cancion 3", "Autor 3");
        Cancion can04 = new Cancion("Cancion 4", "Autor 4");
        Cancion can05 = new Cancion("Cancion 5", "Autor 5");
        Cancion can06 = new Cancion("Cancion 6", "Autor 6");
        Cancion can07 = new Cancion("Cancion 7", "Autor 7");
        Cancion can08 = new Cancion("Cancion 8", "Autor 8");
        Cancion can09 = new Cancion("Cancion 9", "Autor 9");

        Reproductor rep1 = new Reproductor();
        rep1.anadir(can00);
        rep1.anadir(can01);
        rep1.anadir(can02);
        rep1.anadir(can03);
        rep1.anadir(can04);
        rep1.anadir(can05);
        rep1.anadir(can06);
        rep1.anadir(can07);
        rep1.anadir(can08);
        rep1.anadir(can09);

        while (opc != 7) {
            System.out.println("----Menú Principal----");
            System.out.println("1. Dame canción (muestra la canción que indica la posicion en el Reproductor");
            System.out.println("2. Siguiente");
            System.out.println("3. Anterior");
            System.out.println("4. Inicio");
            System.out.println("5. Fin");
            System.out.println("6. Aleatorio");
            System.out.println("7. Salir del programa");

            try {
                opc = teclado.nextInt();
                switch (opc) {
                    case 1:
                        rep1.dameCancion();
                        break;
                    case 2:
                        rep1.avance();
                        rep1.dameCancion();
                        break;
                    case 3:
                        rep1.retroceso();
                        rep1.dameCancion();
                        break;
                    case 4:
                        rep1.inicio();
                        rep1.dameCancion();
                        break;
                    case 5:
                        rep1.fin();
                        rep1.dameCancion();
                        break;
                    case 6:
                        rep1.aleatorio();
                        rep1.dameCancion();
                        break;
                    case 7:
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Opcion no válida");
                teclado.next();

            }catch (Exception e){
                System.err.println("Error inesperado"+e.toString());
            }
        }
    }
}
