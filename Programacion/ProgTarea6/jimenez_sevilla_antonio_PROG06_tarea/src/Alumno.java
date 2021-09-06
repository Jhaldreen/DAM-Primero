
import java.io.Serializable;
// creamos la clase alumno

public class Alumno implements Serializable {

    private String nombre;
    private int calificacion;

    //Constructor
    public Alumno(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    //Imprime datos del alumno 
    public void imprimirAlumno() {
        System.out.println("Alumno{nombre=" + this.nombre + ", nota="
                + this.calificacion + "}");
    }
}
