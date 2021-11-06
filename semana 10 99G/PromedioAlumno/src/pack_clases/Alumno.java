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
public class Alumno {
    
    /*Atributos de la clase*/
    private String codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    
    /*Constructores*/
    public Alumno(String codigo, String nombre, double nota1, double nota2) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.nota1=nota1;
        this.nota2=nota2;
    }
    
    /*Operaciones*/
    public double promedio() {
        return (this.getNota1()+this.getNota2())/2;
    }
 
    public String condicion(double promedio) {
        /*si promedio>=12, está aprobado*/
        if (promedio>=12) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
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
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @return the nota2
     */
    public double getNota2() {
        return nota2;
    }
    
    @Override
    public String toString() {
        return this.codigo+"-"+this.nombre;
    }
}
