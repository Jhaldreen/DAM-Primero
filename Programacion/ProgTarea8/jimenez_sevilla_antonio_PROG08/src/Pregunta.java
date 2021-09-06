

/**
 *
 * @author Antonio
 */
public class Pregunta {
    public final String RAYA = "------------------------------";
    public static final String AZUL = "Azul";
    public static final String ROJO = "Rojo";
    public static final String VERDE = "Verde";
    // Atributos
    private char identificador; // correspondera con la letra de la palabra
    private String enunciado; // definición de la palabra buscada
    private String respuesta; // palabra buscada
    private String respuesta_correcta; // estado de las preguntas
    
    public Pregunta(char identificador, String enunciado, String respuesta) {
        this.identificador = identificador;
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }
    
    // Métodos
    public void cambiaRespuestaCorrecta() {
        this.respuesta_correcta = VERDE;
    }

    public void cambiaRespuestaIncorrecta() {
        this.respuesta_correcta = ROJO;
    }

    public void cambiaPasapalabra() {
        this.respuesta_correcta = AZUL;
    }
    
    public String getIdentificador() {
        return RAYA + this.identificador + RAYA;
    }
    
    public String getEnunciado() {
        return this.enunciado;
    }
    
    public String getRespuesta() {
        return this.respuesta;
    }
    
    public String getRespuesta_correcta() {
        return this.respuesta_correcta;
    }
}
