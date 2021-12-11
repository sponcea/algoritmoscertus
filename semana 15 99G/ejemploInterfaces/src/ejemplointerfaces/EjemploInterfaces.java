/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

import pack_clases.Camioneta;
import pack_clases.Sedan;

/**
 *
 * @author DIA
 */
public class EjemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Camioneta camioneta= new Camioneta("KIA", "Sportage", "KQ3454", "Azul");
        Sedan sedan= new Sedan("KIA", "Rio", "WQ3012", "Rojo");
        
        System.out.println(camioneta.avanzar());
        System.out.println(camioneta.activarSeguros());
        System.out.println(sedan.encender());
        System.out.println(sedan.avanzar());
        System.out.println(sedan.limpiarLunaDelantera());
    }
    
}
