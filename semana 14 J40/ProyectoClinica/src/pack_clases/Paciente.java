/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

import static java.lang.Math.pow;

/**
 *
 * @author DIA
 */
public class Paciente extends Persona {
    private int nroHistoria;
    private Fecha fechaPrimeraConsulta;
    private double imc;

    public Paciente(int nroHistoria, Fecha fechaPrimeraConsulta, String nombre, int edad, String sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroHistoria = nroHistoria;
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    }
    
    @Override
    public void imprimirInfo() {
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Nro de historia: "+this.nroHistoria);
    }
    
    public String calcularIMC() {
        double altura=this.getAltura();
        double peso=this.getPeso();
        if (imc<18.5) {
            return "Bajo de peso";
        } else if (imc>=18.5 && imc<25) {
            return "Normal";
        } else if (imc>=25 && imc <30 ) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
}
