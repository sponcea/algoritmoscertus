/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Resta;
import Modelo.Suma;
import Vista.VistaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        this.resta=resta;
        /*obtengo el componente BtnSumar y estoy pendiente del evento click*, this pasa el objeto que va a implementar el actionPerformed*/
        this.vista.getBtnSumar().addActionListener(this);
        this.vista.getBtnRestar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        /*acciones que debemos realizar cuando el usuario haga clic en el botón*/
        if (ae.getSource()==this.vista.getBtnSumar()) {
            suma.setNumero1(Integer.parseInt(vista.getTxtNumero1().getText()));
            suma.setNumero2(Integer.parseInt(vista.getTxtNumero2().getText()));
            vista.getTxtResultado().setText(suma.mostrarSuma());
        }
        if (ae.getSource()==this.vista.getBtnRestar()) {
            resta.setNumero1(Integer.parseInt(vista.getTxtNumero1().getText()));
            resta.setNumero2(Integer.parseInt(vista.getTxtNumero2().getText()));
            vista.getTxtResultado().setText(resta.mostrarResta());
        }
    }
    
    public void iniciarVista() {
        vista.setTitle("Calculadora con MVC");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
