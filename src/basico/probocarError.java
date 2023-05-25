/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;
import clases.Error;
/**
 *
 * @author jose
 */
public class probocarError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Error error=new Error();
        int[] miarray=error.probocarError();
        try {
        System.out.println("Elemento 0:"+miarray[0]);
        System.out.println("Elemento 1:"+miarray[1]);
        //System.out.println("Elemento 2:"+miarray[2]);
        //System.out.println("Elemento 3:"+miarray[3]);
        System.out.println(2/0);
        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Ha habido un error: "+e.getMessage());
        } catch(ArithmeticException e){
        System.out.println("Ha habido un error: "+e.getMessage());
        } 
        finally {System.out.println("Haz lo que tengas que hacer");}
    }
}
