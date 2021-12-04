/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composiciondeclases;

import pack_clases.Cliente;
import pack_clases.Fecha;
import pack_clases.Vehiculo;
import pack_clases.VehiculoAlquilado;

/**
 *
 * @author DIA
 */
public class ComposicionDeClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("XDF4032", "Kia", "Sportage", "Azul", 200,true);
        Vehiculo vehiculo2 = new Vehiculo("QRA3243", "Hyundai", "Accent", "negro", 100,true);
        
        Cliente cliente1= new Cliente("2045876", "Juan", "Guerrero");
        
        Fecha fechaAlquiler= new Fecha(3,12,2021);
        VehiculoAlquilado alquiler1= new VehiculoAlquilado(cliente1,vehiculo2,fechaAlquiler,28);
        System.out.println("Nombre del cliente: "+alquiler1.getCliente().getNombre()+" "+alquiler1.getCliente().getApellidos());
        alquiler1.getVehiculo().getAtributos();
        System.out.println("Fecha de alquiler:");
        alquiler1.getFechaAlquiler().imprimirFecha();
        System.out.println("Cantidad de días de alquiler: "+alquiler1.getTotalDiasAlquiler());
    }
    
}
