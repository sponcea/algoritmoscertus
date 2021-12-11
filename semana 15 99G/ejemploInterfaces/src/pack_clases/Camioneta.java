/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

import pack_interfaces.AccionesCamioneta;
import pack_interfaces.AccionesVehiculo;

/**
 *
 * @author DIA
 */
public class Camioneta extends Vehiculo implements AccionesVehiculo, AccionesCamioneta {

    public Camioneta(String marca, String modelo, String placa, String color) {
        super(marca, modelo, placa, color);
    }

      
    @Override
    public String encender() {
        return "La camioneta está encendido";
    }

    @Override
    public String apagar() {
        return "La camioneta está apagada";
    }

    @Override
    public String avanzar() {
        return "La camioneta está avanzando";
    }

    @Override
    public String activarSeguros() {
        return "Los seguros están activados";
    }

    @Override
    public String limpiarLunaDelantera() {
        return "El limpia parabrisas está activado";
    }

    @Override
    public String activarDobleTraccion() {
        return "La doble tracción está activada";
    }

    @Override
    public String activarSunRoof() {
        return "El SunRoof está activado";
    }
    
}
