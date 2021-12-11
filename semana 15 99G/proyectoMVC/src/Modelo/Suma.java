/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DIA
 */
public class Suma extends Operacion {
    
    public Suma() {
        
    }
    
    public Suma(double numero1, double numero2) {
        super(numero1, numero2);
    }
    
    public double sumar() {
        return this.getNumero1()+this.getNumero2();
    }
    
    public String mostrarSuma() {
        return "El resultado de la suma de los números "+this.getNumero1()+" y "+this.getNumero2()+" es "+this.sumar();
    }
}
