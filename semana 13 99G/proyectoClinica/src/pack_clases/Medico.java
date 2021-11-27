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
public class Medico extends Persona {
    /*atributos*/
    private String nroColegiatura;
    private String especialidad;

    public Medico() {
    }
    public Medico(String nroColegiatura, String especialidad, String nombre, int edad, String sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroColegiatura = nroColegiatura;
        this.especialidad = especialidad;
    }

    public String getNroColegiatura() {
        return nroColegiatura;
    }

    public void setNroColegiatura(String nroColegiatura) {
        this.nroColegiatura = nroColegiatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public double calcularPrecioConsulta(){
        if (especialidad.equals("otorrino")) {
            return 40;
        } else if (especialidad.equals("traumatología")) {
            return 45;
        } else if (especialidad.equals("dermatología")) {
            return 50;
        } else {
            return 65;
        }
    }
    
}
