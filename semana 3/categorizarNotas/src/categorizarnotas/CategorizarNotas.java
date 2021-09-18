/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorizarnotas;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class CategorizarNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese la nota del alumno");
        nota=teclado.nextInt();
        
        boolean es_nota_valida=(nota>=0) && (nota<=20);
        
        /*if ((nota>=0) && (nota<=20)) { //Es el caso ideal
            //categorizo, pues el if anterior garantiza que estamos en el rango correcto
            if (nota<=5) { //Si está en el rango entre 0 y 5
                System.out.println("El profesor desea conversar con usted");
            } else if (nota<=10){
                System.out.println("Debe preparse mejor para futuros exámenes");
            } else if (nota<=15) {
                System.out.println("Felicitaciones, aprobó pero puede mejorar mucho");
            } else if (nota<=17) {
                System.out.println("Felicitaciones, se nota que se ha preparado bien");
            } else {
                //La nota es mayor que 17 pero menor que 20
                System.out.println("Usted lo ha hecho muy bien, siga así");
            }
        } else  {
            System.out.println("Nota incorrecta, debe escribir una nota entre 0 y 20");
        }*/
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("El profesor desea conversar con usted");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("El profesor desea conversar con usted");
                break;
            default:
                System.out.println("El rango de la nota debe ser entre 0 y 20");
        }
        
    }
    
}
