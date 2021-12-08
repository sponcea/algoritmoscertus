/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaces;

import pack_clases.*;

/**
 *
 * @author DIA
 */
public class EjemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan sedan=new Sedan(4, "KIA", "Cerato", "RT4032","Negro");
        Camioneta camioneta=new Camioneta(6,"KIA","Sportage","GR4052", "Azul");
        
        System.out.println(camioneta.encender());
        System.out.println(camioneta.activarSeguros());
        System.out.println(camioneta.avanzar());
        
        
    }
    
}
