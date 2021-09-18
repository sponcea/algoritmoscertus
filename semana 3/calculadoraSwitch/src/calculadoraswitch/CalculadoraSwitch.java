/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraswitch;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class CalculadoraSwitch {

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
        
        System.out.println("Ingrese el primer número");
        num1=teclado.nextDouble();
        
        System.out.println("Ingrese el segundo número");
        num2=teclado.nextDouble();
        
        switch(operacion) {
            case '+':
                //sumamos
                suma=num1+num2;
                System.out.println("La suma de los números "+num1+" y "+num2+" es: "+suma);
                break;
            case '-':
                //restamos
                resta=num1-num2;
                System.out.println("La resta de los números "+num1+" y "+num2+" es: "+resta);
                break;
            case 'x':
                //multiplicamos
                producto=num1*num2;
                System.out.println("La multiplicación de los números "+num1+" y "+num2+" es: "+producto);
                break;
            case '/':
                //dividimos
                division=num1/num2;
                System.out.println("La división de los números "+num1+" y "+num2+" es: "+division);
                break;
            default:
                //imprimimos el mensaje de error
                System.out.println("Los datos son incorrectos");
        }
        System.out.println("Fin del programa");
    }
    
}
