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
    private int nroVentas;
    
    /*constructores*/
    public Vendedor() {
        
    }
    public Vendedor(int nroVentas, String nombre, String apellido, String telefono, String correo, double basico) {
        super(nombre, apellido, telefono, correo, basico);
        this.nroVentas=nroVentas;
    }
    
    /*métodos get y set*/

    /**
     * @return the nroVentas
     */
    public int getNroVentas() {
        return nroVentas;
    }

    /**
     * @param nroVentas the nroVentas to set
     */
    public void setNroVentas(int nroVentas) {
        this.nroVentas = nroVentas;
    }
    
    /*método propio para Vendedor*/
    public double Comision() {
        if (nroVentas>10 && nroVentas<=20) {
            return getBasico()*0.15;
        } else if (nroVentas>20) {
            return getBasico()*0.18;
        } else  {
            return 0;
        }
    }
}
