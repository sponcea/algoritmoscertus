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
public abstract class Figura {
    private int color;
    
    /*Constructor*/
    public Figura(int color) {
        this.color=color;
    }
    
    /*Métodos*/
    public void cambiaColor(int color) {
        this.color=color;
    }
    public abstract void borra();
    public abstract void dibuja();
    
}
