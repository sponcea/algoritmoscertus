/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Resta;
import modelo.Suma;
import vista.VistaCalculadora;

/**
 *
 * @author DIA
 */
public class ControladorCalculadora implements ActionListener {
    
    private VistaCalculadora vista;
    private Suma suma;
    private Resta resta;

    public ControladorCalculadora(VistaCalculadora vista, Suma suma, Resta resta) {
        this.vista = vista;
        this.suma = suma;
        this.resta = resta;
        /*el botón del cual el controlador estará pendiente es btnSumar*/
        this.vista.btnSumar.addActionListener(this);
        this.vista.btnRestar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        /*obtengo información de la vista y se la paso al modelo*/
        if (ae.getSource()==this.vista.btnSumar) {
            suma.setNumero1(Integer.parseInt(vista.txtNumero1.getText()));
            suma.setNumero2(Integer.parseInt(vista.txtNumero2.getText()));
            /*El modelo se encarga de la lógica, en este caso sumar y lo devuelve para mostrarlo*/
            vista.txtResultado.setText(suma.mostrarSuma());
        }
        if (ae.getSource()==this.vista.btnRestar) {
            resta.setNumero1(Integer.parseInt(vista.txtNumero1.getText()));
            resta.setNumero2(Integer.parseInt(vista.txtNumero2.getText()));
            /*El modelo se encarga de la lógica, en este caso sumar y lo devuelve para mostrarlo*/
            vista.txtResultado.setText(resta.mostrarResta());
        }
    }
    
}
