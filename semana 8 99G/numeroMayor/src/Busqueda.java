/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIA
 */
public class Busqueda {
    public static int busca(int numero, int[]arreglo) {
        //Validamos que el arreglo esté vacío (no tenga elementos)
        //arreglo vacío, devuelve -1
        //número encontrado, devuelve la posición i
        //número no encontrado devuelve -2
        //arreglo sin valor inicial, devuelve -3
        //Por defecto le colocamos el valor de no encontrado
        int resultado=-2;
        if (arreglo==null) {
            resultado=-3;
        } else if (arreglo.length==0) {
            resultado= -1;
        } else { //El arreglo tiene elementos
            for (int i=0; i<=arreglo.length-1;i++) {
                //Si el elemento que obtengo del arreglo es igual al número buscado, encontré el número
                if (arreglo[i]==numero){
                    resultado=i;
                }
            }            
        }
        return resultado;
    }
}
