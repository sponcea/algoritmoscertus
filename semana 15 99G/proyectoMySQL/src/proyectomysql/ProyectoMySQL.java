/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomysql;

import Controlador.ControladorPersona;
import Modelo.Conexion;
import Modelo.Persona;
import Vista.VistaPersona;

/**
 *
 * @author DIA
 */
public class ProyectoMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona=new Persona();
        VistaPersona vista=new VistaPersona();
        ControladorPersona cp=new ControladorPersona(vista, persona);
        cp.iniciarVista();
    }
    
}
