/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

/**
 *
 * @author alfredo
 */
public class Tarea {
    String descripcion;
    String fecha;
    int prioridad;
    boolean completada;
    
    public  String getDescripcion(){return descripcion;}
    public String getFecha(){return fecha;}
    public int getPrioridad(){return prioridad;}
    public boolean getCompletada(){return completada;}
    
    public void setDescripcion(String x){this.descripcion=x;}
    public void setFecha(String y){this.fecha=y;}
    public void setPrioridad(int z){this.prioridad=z;}
    public void setCompletada(boolean t){this.completada=t;}
    
    public void aumentarPrioridad(){if (this.prioridad<10)this.prioridad=this.prioridad+1; }
    public void disminuirPrioridad(){if (this.prioridad>1)this.prioridad=this.prioridad-1; }

}
