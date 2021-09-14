/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacuadrado;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class AreaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaración de las variables
        double lado, area;
        
        //Declaro el objeto teclado para leer el dato de entrada
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingrese el lado del cuadrado en metros: ");
        //leo el dato de entrada ingresado por el usuario
        lado=teclado.nextDouble();
        
        //lógica del programa
        area=pow(lado,2);
        System.out.println("El área del cuadrado es: "+area+"m2");
        
        
    }
    
}
