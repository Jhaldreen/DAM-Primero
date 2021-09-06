package puertas;
 
public class Puerta {
    int alto;
    int ancho;
    boolean abierta;
    
    public Puerta(){
    
    ancho=3;
    alto=4;
    abierta=false;
    }
    
    public void mostrarEstado(){
        if (abierta==true){
        System.out.println("La puerta mide "+ ancho+"m de ancho, "+alto+"m de largo y está abierta");
        
        }
        else{
        System.out.println("La puerta mide "+ ancho+"m de ancho, "+alto+"m de largo y está cerrada");
        }
    
    }
    public void Abrir(){
        abierta=true;
    
    }
    
    public void Cerrar(){
    
        abierta=false;
    }
    public void setAlto(int x){
        alto=x;
    
    }
    public void setAncho(int x){
        ancho=x;
         }
    
    public int getAlto(){
        return alto;
        }
    public int getAncho(){
        return ancho;
    }
}
