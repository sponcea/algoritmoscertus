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

    public Sedan(String marca, String modelo, String placa, String color) {
        super(marca, modelo, placa, color);
    }
    
    
    
    @Override
    public String encender() {
        return "El Sedan está encendido";
    }

    @Override
    public String apagar() {
        return "El Sedan está apagado";
    }

    @Override
    public String avanzar() {
        return "El Sedan esta avanzando";
    }

    @Override
    public String activarSeguros() {
        return "Los seguro están activados";
    }

    @Override
    public String limpiarLunaDelantera() {
        return "El limpia parabrisas está activado";
    }
    
}
