
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class GeneraListaPreguntas {
    // Atributos
    ArrayList<Pregunta> lista;
    int indice;
    
    // Metodos

    public GeneraListaPreguntas() {
        lista = new ArrayList<Pregunta>();
        Pregunta p1 = new Pregunta('A', "Que depende del azar", "Aleatorio");
        Pregunta p2 = new Pregunta('B', "Que puede tomar solo dos valores", "Boolean");
        Pregunta p3 = new Pregunta('C', "Convertir un tipo de dato en otro", "Cast");
        Pregunta p4 = new Pregunta('D', "Tipo de dato de doble precisión", "Double");
        Pregunta p5 = new Pregunta('E', "Tipo de programación utilizada antes de la programación oritentada a objetos", "Estructurada");
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        indice = 0;
    }
    
    public Pregunta getLista() {
        Pregunta p = null;
        if (indice == 5) {
            indice = 0;
        }
        return lista.get(indice++);
    }
    
}
