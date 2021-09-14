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
        double suma, resta, producto, division;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la operación a realizar");
        
        //Como no existe un nextChar(), leo toda la línea con next y me quedo con el caracter en la posición 0
        operacion=teclado.next().charAt(0);
        
        System.out.println("Ingrese el primer número:");
        num1=teclado.nextDouble();
        System.out.println("Ingrese el segundo número:");
        num2=teclado.nextDouble();
        
        //con Switch
        switch(operacion) {
            case '+':
                suma=num1+num2;
                System.out.println("El resultado de la suma de los números "+num1+" y "+num2+" es: "+suma);
                break;
            case '-':
                resta=num1-num2;
                System.out.println("El resultado de la resta de los números "+num1+" y "+num2+" es: "+resta);
                break;
            case 'x':
                producto=num1*num2;
                System.out.println("El resultado del producto de los números "+num1+" y "+num2+" es: "+producto);
                break;
            case '/':
                division=num1/num2;
                System.out.println("El resultado de la division de los números "+num1+" y "+num2+" es: "+division);
                break;
            default:
                System.out.println("Los datos son incorrectos");
        }
    }
    
}
