/*/* Diseñar una clase llamada Canción con los atributos privados: título y autor y un constructor y métodos que permitan devolverlos. 

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

public class Reproductor {

    private ArrayList<Cancion> lista = new ArrayList();

    private int posicion = 0;

    Reproductor() {
    }

    public void anadir(Cancion c) {
        lista.add(c);
    }

    public void dameCancion() {
        Cancion c;
        c = lista.get(posicion);
        System.out.println("Título: " + c.getTitulo() + "  Autor: " + c.getAutor());
    }

    public void avance() {
        if (posicion != (lista.size() - 1)) {
            posicion++;
        } else {
            posicion = 0;
        }
    }

    public void retroceso() {
        if (posicion != 0) {
            posicion--;
        } else {
            posicion = (lista.size() - 1);
        }
    }

    public void inicio() {
        posicion = 0;
    }

    public void fin() {
        posicion = (lista.size() - 1);
    }

    public void aleatorio() {
        posicion = (int) (Math.random() * (lista.size()));
    }
}
