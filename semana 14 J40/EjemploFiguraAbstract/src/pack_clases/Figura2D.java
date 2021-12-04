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
public abstract class Figura2D extends Figura {
    private int colorRelleno;
    
    public Figura2D(int color, int colorRelleno) {
        super(color);
        this.colorRelleno=colorRelleno;
    }
    
    public void cambiaRelleno(int color){
        this.colorRelleno=color;
    }
}
