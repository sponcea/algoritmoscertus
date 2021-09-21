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
        int num1, num2, num3;
        boolean son_diferentes;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        num1=teclado.nextInt();

        System.out.println("Ingrese el segundo número");
        num2=teclado.nextInt();

        System.out.println("Ingrese el tercer número");
        num3=teclado.nextInt();
        
        //validamos que sean diferentes entre sí
        son_diferentes= (num1 != num2)&&(num1!=num3) && (num2 != num3);
        
        if (son_diferentes) {
            if (num1>num2) { //Pregunto si el número 1 > nmero 2
                if (num1>num3) {
                    //num1 es el mayor
                    System.out.println("El primer número "+num1+" es el mayor");
                } else { //num3>=num1
                    System.out.println("El tercer número "+num3+" es el mayor");
                }
            } else if (num2>num3) { //num2>=num1 && num2>num3
                System.out.println("El segundo número "+num2+" es el mayor");
            } else { //num3>=num2 && num2>=num1
                System.out.println("El tercer número "+num3+" es el mayor");
            }
        } else {
            System.out.println("Los tres números deben ser diferentes");
        }
        
    }
    
}
