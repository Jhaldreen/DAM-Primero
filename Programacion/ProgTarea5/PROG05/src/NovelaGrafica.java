//Creamos una clase NovelaGrafica, que hereda de la clase Comic, pero tiene 
//además un dato entero numPag. Creamos una novela gráfica con los siguientes 
//datos: Título: Los Campbell: El Oro de San Brandamo, Dibujante: José Luis Munuera, 
//Guionista: José Luis Munuera, Número 4, número de páginas 56.
//Mostrarlo en pantalla.


public class NovelaGrafica extends Comic {
    
     int numeroPag;

    public NovelaGrafica(String titulo, int numeroPag) {
       super();
        this.numeroPag = 56;
    }

    public String mostrarNovela (){
    
    return "y esta novela grafica tendrá "+numeroPag+" páginas";
    
    }
    
   
            
            
  
}