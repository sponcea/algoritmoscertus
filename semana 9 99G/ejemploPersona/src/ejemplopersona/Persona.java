/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopersona;

/**
 *
 * @author DIA
 */
public class Persona {

    /*atributos*/
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    /*métodos u operaciones*/
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
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }    
    
    public void estudiar() {
        System.out.println(this.getNombre()+" estudia");
    }
    public void trabajar() {
        System.out.println(this.getNombre()+" trabaja");
    }
    public void descansar() {
        System.out.println(this.getNombre()+" duerme");
    }
    
}
