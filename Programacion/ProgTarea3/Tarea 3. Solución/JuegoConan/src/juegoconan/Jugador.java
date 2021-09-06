/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoconan;

/**
 *
 * @author adlpr
 */
public class Jugador {
    int Energia;
    String nombre;
    boolean defensa;
    
    Jugador(){
        Energia=100;
        nombre= "Conan";
        defensa=false;
    }
    Jugador(String nombre){
        Energia=100;
        this.nombre=nombre;
        defensa=false;
    }

    public int getEnergia() {
        return Energia;
    }

    public void setEnergia(int Energia) {
        this.Energia = Energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDefensa() {
        return defensa;
    }

    public void setDefensa(boolean defensa) {
        this.defensa = defensa;
    }
    
    public void defender(){this.defensa=true;}
    public void atacar(Jugador j){
    //Por poner
        this.setDefensa(false);
        //La siguiente línea de código está puesta para evitar tener que usar la instrucción if-else, 
        //con la cual este trozo del código quedaría más natural
        j.Energia=(j.isDefensa())?j.getEnergia():(j.getEnergia()-25); 
        j.setDefensa(false);
        
    
    }
    
    public void mostrarEstado(){
        System.out.println("***********************************************************");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Energía: "+this.getEnergia());
        System.out.println("Defensa: "+this.isDefensa());
        System.out.println("***********************************************************");
    }
    
}
