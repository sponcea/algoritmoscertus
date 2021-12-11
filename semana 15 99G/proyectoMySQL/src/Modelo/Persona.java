/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DIA
 */
public class Persona {
    private String dni;
    private String nombre;

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
    
    public void registrarPersona() {
        Conexion conexion=new Conexion();
        try {
            Statement personaConexion=conexion.getConnection().createStatement();
            personaConexion.executeUpdate("INSERT INTO persona VALUES (NULL, '"+this.dni+"', '"+this.nombre+"')");
            JOptionPane.showMessageDialog(null, "Registro correcto", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            personaConexion.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
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
    
}
