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
public class Circulo extends Figura2D {

    private int xCentro;
    private int yCentro;
    private double radio;
    
    public Circulo(int color, int colorRelleno, int xCentro, int yCentro, double radio) {
        super(color, colorRelleno);
        this.xCentro=xCentro;
        this.yCentro=yCentro;
        this.radio=radio;
    }

    @Override
    public void borrar() {
        System.out.println("Borrando un círculo");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
    
}
