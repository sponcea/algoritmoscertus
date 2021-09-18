/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraif;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class CalculadoraIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2;
        double suma, resta, producto, division;
        char operacion;
        
        Scanner teclado =new Scanner(System.in);
        
        System.out.println("Ingrese la operación a realizar: ");
        operacion=teclado.next().charAt(0);
        
        boolean es_suma=operacion=='+';
        boolean es_resta=operacion=='-';
        boolean es_producto=operacion=='x';
        boolean es_division=operacion=='/';
        
        if (es_suma || es_resta || es_producto || es_division ) {
        
            System.out.println("Ingrese el primer número");
            num1=teclado.nextDouble();
        
            System.out.println("Ingrese el segundo número");
            num2=teclado.nextDouble();

            if (operacion=='+') {
                //sumamos
                suma=num1+num2;
                System.out.println("La suma de los números "+num1+" y "+num2+" es: "+suma);
            } else if (es_resta) {
                //restamos
                resta=num1-num2;
                System.out.println("La resta de los números "+num1+" y "+num2+" es: "+resta);

            } else if (es_producto) {
                //multiplicamos
                producto=num1*num2;
                System.out.println("La multiplicación de los números "+num1+" y "+num2+" es: "+producto);

            } else if (es_division) {
                //dividimos
                division=num1/num2;
                System.out.println("La división de los números "+num1+" y "+num2+" es: "+division);
            } else {
                //imprimir mensaje de error
                System.out.println("Los datos son incorrectos");
            }
            
        } else {
            System.out.println("No ha ingresado un operador correcto");
        }
        
        
    }
    
}
