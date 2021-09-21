/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raicescuadraticas;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class RaicesCuadraticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b,c;
        double discriminante;
        double x, x1, x2;
        double parteReal, parteImaginaria;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingrese los coeficientes a, b y c de la ecuación ax^2+bx+c=0");
        
        System.out.println("Ingrese el coeficiente a: ");
        a=teclado.nextDouble();
        System.out.println("Ingrese el coeficiente b: ");
        b=teclado.nextDouble();
        System.out.println("Ingrese el coeficiente c: ");
        c=teclado.nextDouble();
        
        discriminante=pow(b,2)-4*a*c;
        
        //Empezamos a evaluar en función de la discriminante
        if (discriminante>=0) {
            if (discriminante==0) {
                //tiene una raiz real
                x=-b/(2*a);
                System.out.println("La única raíz real es: "+x);
            } else { //no es igual a cero, es mayor
                //Tiene dos raices reales distintas
                x1=(-b+sqrt(discriminante))/(2*a);
                x2=(-b-sqrt(discriminante))/(2*a);
                System.out.println("La raíz real x1 es: "+x1);
                System.out.println("La raíz real x2 es: "+x2);
            }
        } else { //la discriminante es menor que 0
            discriminante=abs(discriminante);
            parteReal=-b/(2*a);
            parteImaginaria=sqrt(discriminante)/2*a;
            System.out.println("La raíz compleja x1 es: "+parteReal+" + i"+parteImaginaria);
            System.out.println("La raíz compleja x2 es: "+parteReal+" - i"+parteImaginaria);
        }
    }
    
}
