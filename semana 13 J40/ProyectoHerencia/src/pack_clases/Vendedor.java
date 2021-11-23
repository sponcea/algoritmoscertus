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
public class Vendedor extends Empleado {
    /*atributos*/
    private int nroventas;
    /*constructores*/

    public Vendedor(int nroventas) {
        this.nroventas = nroventas;
    }

    public Vendedor(int nroventas, String nombre, String apellido, String telefono, String correo, double basico) {
        super(nombre, apellido, telefono, correo, basico);
        this.nroventas = nroventas;
    }
    
    /*metodos get y set*/

    public int getNroventas() {
        return nroventas;
    }

    public void setNroventas(int nroventas) {
        this.nroventas = nroventas;
    }
    
    /*métodos del vendedor*/
    public double Comision() {
        if (nroventas>10 && nroventas<=20){
            return getBasico()*0.15;
        } else if (nroventas>20) {
            return getBasico()*0.18;
        } else {
            return 0;
        }
    }
}
