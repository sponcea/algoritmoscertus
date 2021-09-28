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
        double resultado=0;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la operación a realizar (+, - , x, /)");
        
        //Como no existe un nextChar(), leo toda la línea con next y me quedo con el caracter en la posición 0
        operacion=teclado.next().charAt(0);
        boolean es_suma=(operacion=='+');
        boolean es_resta=(operacion=='-');
        boolean es_multiplicacion=(operacion=='x');
        boolean es_division=(operacion=='/');
        
        if (es_suma || es_resta || es_multiplicacion || es_division) {
            System.out.println("Ingrese el primer número:");
            num1=teclado.nextDouble();
            System.out.println("Ingrese el segundo número:");
            num2=teclado.nextDouble();
            if (es_suma) {
                //suma
                resultado=num1+num2;
            } else if (es_resta){
                //resta
                resultado=num1-num2;
            } else  if (operacion=='x') {
                //Producto
                resultado=num1*num2;
            } else if (operacion=='/' && num2!=0) {
                //division
                resultado=num1/num2;
            } else { //num2 ==0
                System.out.println("No es posible dividir entre 0");
            }
            if (num2!=0){
                System.out.println("El resultado de la operación "+operacion+" de los números "+num1+" y "+num2+" es: "+resultado);
            }

        } else {
            System.out.println("La operación ingresada no es correcta");
        }

    }
                
}
