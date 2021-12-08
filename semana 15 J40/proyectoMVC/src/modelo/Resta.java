/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DIA
 */
public class Resta extends Operacion {
    public Resta() {
        
    }
    public double restar() {
        return this.getNumero2() - this.getNumero1();
    }
    public String mostrarResta() {
        return this.getNumero2()+" - "+this.getNumero1()+" = "+this.restar();
    }
}
