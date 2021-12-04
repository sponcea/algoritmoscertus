/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

/**
 *
 * @author DIA
 */
public class Recta extends Figura1D {

    public Recta(int color, int xIni, int yIni, int xFin, int yFin) {
        super(color, xIni, yIni, xFin, yFin);
    }

    @Override
    public void borrar() {
        System.out.println("Borrando la recta");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando la recta");
    }

    
}
