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
    
    private int centro;
    private double radio;

    public Circulo(int centro, double radio, int color, int colorRelleno) {
        super(color, colorRelleno);
        this.centro = centro;
        this.radio = radio;
    }
    
    @Override
    public void borra() {
        System.out.println("Borrando círculo");
    }

    @Override
    public void dibuja() {
        System.out.println("Dibujando círculo");
    }
}
