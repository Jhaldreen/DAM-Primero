/* Diseñar una clase llamada Canción con los atributos privados: título y autor y un constructor y métodos que permitan devolverlos. 

En otra clase Reproductor crea un atributo colección que almacene objetos de tipo Canción.
 (Observ: también se puede crear un atributo posición que será compartido por los métodos)

Un método llamado dameCancion que muestra el título y autor de la canción de la posición indicada.
Un método llamado avance que muestra la siguiente canción.
Un método llamado retroceso que muestra la anterior canción.
Un método llamado inicio que muestra la primera canción.
Un método llamado fin que muestra la última canción. 
Un método llamada aleatorio que genera los datos de una canción aleatoriamente.
Podéis añadir otros métodos que os parezcan útiles.
Poner en práctica los métodos anteriores en una clase Principal, cargando el ArrayList con 10 canciones y presentando un menú al usuario.
 */
package canciones;

public class Cancion {

    private String titulo, autor;

    Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
