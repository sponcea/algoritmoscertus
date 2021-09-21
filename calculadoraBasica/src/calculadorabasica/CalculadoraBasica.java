/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabasica;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2;
        char operacion;
        double suma, resta, producto, division;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la operación a realizar");
        
        //Como no existe un nextChar(), leo toda la línea con next y me quedo con el caracter en la posición 0
        operacion=teclado.next().charAt(0);
        
        System.out.println("Ingrese el primer número:");
        num1=teclado.nextDouble();
        System.out.println("Ingrese el segundo número:");
        num2=teclado.nextDouble();
        
        boolean es_suma=operacion=='+';
                
        if (es_suma) {
            //suma
            suma=num1+num2;
            System.out.println("El resultado de la suma de los números "+num1+" y "+num2+" es: "+suma);
        } else if (operacion=='-'){
            //resta
            resta=num1-num2;
            System.out.println("El resultado de la resta de los números "+num1+" y "+num2+" es: "+resta);
        } else  if (operacion=='x') {
            //Producto
            producto=num1*num2;
            System.out.println("El resultado del producto de los números "+num1+" y "+num2+" es: "+producto);

        } else if (operacion=='/') {
            //division
            if (num2==0) {
                System.out.println("No se puede dividir entre 0");
            } else {
                division=num1/num2;
                System.out.println("El resultado de la division de los números "+num1+" y "+num2+" es: "+division);
            }
        } else {
            System.out.println("La operación ingresada no es correcta");
        }
        
    }
    
}
