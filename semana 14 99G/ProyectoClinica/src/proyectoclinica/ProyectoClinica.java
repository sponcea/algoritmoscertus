/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import pack_clases.Medico;
import pack_clases.Paciente;
import pack_clases.Persona;

/**
 *
 * @author DIA
 */
public class ProyectoClinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona paciente=new Paciente(12,"03/12/2021", "Carlos Lopez",45,"M",80.5, 1.90);
        Paciente paciente2=new Paciente(3434,"01/12/2021", "Lucía Cruz",32,"F",60, 1.50);
        Persona medico=new Medico(1233,"Cardiólogo", "Julio Vargas",25,"M",71.5, 1.70);
        
        
        paciente.imprimirInformacionImportante();
        System.out.println("======================");
        paciente2.imprimirInformacionImportante();
        System.out.println("======================");
        medico.imprimirInformacionImportante();
    }
    
}
