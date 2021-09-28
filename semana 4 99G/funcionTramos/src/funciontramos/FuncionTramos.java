/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciontramos;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class FuncionTramos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x, fx;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese el valor de x: ");
        x=teclado.nextDouble();
        
        if (x<5) {
            System.out.println("ingresé a x<5");  
            fx=pow(x,3);
        } else if (x<10) {
            System.out.println("ingresé a x<10");  
            fx=pow(x,2)-2*x+1;
        } else {
            System.out.println("ingresé a x>=10");  
            fx=x/3;
        }
        System.out.println("El resultado de la función f(x) es: "+fx);
    }
}
