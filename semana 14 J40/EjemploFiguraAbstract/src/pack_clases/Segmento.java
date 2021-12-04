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
public class Segmento extends Figura1D {
    public Segmento(int color, int x, int y) {
        super(color, x, y);
    }
    @Override
    public void borra() {
        System.out.println("Borrando segmento...");
    }

    @Override
    public void dibuja() {
        System.out.println("Dibujando segmento...");
    }
    
}
