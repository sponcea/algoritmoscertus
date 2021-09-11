/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprogramasecuencial;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class EjercicioProgramaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
        /*Declaración de variables*/
        double num1, num2;
        double suma, producto;
        
        /*Lectura de datos*/
        //Creo un objeto del tipo Scanner, se llamará teclado
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        num1=teclado.nextDouble();
        
        System.out.println("Ingrese el segundo número");
        num2=teclado.nextDouble();
        /*Ejecución de cálculos*/
        suma=num1+num2;
        producto=num1*num2;
        
        System.out.println("La suma y el producto son: "+suma+" y "+producto+" respectivamente");
        /*Impresión de resultados*/
    }
    
}
