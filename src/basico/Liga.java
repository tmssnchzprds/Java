/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import clases.Partido;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Liga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Partido> partidos=new ArrayList<Partido>();
        
        Partido p1 =new Partido();
        p1.setEquipoLocal("Madrid");
        p1.setEquipoVisitante("Barcelona");
        p1.setGolesLocal(1);
        p1.setGolesVisitante(1);
        Partido p2 =new Partido();
        p2.setEquipoLocal("Valencia");
        p2.setEquipoVisitante("Malaga");
        p2.setGolesLocal(0);
        p2.setGolesVisitante(2);
        Partido p3 =new Partido();
        p3.setEquipoLocal("Sevilla");
        p3.setEquipoVisitante("At.Madrid");
        p3.setGolesLocal(2);
        p3.setGolesVisitante(2);
        partidos.add(p1);
        partidos.add(p2);
        partidos.add(p3);
        
        for(Partido pactual:partidos)
        {
            System.out.println("Partido:"+pactual.getEquipoLocal()+"-"+pactual.getEquipoVisitante()+" Resultado:"+pactual.getGolesLocal()+"-"+pactual.getGolesVisitante());
        }
        
    }
    
}
