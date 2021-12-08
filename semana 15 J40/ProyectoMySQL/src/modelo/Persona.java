/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DIA
 */
public class Persona {
    private String dni;
    private String nombre;
    
    public void registrarPersona() {
        Conexion conex=new Conexion();
        try {
            //Creo la conexión y la cadena en SQL para ingresar una nueva fila a la tabla persona
            Statement personaConexion=conex.getConnection().createStatement();
            personaConexion.executeUpdate("INSERT INTO persona VALUES (NULL, '"+this.dni+"', '"+this.nombre+"')");
            
            //Si funcionó, avisamos al usuario
            JOptionPane.showMessageDialog(null, "Se ha registrado la persoa exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            //cerrar la conexión
            personaConexion.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registró");
        }
        
    }

    public void modificarPersona() {
        Conexion conex= new Conexion();
	try{
            String consulta="UPDATE persona SET dni = ? , nombre=? WHERE dni= ? ";
            PreparedStatement personaConexion = conex.getConnection().prepareStatement(consulta);
	    personaConexion.setString(1, this.dni);
            personaConexion.setString(2, this.nombre);
	    personaConexion.setString(3, this.dni);
            personaConexion.executeUpdate();
            JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmación",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarPersona() {
        Conexion conex= new Conexion();
    	try {
            Statement personaConexion = conex.getConnection().createStatement();
            personaConexion.executeUpdate("DELETE FROM persona WHERE dni='"+this.dni+"'");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
            personaConexion.close();
            conex.desconectar();
	} catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Elimino");
	}        
    }    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
