/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciociclicas;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class EjercicioCiclicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        int i,n, impar, factorial;
        double cubo;
        String nombre;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese una de las opciones: ");
        System.out.println("1: Imprimir los N primeros números al cubo");
        System.out.println("2: Imprimir los N primeros números naturales impares");
        System.out.println("3: Imprimir los N primeros números naturales factoriales");
        System.out.println("4: Leer el nombre de una persona e imprimirlo N veces");
        System.out.println("5: Leer número entero e imprimir su tabla de multiplicar");

        opcion=teclado.nextInt();
        if (opcion==1) {
            //imprimir los N primeros números al cubo
            System.out.println("Ingrese el rango máximo: ");
            n=teclado.nextInt();
            i=1;
            while(i<=n) {
                cubo=pow(i,3);
                System.out.println("el numero "+i+" al cubo es: "+cubo);
                i++;
            }
        } else if (opcion==2) {
            //imprimir los N primeros números naturales impares
            System.out.println("Ingrese la cantidad de números impares que se deben imprimir: ");
            n=teclado.nextInt();
            i=0;
            while (i<n) {
                impar=2*i+1;
                System.out.println("El número: "+impar+" es impar");
                i++;
                /*Otra forma*/
                /*if (i%2!=0) {
                    //es impar;
                    System.out.println("El número: "+i+" es impar");
                    i++;
                }*/
            }
        } else if (opcion==3) {
            //Imprimir los 5 primeros números naturales factoriales
            System.out.println("Ingrese el número cuyo factorial desea conocer: ");
            n=teclado.nextInt();
            i=1;
            factorial=1;
            while (i<=n) {
                /*en la multiplicación el elemento neutro es 1, por eso se inicializa factorial=1*/
                factorial=factorial*i;
                i++;
            }
            System.out.println("El factorial de "+n+" es: "+factorial);
        } else if (opcion==4) {
            //Leer el nombre de una persona e imprimirlo 25 veces
            System.out.println("Ingrese el nombre de la persona: ");
            nombre=teclado.next();
            i=1;
            while (i<=25) {
                System.out.println("El nombre ingresado es: "+nombre);
                i++;
            }
        } else if (opcion==5) {
            //Leer número entero e imprimir su tabla de multiplicar
            System.out.println("Ingrese el número: ");
            n=teclado.nextInt();
            i=1;
            while (i<=12){
                System.out.println(n+"x"+i+"="+n*i);
                i++;
            }
            
       } else {
            System.out.println("opcion incorrecta");
        }
        
        
    }
    
}
