/*
 *Se desea realizar la gestión de facturas de una empresa mediante una 
 *aplicación Java. Los datos de las facturas, se almacenarán en un fichero 
 *serializado denominado facturas.dat.
 *Los datos de las facturas que se almacenarán son:  
             nºfactura (int), nombre cliente(String), importe(double) , 
 *pagado (boolean)
 
*El programa realizará las tareas del siguiente menú repetitivo:
*                                   1.- Añadir factura .
*                                   2.-Listado mororos 
*                                   3.- Eliminar fichero 
*                                   4.- Salir
*
*/
package Facturas;

import java.io.Serializable;

/**
 *
 * @author 
 */
public class Factura implements Serializable{
    private int numero;
    private String cliente;
    private double importe;
    private boolean pagado;

    public Factura(int numero, String cliente, double importe, boolean pagado) {
        this.numero = numero;
        this.cliente = cliente;
        this.importe = importe;
        this.pagado = pagado;
    }

    public Factura() {
        
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getImporte() {
        return importe;
    }

    public boolean isPagado() {
        return pagado;
    }
    
}
