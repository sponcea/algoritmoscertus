/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_interfaces;

/**
 *
 * @author DIA
 */
public interface AccionesVehiculo {
    
    /*Indico lo que un vehículo puede hacer, no indico cómo*/
    public String encender();
    public String apagar();
    public String activarSeguros();
    public String activarLimpiaParabrisas();
}
