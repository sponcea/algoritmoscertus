/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Vista.VistaPersona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DIA
 */
public class ControladorPersona implements ActionListener{
    
    private VistaPersona vista;
    private Persona persona;

    public ControladorPersona(VistaPersona vista, Persona persona) {
        this.vista = vista;
        this.persona = persona;
        this.vista.getBtnRegistrar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        persona.setDni(vista.getTxtDNI().getText());
        persona.setNombre(vista.getTxtNombre().getText());
        if (ae.getSource()==this.vista.getBtnRegistrar()) {
            persona.registrarPersona();
            vista.getTxtDNI().setText("");
            vista.getTxtNombre().setText("");
        }
        if (ae.getSource()==this.vista.getBtnModificar()) {
            persona.modificarPersona();
        }      
        if (ae.getSource()==this.vista.getBtnEliminar()) {
            persona.eliminarPersona();
        }   
    }
    
    public void iniciarVista() {
        vista.setTitle("Registrar persona");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
