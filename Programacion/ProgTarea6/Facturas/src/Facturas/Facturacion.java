package Facturas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Facturacion {

    static Factura factura;

    public static void grabar(File f) {
        String respuesta = "N";
        ObjectOutputStream fo = null;
        Scanner teclado = new Scanner(System.in);
        try {
            if (!f.exists()) {
                fo = new ObjectOutputStream(new FileOutputStream(f, true));
            } else {
                //hace lo mismo que la anterior pero omite la cabecera
                fo = new MiObjectOutputStream(new FileOutputStream(f, true));
            }
            System.out.println("numero-->");
            int n = teclado.nextInt();
            System.out.println("cliente");
            String cliente = teclado.next();
            System.out.println("importe-->");
            double importe = teclado.nextDouble();
            boolean pagado = false;
            System.out.println("pagado S/N");
            respuesta = teclado.next();
            if ((respuesta.charAt(0) == 's') || (respuesta.charAt(0) == 'S')) {
                pagado = true;
            }
            factura = new Factura(n, cliente, importe, pagado);
            fo.writeObject(factura);
            fo.close();

        } catch (IOException s) {
            System.err.println("problemas al grabar");
        }

    }

    public static void morosos(File f) throws IOException {
        ObjectInputStream fi = null;
        boolean fin = false;
        try {
            fi = new ObjectInputStream(new FileInputStream(f));
            do {
                factura = (Factura) fi.readObject();
                if (!factura.isPagado()) {
                    System.out.println(factura.getNumero() + " " + factura.getCliente() + " " + factura.getImporte());
                }
            } while (!fin);

        } catch (EOFException eof) {
            fin = true;
            //fi.close();
        } catch (IOException es) {
            System.err.println("no puedo abrir el archivo");
        } catch (ClassNotFoundException ex) {
            System.err.println("clase no encotrada");
        } finally {
            if (fi != null) {
                fi.close();
            }
        }
    }

    public static void borrar(File f) {

        if (f.delete()) {
            System.out.println("fichero borrado");
        } else {
            System.out.println("no se ha borrado");
        }
    }
}
