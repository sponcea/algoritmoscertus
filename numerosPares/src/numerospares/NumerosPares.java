/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerospares;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        boolean es_par;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese el número que desea conocer si es par o no:");
        a=teclado.nextInt();
        
        //Si al dividir a/2 me devuelve un residio =0, entonces a es par
        es_par=((a%2)==0);
        
        //lógica condicional
        if (es_par) {
            System.out.println("El número "+a+" es par");
        } else {
            System.out.println("El número "+a+" no es par");
        }
    }
    
}
