/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIA
 */
public class OtraBusqueda {
        public static int busca(int ele, int[]a) {
        if (a==null){
            return -2;
        }
        for (int x = 0; x < a.length; x++) {
            if (a[x] == ele) {
                return x;
            }
        }
        return -1;
    }
}
