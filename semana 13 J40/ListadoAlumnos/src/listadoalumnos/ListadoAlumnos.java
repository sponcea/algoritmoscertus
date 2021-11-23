/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoalumnos;

import pack_clase.Alumno;

/**
 *
 * @author DIA
 */
public class ListadoAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objeto
        Alumno obj=new Alumno();
        obj.setNombre("Sergio");
        obj.setApellido("Ponce");
        obj.setCorreo("sponcea@certus.edu.pe");
        obj.setNota1(19);
        obj.setNota2(20);
        
        //Imprimir
        System.out.println("Alumno: "+obj.getApellido()+", "+obj.getNombre()+"\n"+
                "correo: "+obj.getCorreo()+"\n"+
                "Nota 1: "+obj.getNota1()+"\n"+
                "Nota 2: "+obj.getNota2()+"\n"+
                "Promedio: "+obj.promedio());
    }
    
}
