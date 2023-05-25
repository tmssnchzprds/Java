/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Profesor
 */
public abstract class Trabajador {
 
        private String nombre;
        private int edad;

  /*  public Trabajador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }*/
        
        public String queSoy(){
            return "Soy un trabajador";
        }
    
        public abstract int cobrar(int numero_dias);
    
}
