/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIA
 */
public class numeroMayor {
    public int obtenerNumeroMayor(int a, int b, int c) {
        int mayor;
        
        //Validamos que sean diferentes
        if (a!=b && a!=c && b!=c) {
            if (a>b && a>c) {
                mayor=a;
            } else if (c>b){ //si b>a, c>a y c>b
                mayor=c;
            } else {
                mayor=b;
            }
            
        } else {
            mayor=-1;
        }
        
        
        return mayor;
    }
}
