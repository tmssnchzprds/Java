/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import clases.Mamifero;
import clases.Persona;

/**
 *
 * @author jose
 */
public class EjemploInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m=new Mamifero();
        m.moverse();
        m.comer();
        m.dormir();
        Persona p=new Persona();
        p.moverse();
        p.comer();
        p.dormir();
                
    }
    
}
