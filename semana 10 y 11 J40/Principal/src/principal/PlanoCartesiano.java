/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author DIA
 */
public class PlanoCartesiano {
    public static void determinarCuadrante(Circulo circulo) {
        /*obtenemos coordenadas x e y*/
        double x=circulo.getX();
        double y=circulo.getY();
        
        /*determinamos dónde se encuentra el centro del círculo*/
        if (x>0 && y>0) {
            System.out.println("El centro del "+circulo.toString()+" se encuentra en el primer cuadrante");
        } else if (y>0 && x<0) {
            System.out.println("El centro del "+circulo.toString()+" se encuentra en el segundo cuadrante");
        } else if (y<0 && x<0) {
            System.out.println("El centro del "+circulo.toString()+" se encuentra en el tercer cuadrante");
        } else if (y<0 && x>0) {
            System.out.println("El centro del "+circulo.toString()+" se encuentra en el cuarto cuadrante");
        } else {
            System.out.println("El centro del "+circulo.toString()+" se encuentra en el punto (0,0)");
        }
    }
}
