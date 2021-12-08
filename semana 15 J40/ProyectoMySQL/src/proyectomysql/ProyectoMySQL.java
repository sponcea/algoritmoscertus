/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomysql;

import controlador.ControladorPersona;
import modelo.Conexion;
import modelo.Persona;
import vista.VistaRegistro;

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
        Persona persona = new Persona();
        VistaRegistro vista = new VistaRegistro();
        ControladorPersona controlador= new ControladorPersona(vista, persona);

        controlador.iniciarVistaRegistro();
    }
    
}
