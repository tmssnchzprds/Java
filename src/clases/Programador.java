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
public class Programador extends Trabajador {
    public final int Sueldo_horas=20;
    
    public int cobrar(int numero_dias) {
        int resultado;
        resultado=numero_dias*Sueldo_horas*8;
        return resultado;
        
        
    }
    
}
