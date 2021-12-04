/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocomposicion;

import pack_clases.Cliente;
import pack_clases.Fecha;
import pack_clases.Vehiculo;
import pack_clases.VehiculoAlquilado;

/**
 *
 * @author DIA
 */
public class EjemploComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Creamos dos vehiculos*/
        Vehiculo vehiculo1=new Vehiculo("4405KQ", "KIA", "Sportage", "Azul", 150, true);
        Vehiculo vehiculo2=new Vehiculo("5303JK", "Toyota", "Corolla", "Plta",80,true);
        
        /*Creamos un cliente*/
        Cliente cliente1= new Cliente("3458175", "Ángel","Torres");
        
        /*Creamos fecha de alquiler*/
        Fecha fechaAlquiler1=new Fecha(29,11,2021);
        
        /*Creamos un objeto VehiculoAlquilado*/
        VehiculoAlquilado alquiler1= new VehiculoAlquilado(cliente1, vehiculo1, fechaAlquiler1,10);
        
        System.out.println("Cliente DNI: "+alquiler1.getCliente().getDni());
        System.out.println("Cliente Nombres y apellidos: "+alquiler1.getCliente().getNombre()+" "+alquiler1.getCliente().getApellidos());
        System.out.println("Matrícula vehículo alquilado: "+alquiler1.getVehiculo().getMatricula());
        alquiler1.imprimirPrecioTotalAlquiler();
    }
    
}
