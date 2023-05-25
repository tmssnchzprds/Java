/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;
import clases.*;
/**
 *
 * @author jose
 */
public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=5;
        String cadena="El perro muerde";
        System.out.println("Contador="+contador);
        System.out.println("cadena="+cadena);
        System.out.println(cadena.length());
        System.out.println(cadena.indexOf("perro"));
        contador++;
        System.out.println("Contador="+contador);
        System.out.println("Bravo, mi primer programa Java!");
        MiClase miClaseBonita=new MiClase();
        miClaseBonita.setMiVariable(100.23f);
        float resultado=miClaseBonita.getMiVariable();
        System.out.println(resultado);
        Perro miPerro=new Perro();
        miPerro.setNombre("Toby");
        System.out.println(miPerro.moverse());
        System.out.println(miPerro.ladrar());
        System.out.println(miPerro.ladrar(true));
    }
    
}
