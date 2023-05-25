/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

/**
 *
 * @author jose
 */
public class EjemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] sueldos=new int[10];
        int notas[]=new int[10];
        int[][] bidimensional=new int[50][20];
        sueldos[0]=1200;
        bidimensional[5][4]=5000;
        System.out.println(sueldos[0]);
        System.out.println(sueldos.length);
        System.out.println(bidimensional[5][4]);
    }
    
}
