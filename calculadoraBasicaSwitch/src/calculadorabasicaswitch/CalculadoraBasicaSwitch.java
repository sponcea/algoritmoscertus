/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabasicaswitch;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class CalculadoraBasicaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2;
        char operacion;
        //double suma, resta, producto, division;
        double resultado=0;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la operación a realizar");
        
        //Como no existe un nextChar(), leo toda la línea con next y me quedo con el caracter en la posición 0
        operacion=teclado.next().charAt(0);

        //El usuario no debe escribir los números si la operación no es +,-,x,/
        if (operacion=='+' || operacion=='-' || operacion=='x' || operacion=='/') {
            System.out.println("Ingrese el primer número:");
            num1=teclado.nextDouble();
            System.out.println("Ingrese el segundo número:");
            num2=teclado.nextDouble();
            //con Switch
            switch(operacion) {
                case '+':
                    resultado=num1+num2;
                    break;
                case '-':
                    resultado=num1-num2;
                    break;
                case 'x':
                    resultado=num1*num2;
                    break;
                case '/':
                    /*Controlamos lo que ocurre cuando el denominador es 0*/
                    if (num2==0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                       resultado=num1/num2;
                    }
                    break;
                default:
                    
                    System.out.println("Los datos son incorrectos");
            }
            System.out.println("El resultado de la operación "+operacion+" entre los números "+num1+" y "+num2+" es: "+resultado);

        } else {
            System.out.println("La operación ingresada no es correcta");
        }
        
        
    }
    
}
