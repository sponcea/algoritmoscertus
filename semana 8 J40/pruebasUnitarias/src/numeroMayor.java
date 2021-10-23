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
    
    //devuelve el mayor de 3 números
    public int retornarMayor(int a, int b, int c) {
        int resultado;
        if (a>b && a>c) {
            //El mayor es a
            resultado=a;
        } else if (c>b) { //b es mayor que a, c es mayor que a y c es mayor que b
            resultado=c;
        } else { //Solo queda que b sea el mayor
            resultado=b;
        }
        return resultado;
    }
}
