/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclicas;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class EjemploCiclicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*IMPRIMIR LOS N PRIMEROS NÚMEROS*/
        int n, i;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese el número máximo para imprimir: ");
        n=teclado.nextInt();
        System.out.println("===========con for===============");
        for (i=1; i<=n;i++) {
            System.out.print(i+" ");
        }
        
        System.out.println("\n===========con while===============");
        i=1;
        while (i<=n) {
            System.out.print(i+" ");
            i++;
        }
        
        System.out.println("\n===========do while===============");
        i=1;
        do {
            System.out.print(i+" ");
            i++;
        } while (i<=n);
    }
    
}
