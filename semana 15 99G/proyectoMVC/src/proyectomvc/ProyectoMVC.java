/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomvc;

import Controlador.ControladorCalculadora;
import Modelo.Resta;
import Modelo.Suma;
import Vista.VistaCalculadora;

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
        ControladorCalculadora controlador=new ControladorCalculadora(vista, suma, resta);
        controlador.iniciarVista();
    }
    
}
