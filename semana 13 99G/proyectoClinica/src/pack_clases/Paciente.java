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
    private String nroHistoria;
    private Fecha fechaPrimeraConsulta;
    private double imc;
    
    /*Constructores*/
    public Paciente() {
        
    }
    public Paciente(String nroHistoria, Fecha fechaPrimeraConsulta, String nombre, int edad, String sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroHistoria = nroHistoria;
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    }    
   /*Métodos*/

    public String getNroHistoria() {
        return nroHistoria;
    }

    public void setNroHistoria(String nroHistoria) {
        this.nroHistoria = nroHistoria;
    }

    public Fecha getFechaPrimeraConsulta() {
        return fechaPrimeraConsulta;
    }

    public void setFechaPrimeraConsulta(Fecha fechaPrimeraConsulta) {
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    
    
    public String calcularIMC() {
        if (this.imc>0 && this.imc<18.5){
            return "Bajo de peso";
        } else if (this.imc>=18.5 && this.imc<=24.9) {
            return "Normal";
        } else if (this.imc>=25 && this.imc<=29.9) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }
    
}
