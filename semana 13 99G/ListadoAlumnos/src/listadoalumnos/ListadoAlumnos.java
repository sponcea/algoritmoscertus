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
        //Crear objeto
        
        Alumno alumno1 =new Alumno();
        alumno1.setNombre("Sergio");
        alumno1.setApellido("Ponce");
        alumno1.setCorreo("sponcea@certus.edu.pe");
        alumno1.setNota1(19);
        alumno1.setNota2(20);
        
        Alumno alumno2 = new Alumno("Juan","Pérez","jperez@certus.edu.pe",15,18);
        //imprimir
        System.out.println("Imprimo la información del primer alumno");
        System.out.println("Alumno: "+alumno1.getApellido()+", "+alumno1.getNombre()+"\n"+
                "Correo: "+alumno1.getCorreo()+"\n"+
                "Nota1: "+alumno1.getNota1()+"\n"+
                "Nota2: "+alumno1.getNota2()+"\n"+
                "Promedio: "+alumno1.promedio()+"\n");
        
        System.out.println("Imprimo la información del segundo alumno");
        System.out.println("Alumno: "+alumno2.getApellido()+", "+alumno2.getNombre()+"\n"+
                "Correo: "+alumno2.getCorreo()+"\n"+
                "Nota1: "+alumno2.getNota1()+"\n"+
                "Nota2: "+alumno2.getNota2()+"\n"+
                "Promedio: "+alumno2.promedio()+"\n");

    }
    
}
