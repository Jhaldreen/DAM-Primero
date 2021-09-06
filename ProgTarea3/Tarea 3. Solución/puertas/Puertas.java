package puertas;
import java.util.*;
public class Puertas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc= new Scanner(System.in);
       int alto;
       int ancho;
               
        Puerta p1=new Puerta();
        p1.setAlto(2);
        p1.setAncho(3);
        p1.Abrir();
        p1.mostrarEstado();
        p1.Cerrar();
        p1.mostrarEstado();
        //A partir de aquí vamos a generar el array de puertas
        Puerta p[]= new Puerta[4];
        
        
        for (int i=0; i<4;i++){
            Puerta p2=new Puerta();
            p[i]=p2;
            p[i].Abrir();
        
        }
        
        
        for (int i=0;i<4;i++){
            System.out.println("Introduce alto");
            alto=sc.nextInt();
            p[i].setAlto(alto);
            System.out.println("Introduce ancho");
            ancho=sc.nextInt();
            p[i].setAncho(ancho);
        }
        for (int i=0;i<4;i++){
            p[i].mostrarEstado();
                
        }
        
    }
    
}
