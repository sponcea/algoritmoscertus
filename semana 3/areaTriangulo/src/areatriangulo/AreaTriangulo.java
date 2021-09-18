/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Datos de entrada*/
        double lado1, lado2, lado3;
        /*variable intermedia*/
        double semip;
        /*resultado*/
        double area;
        
        boolean lados_mayores_cero, desigualdad_triangular;
        
        /*Instanciamos el objeto para leer y leemos los lados del triángulo*/
        Scanner teclado =new Scanner(System.in);
        
        System.out.println("Ingrese el lado 1 del triángulo");
        lado1 = teclado.nextDouble();
        
        System.out.println("Ingrese el lado 2 del triángulo");
        lado2 = teclado.nextDouble();
        
        System.out.println("Ingrese el lado 3 del triángulo");
        lado3 = teclado.nextDouble();
        
        /*Lados mayores que cero*/
        lados_mayores_cero=(lado1>0) && (lado2>0) && (lado3>0);
        
        /*Desigualdad triangular*/
        desigualdad_triangular=lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3<(lado1+lado2);
        
        if (lados_mayores_cero && desigualdad_triangular) {
            //Si los lados son mayores Y se cumple la desigualdad triangular
            semip=(lado1+lado2+lado3)/2;
            area=sqrt(semip*(semip-lado1)*(semip-lado2)*(semip-lado3));
            System.out.println("El área del triángulo es: "+area);
        } else {
            System.out.println("Los datos que ingresó son incorrectos");
        }
    }
    
}
