/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorizacionnota;

import java.util.Scanner;

/**
 *
 * @author DIA
 */
public class CategorizacionNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dato de entrada
        int nota;
        
        //Leer la nota que ingresa el usuario
        System.out.println("Ingrese una nota para categorizarla: ");
        Scanner teclado=new Scanner(System.in);
        
        nota=teclado.nextInt();
        
        /*Usamos una selectiva múltiple para determinar si estamos dentro de un rango*/
        if (nota>=0 && nota<=20){
            //Empezamos a categorizar
            if (nota <=5) {//nota>=0 && nota<=5
                System.out.println("El profesor desea conversar con usted");
            } else if (nota<=10){ //nota>5 && nota<=10
                System.out.println("Debe prepararse mejor para futuros exámenes");
            } else if (nota<=15) { //nota>10 && nota<=15
                System.out.println("Felicitaciones, aprobó pero puede mejorar mucho");
            } else if (nota<=17) { //nota>15 && nota <=17
                System.out.println("Felicitaciones, se nota que se ha preparado bien");
            } else { //Cualquier otra nota que cumpla nota>17 && nota<=20
                System.out.println("Usted ha hecho un muy buen trabajo, siga así");
            }
        } else {
            System.out.println("Nota incorrecta, no se puede categorizar");
        }
        //Con switch
//        switch(nota) {
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("El profesor desea hablar con usted");
//                break;
//            case 6:
//            case 7:
//             
//        }
        
    }
    
}
