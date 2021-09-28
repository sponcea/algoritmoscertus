/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacioncuadratica;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class EcuacionCuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c;
        double discriminante,raiz1,raiz2,raiz,parteReal, parteImaginaria;
        
        Scanner teclado=new Scanner(System.in);
        
        //Pido información al usuario
        System.out.println("Ingrese el coeficiente a: ");
        a=teclado.nextDouble();
        System.out.println("Ingrese el coeficiente b: ");
        b=teclado.nextDouble();
        System.out.println("Ingrese el coeficiente c: ");
        c=teclado.nextDouble();
        
        //Calculo el valor de la discriminante con la que tomaremos decisiones
        discriminante=pow(b,2)-4*a*c;
        
        //Empezamos la lógica del programa
        if (discriminante>0) { 
            //dos raíces reales
            raiz1=(-b+sqrt(discriminante))/(2*a);
            raiz2=(-b-sqrt(discriminante))/(2*a);
            System.out.println("TIENE DOS RAÍCES REALES!!!");
            System.out.println("La raíz real x1 es: "+raiz1);
            System.out.println("La raíz real x2 es: "+raiz2);
        }else if (discriminante==0) {
            //una raíz real
            raiz=-b/(2*a);
            System.out.println("TIENE UNA RAÍZ REAL!!!");
            System.out.println("La única raíz real es: "+raiz);
        } else { //discriminante <0
            //dos raices complejas
            //Obtenemos el valor absoluto de la discriminante para obviar su signo
            //el denominador debe ir entre paréntesis para evitar que el coeficiente a actúe como numerador
            discriminante=abs(discriminante);
            parteReal=-b/(2*a);
            parteImaginaria=sqrt(discriminante)/(2*a);
            System.out.println("TIENE DOS RAÍCES COMPLEJAS!!!");
            System.out.println("La raiz compleja x1 es: "+parteReal+" + i"+parteImaginaria);
            System.out.println("La raíz compleja x2 es: "+parteReal+" - i"+parteImaginaria);
        }
    }
}
