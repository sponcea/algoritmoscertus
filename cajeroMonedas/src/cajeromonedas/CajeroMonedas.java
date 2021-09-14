/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeromonedas;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class CajeroMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int monto;
        int monedas5, monedas2, monedas1;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el monto que desea retirar:");
        monto=teclado.nextInt();
        
        //obtenemos la cantidad de monedas de 5
        monedas5=monto/5;
        //actualizamos el monto inicial
        monto=monto%5;
        
        //obtenemos la cantidad de monedas de 2
        monedas2=monto/2;
        //actualizamos el monto
        monto=monto%2;
        
        monedas1=monto/1;
        
        System.out.println("Moneda de 5 recibidas: "+monedas5);
        System.out.println("Moneda de 2 recibidas: "+monedas2);
        System.out.println("Moneda de 1 recibidas: "+monedas1);
        
    }
    
}
