/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jose
 */
public class Perro extends Animal{
    private String nombre;
    private int edad;
    private float peso;

    public Perro(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    
    private String hagoCaca(){return "Zurullo";}
    
    public String ladrar(){
        return "GuauGuau";
    }
    
    public String ladrar(boolean cabreo) {
        if (cabreo==true)
        {return "Guau Guau GRRRR"+this.hagoCaca();}else{return "Guau Guau normal";}
                    
    }
    
    public Perro() {
        System.out.println("Constructor de la clase Perro");
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public String moverse() {
        //System.out.println("Me llamo "+this.nombre+" y comienzo a moverme");
        String MensajePadre=super.moverse();
        return MensajePadre+" Me llamo "+this.nombre+" y comienzo a moverme";
    }
}
