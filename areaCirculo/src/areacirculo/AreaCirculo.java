/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        double area;
        //Declaración de una constante simbólica
        //final double PI=3.14169;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese el radio del círculo");
        radio=teclado.nextDouble();
        
        area=PI*pow(radio,2);
        
        System.out.println("El área del círculo es: "+area);
        
    }
    
}
