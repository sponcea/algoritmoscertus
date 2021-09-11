/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4areatriangulo;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class Ejercicio4AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double lado1, lado2, lado3;
        double semip, areaTriangulo;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el lado 1 del triangulo");
        lado1=teclado.nextDouble();
        
        System.out.println("Ingrese el lado 2 del triangulo");
        lado2=teclado.nextDouble();
        
        System.out.println("Ingrese el lado 3 del triangulo");
        lado3=teclado.nextDouble();
        
        semip=(lado1+lado2+lado3)/2;
        
        areaTriangulo=sqrt(semip*(semip-lado1)*(semip-lado2)*(semip-lado3));
        
        System.out.println("El área del triángulo es: "+areaTriangulo);
        
    }
    
}
