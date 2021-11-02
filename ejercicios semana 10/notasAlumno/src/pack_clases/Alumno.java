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
    /*Atributos*/
    private String codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    
    /*Métodos*/
    /*Constructores*/
    public Alumno() {
        
    }
    public Alumno(String codigo, String nombre, double nota1, double nota2){
        this.codigo=codigo;
        this.nombre=nombre;
        this.nota1=nota1;
        this.nota2=nota2;
    }
   
    /*Operaciones*/
    public double promedio() {
        return (getNota1()+getNota2())/2;
    }
    public String condicion(double promedio) {
        if (promedio>=12) {
            /*Nota es mayor o igual que 12*/
            return "Aprobado";
        } else {
            /*Nota menor que 12*/
            return "Desaprobado";
        }
    }
    /*Para que se muestre el nombre y el apellido en la lista, sobreescribimos el método toString*/
    @Override
    public String toString(){
        return this.codigo+"-"+this.nombre;
    }
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
