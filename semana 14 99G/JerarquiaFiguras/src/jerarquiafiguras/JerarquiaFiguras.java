/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquiafiguras;

import pack_clases.Circulo;
import pack_clases.Figura;

/**
 *
 * @author DIA
 */
public class JerarquiaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo=new Circulo(2,3,3,2,4.1);
        Figura figura= new Figura();
        
        circulo.dibujar();
        circulo.borrar();
    }
    
}
