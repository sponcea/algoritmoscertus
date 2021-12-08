/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Persona;
import vista.VistaRegistro;

/**
 *
 * @author DIA
 */
public class ControladorPersona implements ActionListener {
    
    private VistaRegistro vista;
    private Persona persona;

    public ControladorPersona(VistaRegistro vista, Persona persona) {
        this.vista = vista;
        this.persona = persona;
        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        persona.setDni(vista.txtDNI.getText());
        persona.setNombre(vista.txtNombre.getText());
        if (ae.getSource()==this.vista.btnRegistrar) {
            persona.registrarPersona();
            vista.txtDNI.setText("");
            vista.txtNombre.setText("");
        }
        if (ae.getSource()==this.vista.btnModificar) {
            persona.modificarPersona();
        }      
        if (ae.getSource()==this.vista.btnEliminar) {
            persona.eliminarPersona();
        }          

    }
    
    public void iniciarVistaRegistro() {
        vista.setTitle("Registrar persona");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
