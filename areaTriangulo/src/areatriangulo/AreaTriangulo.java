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
        double lado1, lado2,lado3;
        double semip, area;
        boolean es_triangulo, lados_mayores_cero;
        
        Scanner teclado;
        teclado=new Scanner(System.in);
        
        System.out.println("ingrese el lado 1 del triángulo");
        lado1=teclado.nextDouble();
        System.out.println("ingrese el lado 2 del triángulo");
        lado2=teclado.nextDouble();
        System.out.println("ingrese el lado 3 del triángulo");
        lado3=teclado.nextDouble();
        
        //Encapsulamos la lógica de los lados mayores que 0
        
        lados_mayores_cero=(lado1>0) && (lado2>0) && (lado3>0);

        //Encapsulamos la lógica de la desigualdad triangular
        es_triangulo=lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3<(lado1+lado2);
        
        //Evaluamos las expresiones lógicas
        
        if (lados_mayores_cero && es_triangulo) {
            semip=(lado1+lado2+lado3)/2;
            area=sqrt(semip*(semip-lado1)*(semip-lado2)*(semip-lado3));
            System.out.println("El área del triángulo es: "+area);
        } else {
            System.out.println("Los datos ingresados no son correctos");
        }
        
    }
    
}
