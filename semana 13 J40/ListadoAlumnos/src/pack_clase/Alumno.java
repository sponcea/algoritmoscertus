/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clase;

/**
 *
 * @author DIA
 */
public class Alumno extends  Persona {
    //atributos nativos de Persona
    //nombre
    //apellido
    //correo
    private int nota1;
    private int nota2;
    
    //constructores
    public Alumno() {
        
    }
    public Alumno(String nombre, String apellido, String correo, int nota1, int nota2) {
        //invoco al constructor Persona(nombre, apellido, correo)
        super(nombre,apellido,correo);
        this.nota1=nota1;
        this.nota2=nota2;
    }
    //métodos get y set

    /**
     * @return the nota1
     */
    public int getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public int getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    
    //métodos del usuario
    public double promedio() {
        return (nota1+nota2)/2.0;
    }
    
}
