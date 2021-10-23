/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIA
 */
public class nuevaBusqueda {
    public static int buscar(int num, int[]a) {
        int resultado=-1;
        //Este método devuelve la posición del número buscado, en caso se encuentre dentro del arreglo
        //Si el arreglo está vacío, retorna -2
        //Si no está en el arreglo, retorna -1
        if (a.length==0) { //está vacío
            resultado =-2;
        }
        for (int i=0; i<=a.length-1; i++) {
            if (a[i]==num) {
                resultado=i; //Si el número se encuentra dentro, devuelve la posición del número
            } 
        }
        return resultado;
    }
}
