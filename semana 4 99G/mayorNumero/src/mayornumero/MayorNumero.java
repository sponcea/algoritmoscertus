/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayornumero;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class MayorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nos piden que se ingresen 3 números y validar que sean diferentes entre sí y devolver el mayor de ellos
        int num1, num2, num3;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el primer número");
        num1=teclado.nextInt();
        System.out.println("Introduce el segundo número");
        num2=teclado.nextInt();
        System.out.println("Introduce el tercer número");
        num3=teclado.nextInt();
        
        //lógica para determinar que los números son diferentes
        boolean sonDiferentes=(num1!=num2) && (num2!=num3) && (num3!=num1);
        
        if (sonDiferentes) {
            //Implementamos la lógica de quién es el número mayor
            System.out.println("Los numeros son diferentes. Implementar lógica solicitada");
        } else {
            System.out.println("Los 3 números deben diferentes");
        }
        
        
    }
    
}
