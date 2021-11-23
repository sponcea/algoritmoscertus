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
public class Medico {
    private int nroColegiatura;
    private String especialidad;

    public Medico() {
    }
    public Medico(int nroColegiatura, String especialidad) {
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
    
    public double calcularPrecioConsulta() {
        if (especialidad.equals("otorrino")) {
            return 40;
        } else if (especialidad.equals("traumatologia")) {
            return 45;
        } else if (especialidad.equals("dermatologia")) {
            return 50;
        } else {
            return 65;
        }
    }
        
}
