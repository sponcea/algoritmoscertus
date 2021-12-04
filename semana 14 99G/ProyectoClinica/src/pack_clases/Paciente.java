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
    private String fechaPrimeraConsulta;
    
    /*Constructores*/

    public Paciente(int nroHistoria, String fechaPrimeraConsulta, String nombre, int edad, String sexo, double peso, double altura) {
        /*super invoca al Constructor de la clase padre*/
        super(nombre, edad, sexo, peso, altura);
        
        /*Ahora asignamos los demás parámetros a los respectivos atributos*/
        this.nroHistoria = nroHistoria;
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    }

    public int getNroHistoria() {
        return nroHistoria;
    }

    public void setNroHistoria(int nroHistoria) {
        this.nroHistoria = nroHistoria;
    }

    public String getFechaPrimeraConsulta() {
        return fechaPrimeraConsulta;
    }

    public void setFechaPrimeraConsulta(String fechaPrimeraConsulta) {
        this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    }
    
    public String calcularIMC() {
        /*Como los atributos heredados son private, solo se pueden acceder a través de sus getters y setters*/
        double peso= this.getPeso();
        double altura=this.getAltura();
        double imc=peso/pow(altura,2);
        
        if (imc<18.5) {
            return "Bajo de peso";
        } else if (imc>=18.5 && imc<24.9) {
            return "Normal";
        }  else if (imc>=24.9 && imc<29.9) {
            return "Sobrepeso";
        } else if (imc>=29.9) {
            return "Obeso";
        } else {
            return "Error en el cálculo";
        }
    }

    @Override
    public void imprimirInformacionImportante() {
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("IMC: "+this.calcularIMC());
    }
    
}
