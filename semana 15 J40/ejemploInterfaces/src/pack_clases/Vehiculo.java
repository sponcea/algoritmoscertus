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
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String color;
    
    public Vehiculo(){
        
    }
    public Vehiculo(String marca, String modelo, String placa, String color) {
        this.marca=marca;
        this.modelo=modelo;
        this.placa=placa;
        this.color=color;
    }
    
    public abstract String avanzar();
    public abstract String retroceder();
}
