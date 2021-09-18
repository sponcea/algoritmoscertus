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
        /*definimos variables de entrada y de salida*/
        int a;
        
        //Acá vamos a encapsular la expresión lógica
        boolean numero_es_par;
        
        /*Pedir datos de entrada*/
        System.out.println("Ingrese el número que desea conocer si es par o no: ");
        
        /*Instanciamos un objeto del tipo Scanner*/
        Scanner teclado;
        teclado=new Scanner(System.in);
        a=teclado.nextInt();
        
        /*Un número es par cuando al dividir entre 2 el residuo es 0*/
        numero_es_par=(a%2==0);  
        
        if (numero_es_par) {
            //Si es par, ejecuto instrucciones
            System.out.println("El número "+a+" es par");
        } else {
            System.out.println("El número "+a+" no es par");
        }
        
    }
    
}
