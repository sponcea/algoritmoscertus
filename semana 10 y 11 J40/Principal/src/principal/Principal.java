/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author DIA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo1=new Circulo();
        Circulo circulo2=new Circulo(2,3,5,10);
        /*Este constructor pasa el radio (un double)*/
        Circulo circulo3=new Circulo(5.0);
        /*Este constructor pasa un ID (un int)*/
        Circulo circulo4=new Circulo(4);
        /*Agrego valores a través de los métodos*/
        circulo1.setIdentificador(1);
        circulo1.setX(4);
        circulo1.setY(-5);
        circulo1.setRadio(15);
        
        System.out.println("El área del círculo 1 es: "+circulo1.calcularArea());
        System.out.println("El perímetro del círculo 1 es: "+circulo1.calcularPerimetro());
        
        System.out.println("El área del círculo 2 es: "+circulo2.calcularArea());
        System.out.println("El perímetro del círculo 2 es: "+circulo2.calcularPerimetro());
        
        System.out.println("El área del círculo 3 es: "+circulo3.calcularArea());
        System.out.println("El perímetro del círculo 3 es: "+circulo3.calcularPerimetro());
        
        PlanoCartesiano.determinarCuadrante(circulo2);
        PlanoCartesiano.determinarCuadrante(circulo4);
        PlanoCartesiano.determinarCuadrante(circulo1);
    }
    
}
