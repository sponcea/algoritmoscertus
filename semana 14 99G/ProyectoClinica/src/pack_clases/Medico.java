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
public class Medico extends Persona{
    private int nroColegiatura;
    private String especialidad;

    public Medico(int nroColegiatura, String especialidad, String nombre, int edad, String sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroColegiatura = nroColegiatura;
        this.especialidad = especialidad;
    }

    public int getNroColegiatura() {
        return nroColegiatura;
    }

    public void setNroColegiatura(int nroColegiatura) {
        this.nroColegiatura = nroColegiatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public double calculcarPrecioConsulta() {
        if (this.especialidad.equals("otorrino")) {
            return 40;
        } else if (especialidad.equals("traumatología")) {
            return 45;
        } else if (especialidad.equals("dermatología")) {
            return 50;
        } else {
            return 65;
        }
    }

    @Override
    public void imprimirInformacionImportante() {
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Especialidad: "+this.getEspecialidad());
        System.out.println("Costo: "+this.calculcarPrecioConsulta());

    }
}
