/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3areacirculo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;


/**
 *
 * @author DIA
 */
public class Ejercicio3AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*declaracion de variables*/
        double radio, area;
        /*Lectura de datos*/
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese el radio del círculo:");
        radio=teclado.nextDouble();
        
        /*Lógica*/
        area=PI*pow(radio,2);
        
        /*Impresión de resultados*/
        System.out.println("El área del círculo es: "+area);
    }
    
}
