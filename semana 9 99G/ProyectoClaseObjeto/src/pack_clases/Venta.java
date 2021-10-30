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
public class Venta {
    /*atributos*/
    private int numero;
    private String nombreCliente;
    private String nombreProducto;
    private int cantidad;
    
    /*Constructores*/
    public Venta() {
        
    }
    public Venta(int num, String nombreCliente, String nombreProducto, int cantidad ) {
        this.numero=num;
        this.nombreCliente=nombreCliente;
        this.nombreProducto=nombreProducto;
        this.cantidad=cantidad;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /*Operaciones*/
    public double ImporteCompra() {
        if (nombreProducto.equals("TV Led 50 SAMSUNG")) {
            return 2500*cantidad;
        } else if (nombreProducto.equals("Lavadora LG 15 KG")) {
            return 1200*cantidad;
        } else if (nombreProducto.equals("Refrigeradora DAEWOO 320 LT")) {
            return 1800*cantidad;
        } else if (nombreProducto.equals("TV Led 60 LG")) {
            return 2900*cantidad;
        } else {
            return 0;
        }
 
    }
    
}

