/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopersona;

import java.util.HashSet;

/**
 *
 * @author DIA
 */
public class EjemploPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*inicialización e instanciación*/
        Persona persona1=new Persona();
        Persona persona2=new Persona();
        
        /*Accedo al atributo utilizando el setter respectivo, pues el atributo está como private*/
        persona1.setNombre("Carlos");
        persona2.setNombre("Diana");
        persona1.setDni("44412353");

        
        /*invoco a sus métodos*/
        persona1.estudiar();
        persona2.descansar();
        
    }
    
}
