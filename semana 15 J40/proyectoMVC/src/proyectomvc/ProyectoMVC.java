/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomvc;

import controlador.ControladorCalculadora;
import modelo.Resta;
import modelo.Suma;
import vista.VistaCalculadora;

/**
 *
 * @author DIA
 */
public class ProyectoMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Suma suma=new Suma();
        Resta resta=new Resta();
        VistaCalculadora vista=new VistaCalculadora();
        ControladorCalculadora controlador=new ControladorCalculadora(vista,suma,resta);
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
}
