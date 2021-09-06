/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicine;

/**
 *
 * @author adelapresa
 */
public class Sala {
    
    static int recaudacion=0;
    String titulo;
    int numeroSala;
    String cartelAscii;
    public Sala(){
         
        
    }
    
        public int getNumeroSala(){return numeroSala;}
        public void setNumeroSala(int numero){this.numeroSala=numero;}
        public String getTitulo(){return titulo;}
        public void setTitulo(String titulo){this.titulo=titulo;}
         public String getCartelAscii(){return cartelAscii;}
        public void setCartelAscii(String cartelAscii){this.cartelAscii=cartelAscii;}
        
        public String toString(){
            String cadena=String.valueOf(this.getNumeroSala());
            cadena+="\n"+this.getTitulo();
            cadena+="\n"+this.getCartelAscii();
            
            return cadena;
}
        
    
    
    }
    

