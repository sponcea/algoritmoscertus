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
    private int cantAirbag;

    public Camioneta() {
    }

    public Camioneta(int cantAirbag, String marca, String modelo, String placa, String color) {
        super(marca, modelo, placa, color);
        this.cantAirbag = cantAirbag;
    }
    
    @Override
    public String avanzar() {
        return "La camioneta está avanzando";
    }

    @Override
    public String retroceder() {
        return "La camioneta está retrocediendo";
    }

    @Override
    public String encender() {
        return "La camioneta está encendida";
    }

    @Override
    public String apagar() {
        return "La camioneta está apagada";
    }

    @Override
    public String activarSeguros() {
        return "Los seguros están activados";
    }

    @Override
    public String activarLimpiaParabrisas() {
        return "Los limpia parabrisas están activados";
    }

    @Override
    public String activarDobleTraccion() {
        return "Doble tracción activada";
    }

    @Override
    public String abrirSunRoof() {
        return "SunRoof abierto";
    }
    
}
