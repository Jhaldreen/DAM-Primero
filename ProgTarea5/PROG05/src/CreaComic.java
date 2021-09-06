/*En una clase principal llamada CreaComic crea un objeto comic c1 
*con los siguientes datos: Título: Watchmen, Guionista: Alan Moore, 
*Dibujante: Dave Gibbons, número 3. Utiliza el método getTitulo para 
*comprobar en ejecución si está correctamente creado.
 */

public class CreaComic {

   public static void main(String[] args) {
        
        
        Comic c1 = new Comic();
        NovelaGrafica c2 = new NovelaGrafica("los cambell",56);
        c1.titulo = " Watchmen ";
        c1.guionista = " Alan Moore";
        c1.dibujante = " Dave Gibbons";
        
        c2.setTitulo(" Loscambell ");
        c2.setDibujante(" Dave Gibbons ");
        c2.setGuionista(" Jose Luis Munuera ");
       
        // creamos un array
         int [] numero = {1,2,3,4,5,6,7,8,9,10,11,12};
         
        System.out.println("El titulo del comic es Watchmen");
        System.out.println("--------------------------------------------------");
        //utilizamos el bucle for para los numero de comics
        for (int i=0; i<12; i++){
            System.out.println(c1.mostrarInformacion()+numero[i]+c1.mostrarInformaciones());
        }
        System.out.println("--------------------------------------------");
 
        System.out.println(c2.mostrarInformacion()+" 4 : El oro de Brandigamo"+c2.mostrarInformaciones());
        System.out.println(c2.mostrarNovela());
   }
  
    
    }
    
     
     

