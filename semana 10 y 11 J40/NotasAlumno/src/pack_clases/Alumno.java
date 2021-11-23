/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

import java.io.Serializable;

/**
 *
 * @author DIA
 */
public class Alumno implements Serializable {
    /*Atributos*/
    private String codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    
    /*Constructor*/
    public Alumno(String codigo, String nombre, double nota1, double nota2) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.nota1=nota1;
        this.nota2=nota2;
    }
    
    /*Operaciones o métodos*/
    public double promedio() {
        return (this.getNota1()+this.getNota2())/2;
    }
    
    public String condicion(double promedio) {
        if (promedio>=12) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }
    
    public String toString() {
        return this.getCodigo()+"-"+this.getNombre();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * @param nota2 the nota2 to set
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
