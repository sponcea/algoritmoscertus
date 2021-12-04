/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import pack_clases.*;
/**
 *
 * @author DIA
 */
public class ProyectoClinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fecha fechaIngreso= new Fecha();
        Paciente paciente1=new Paciente(1234, fechaIngreso, "Carlos Ramirez",30,"M", 74, 1.65);
        
        paciente1.imprimirInfo();
        System.out.println("El imc del paciente es: "+paciente1.calcularIMC());
        /************************************/
        System.out.println("");
        Medico medico1=new Medico(12345,"Neurología","Juan Linares",40,"M",80, 1.85);
        
        medico1.imprimirInfo();
    }
    
}
