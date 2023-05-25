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
public class EjemploAbstracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Becario b=new Becario();
        int SueldoBecario=b.cobrar(30);
        System.out.println("Sueldo becario="+SueldoBecario);
        Programador p=new Programador();
        int SueldoProgramador=p.cobrar(30);
        System.out.println("Sueldo Programador="+SueldoProgramador);
    }
    
}
