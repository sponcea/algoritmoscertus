/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

/**
 *
 * @author DIA
 */
public class InfoObrero {
    
    public static void imprimirInfoObrero(Obrero obrero){
        System.out.println("El código del obrero es: "+obrero.getCodigo());
        System.out.println("El nombre del obrero es: "+obrero.getNombre()+" "+obrero.getApellido());
        System.out.println("La fecha de ingreso del obrero es: "+obrero.getFechaIngreso().imprimirFechaIngreso());
        System.out.println("El cargo del obrero es: "+obrero.getCargo());
        System.out.println("El sueldo bruto del obrero es: "+obrero.getSueldoBruto());
        System.out.println("El sueldo neto del obrero es: "+obrero.getSueldoNeto());
    }
}
 