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
public class Persona implements SerVivo {

    @Override
    public void moverse() {
        System.out.println("La mersona se mueve");
    }

    @Override
    public void comer() {
        System.out.println("La persona come");
    }

    @Override
    public void dormir() {
        System.out.println("La persona duerme");
    }
    
}
