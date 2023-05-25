/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import clases.Perro;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author jose
 */
public class ListasDeArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList a= new ArrayList();
        a.add("Chachi");
        a.add(25);
        a.add(13.3f);
        System.out.println(a.get(1));
        
        for (Object elemento:a)
        {
            System.out.println(elemento);
        }
        
        Iterator i=a.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        ArrayList<Perro> perros= new ArrayList<Perro>();
        /*
        Perro p1= new Perro();
        p1.setNombre("chucho1");
        p1.setEdad(4);
        Perro p2= new Perro();
        p2.setNombre("chucho2");
        p2.setEdad(5);
        Perro p3= new Perro();
        p3.setNombre("chucho3");
        p3.setEdad(18);
        perros.add(p1);
        perros.add(p2);
        perros.add(p3);
        */
        for (int indice=0;indice<=2;indice++)
        {
            perros.add(new Perro("chucho"+indice,4,3));
        }
        
        for (Perro p_actual:perros)
        {
            System.out.println(p_actual.getNombre());
        }
        Iterator it_perros=perros.iterator();
        while (it_perros.hasNext())
        {
            System.out.println(it_perros.next());
        }
        
    }
    
}
