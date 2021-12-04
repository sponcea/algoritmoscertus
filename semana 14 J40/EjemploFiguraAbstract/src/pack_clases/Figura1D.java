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
public abstract class Figura1D extends Figura {
    private int coordX;
    private int coordY;

    public Figura1D(int color, int coordX, int coordY) {
        super(color);
        this.coordX=coordX;
        this.coordY=coordY;
    }
    
    
}
