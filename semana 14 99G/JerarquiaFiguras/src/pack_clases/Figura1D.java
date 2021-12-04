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
    /*punto inicial*/
    private int xIni;
    private int yIni;
    
    /*punto final*/
    private int xFin;
    private int yFin;
    
    public Figura1D(int color, int xIni, int yIni, int xFin, int yFin) {
        super(color);
        this.xIni=xIni;
        this.yIni=yIni;
        this.xFin=xFin;
        this.yFin=yFin;
    }
}
