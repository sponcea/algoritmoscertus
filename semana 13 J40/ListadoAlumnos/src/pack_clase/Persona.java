/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clase;

/**
 *
 * @author DIA
 */
public class Persona {
    //atributos
    private String nombre;
    private String apellido;
    private String correo;
    
    //Constructores
    public Persona() {
        
    }
    public Persona(String nombre, String apellido, String correo) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
    }
    //metodos get y set

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
