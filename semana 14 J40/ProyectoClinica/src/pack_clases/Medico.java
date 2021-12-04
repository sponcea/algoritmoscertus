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
    private int nroColegiatura;
    private String especialidad;

    public Medico() {

    }
    public Medico(int nroColegiatura, String especialidad, String nombre, int edad, String sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.nroColegiatura = nroColegiatura;
        this.especialidad = especialidad;
    }
    
    @Override
    public void imprimirInfo() {
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Especialidad: "+this.especialidad);
        System.out.println("Precio de la consulta: "+this.calcularPrecioConsulta());
    }

    public double calcularPrecioConsulta() {
        if (this.especialidad.equals("otorrino")) {
            return 40;
        } else  if (this.especialidad.equals("traumatología")) {
            return 45;
        } else if (this.especialidad.equals("dermatología")) {
            return 50;
        } else {
            return 65;
        }
    }
    
}
