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
public class Supervisor extends Empleado {
    /*atributos*/
    private String categoria;
    
    /*constructores*/
    public Supervisor() {
        
    }
    public Supervisor(String categoria, String nombre, String apellido, String telefono, String correo, double basico){
        super(nombre, apellido, telefono, correo, basico);
        this.categoria=categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    /*método propio del supervisor*/
    public double Bono() {
        if (categoria.equals("Senior")) {
            return getBasico()*0.10;
        } else if (categoria.equals("Junior")) {
            return getBasico()*0.05;
        } else  {
            return 0;
        }
    }
}
