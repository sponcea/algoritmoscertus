
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIA
 */
public class BuscaEnArray {
    
    public static int busca(int ele, int[]a) throws SecuenciaVacia {
        if (a==null){
            throw new SecuenciaVacia("El arreglo está vacío");

        }
        for (int x = 0; x < a.length; x++) {
            if (a[x] == ele) {
                return x;
            }
        }
        return -1;
    }

    public static class SecuenciaVacia extends Exception {
        public SecuenciaVacia(String el_arreglo_está_vacío) {
            throw new UnsupportedOperationException(el_arreglo_está_vacío); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
