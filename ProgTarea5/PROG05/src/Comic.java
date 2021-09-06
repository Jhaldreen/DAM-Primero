//Tenemos una clase Comic, con los atributos Titulo, Guionista, Dibujante, 
//los tres de tipo String y Numero (tipo Int) y los métodos –aparte del 
//constructor-son: getTitulo, getGuionista, getDibujante, getNumero, setTitulo, 
//setGuionista, setDibujante, setNumero y un método mostrarInformacion que muestre
//toda la información del objeto.

public class Comic {
    
      String titulo;
      String guionista;
      String dibujante;
      int numero;
    
    //constructor
   public Comic () {
   
   this.titulo= titulo;
   this.guionista=guionista;
   this.dibujante=dibujante;
   this.numero=numero;
  
   }

    //mostrar informacion
   public String mostrarInformacion (){
   
       return " el comic "+titulo+" numero ";
          
              }
   public String mostrarInformaciones (){
   
   return " fue guionizado por"+guionista+"y fue dibujado por"+dibujante;
   
   }
   
  
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGuionista() {
        return guionista;
    }

    public void setGuionista(String guionista) {
        this.guionista = guionista;
    }

    public String getDibujante() {
        return dibujante;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   

}