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
public class Alumno extends Persona {
    //atributos nativos
    private int nota1;
    private int nota2;
    
    //constructores
    public Alumno() {
        
    }    
    public Alumno(String nombre, String apellido, String correo, int nota1, int nota2) {
        //con super accedo al constructor de la clase Persona
        super(nombre,apellido,correo);
        this.nota1=nota1;
        this.nota2=nota2;
    }
    
    //metodos get y set

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    
    //método para calcular el promedio
    public double promedio() {
        return (nota1+nota2)/2.0;
    }
}
