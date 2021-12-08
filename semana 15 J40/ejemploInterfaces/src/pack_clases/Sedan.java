/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

import pack_interfaces.AccionesVehiculo;

/**
 *
 * @author DIA
 */
public class Sedan extends Vehiculo implements AccionesVehiculo {
    
    private int cantAsientos;

    public Sedan() {
    }

    public Sedan(int cantAsientos, String marca, String modelo, String placa, String color) {
        super(marca, modelo, placa, color);
        this.cantAsientos = cantAsientos;
    }
    @Override
    public String avanzar() {
        return "El Sedan está avanzando";
    }

    @Override
    public String retroceder() {
        return "El Sedan está retrocediendo";
    }

    @Override
    public String encender() {
        return "el sedan está encendido";
    }

    @Override
    public String apagar() {
        return "el sedan está apagado";
    }

    @Override
    public String activarSeguros() {
        return "Los seguros están activados";
    }

    @Override
    public String activarLimpiaParabrisas() {
        return "Los Limpia parabrisas están activados";
    }
    
}
