
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PrincipalAlumnos {

    private static final int nAlumnos = 3;

    // Muestra el menú de opciones
    public static void Menu() {
        System.out.println("1.-Grabar Alumno");
        System.out.println("2.-Listar alumnos");
        System.out.println("3.-Salir");
    }

    public static void grabarAlumnos(Scanner teclado, File f,
            Alumno[] arr) throws IOException {
        for (int i = 0; i < nAlumnos; i++) {
            // llena arr con alumnos
            System.out.println("Intro nombre");
            String nombre = teclado.next();
            int nota;
            do { // valida que 0 <= nota <= 10
                System.out.println("Intro nota");
                nota = teclado.nextInt();
            } while (nota < 0 || nota > 10);
            arr[i] = new Alumno(nombre, nota); // crea un nuevo objeto Alumno
        }
        FileOutputStream fos = new FileOutputStream(f);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(arr); // escribe el objeto arr en un fichero
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: no se encontro el fichero.");
        }

    }

    public static void mostrarDatos(File f, Alumno[] arr) throws IOException {
        FileInputStream fis = new FileInputStream(f);
        try {
            ObjectInputStream fi = new ObjectInputStream(fis);

            arr = (Alumno[]) fi.readObject(); // carga arr desde un fichero
            fi.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error: no se encontro el fichero.");
        } catch (ClassNotFoundException ex) {
            System.err.println("Error: no se encontro la clase");
        }

        for (Alumno a : arr) { // recorre el arreglo de alumnos
            a.imprimirAlumno(); // imprime datos del alumno
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        File f = new File("lista.dat");
        // crea array de Alumno
        Alumno[] alumnos = new Alumno[nAlumnos];

        int opcion;

        do {
            Menu(); // muestra el men˙ de opciones
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: // lee y graba datos de alumnos
                    grabarAlumnos(teclado, f, alumnos);
                    break;
                case 2:// muestra los datos de los alumnos
                    mostrarDatos(f, alumnos);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Opcion erronea!");
            }
            // salir
        } while (opcion != 3);
        teclado.close();
    }
}
