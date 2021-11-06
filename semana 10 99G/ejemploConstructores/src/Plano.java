/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIA
 */
public class Plano {
    /*Determinamos el cuadrante en el que se encuentra el centro del círculo*/
    public static void determinarCuadrante(Circulo circulo) {
        double x=circulo.getX();
        double y=circulo.getY();
        
        //cuadrante 1 (x>0 y>0)
        if (x>0 && y>0) {
            System.out.println("El centro del círculo se encuentra en el cuadrante 1");
        } 
        //cuadrante 2 (x<0 y>0)
        if (x<0 && y>0) {
            System.out.println("El centro del círculo se encuentra en el cuadrante 2");
        }
        //cuadrante 3 (x<0 y<0)
        if (x<0 && y<0) {
            System.out.println("El centro del círculo se encuentra en el cuadrante 3");
        }
        //cuadrante 4 (x>0 y<0)
        if (x>0 && y<0) {
            System.out.println("El centro del círculo se encuentra en el cuadrante 4");
        }

    }
}
