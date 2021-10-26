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
    /*atributos: definen el estado*/
    public int numero;
    public String nombreCliente;
    public String nombreProducto;
    public int cantidad;
    /*Métodos*/
    /*Constructores: Permiten inicializar un objeto del tipo Venta*/
    public Venta() {
        
    }
    public Venta(int num, String nombreCliente, String nombreProducto, int cantidad) {
        /*Asigno a los atributos de la clase valores iniciales que paso como parámetros, pueden llamarse diferente a los atributos*/
        /*Para que java reconozca que estoy utilizando los atributos de la clase, utilizamos this*/
        this.numero=num;
        this.nombreCliente=nombreCliente;
        this.nombreProducto=nombreProducto;
        this.cantidad=cantidad;
    }
    /*Operaciones: Definen el comportamiento*/
    public double ImporteCompra() {
        if (nombreProducto.equals("TV Led 50 SAMSUNG"))
            return 2500*cantidad;
        else if (nombreProducto.equals("Lavadora LG 15 KG"))
            return 1200 * cantidad;
        else if (nombreProducto.equals("Refrigeradora DAEWOO 320 LT"))
            return 1800*cantidad;
        else if (nombreProducto.equals("TV Led 60 LG"))
            return 2900*cantidad;
        else
            return 0;
         
    }
}
