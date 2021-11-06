/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIA
 */
public class Principal {
    
    public static void main(String[] args) {
        
        /*creo un objeto de la clase Circulo*/
        /*Con el constructor con parámetros*/
        
        Circulo circulo1=new Circulo(-2,-3,10);
        
        circulo1.obtenerArea();
        circulo1.obtenerPerimetro();
        System.out.println("El radio del círculo 1 es: "+circulo1.getRadio());
        System.out.println("El área del círculo 1 es: "+circulo1.obtenerArea());
        System.out.println("El perímetro del círculo 1 es: "+circulo1.obtenerPerimetro());
        Plano.determinarCuadrante(circulo1);
        /*Con el constructor por defecto*/
        Circulo circulo2=new Circulo();
        circulo2.setRadio(10);
        System.out.println("El radio del círculo 2 es: "+circulo2.getRadio());
        System.out.println("El área del círculo 2 es: "+circulo2.obtenerArea());
        System.out.println("El perímetro del círculo 2 es: "+circulo2.obtenerPerimetro());
        /*Con el constructor que solo pide radio*/
        Circulo circulo3=new Circulo(10);
        System.out.println("El radio del círculo 3 es: "+circulo3.getRadio());
        System.out.println("El área del círculo 3 es: "+circulo3.obtenerArea());
        System.out.println("El perímetro del círculo 3 es: "+circulo3.obtenerPerimetro());
       
    }
}
