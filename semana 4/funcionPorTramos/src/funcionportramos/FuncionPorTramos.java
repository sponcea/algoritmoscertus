/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionportramos;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class FuncionPorTramos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x,y;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese el valor de X");
        x=teclado.nextDouble();
        
        //Empezamos a resolver la función por tramos
        if (x<5) {
            y=pow(x,3);
        } else if (x<10) {
            y=pow(x,2)-2*x+1;
        } else {
            y=x/3;
        }
        System.out.println("El valor de f(x) es: "+y);
        
    }
    
}
