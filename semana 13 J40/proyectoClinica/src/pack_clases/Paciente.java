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
public class Paciente extends Persona {

    private int nroHistoria;
    private Fecha fechaPrimeraConsulta;

    /*constructores*/
    
    /*métodos*/

    public Paciente() {

    }
    public Paciente(int nroHistoria, Fecha fechaPrimeraConsulta, String nombre, int edad, String sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroHistoria = nroHistoria;
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    }
    
}
