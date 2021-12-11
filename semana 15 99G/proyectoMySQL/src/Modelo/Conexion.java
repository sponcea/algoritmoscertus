/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DIA
 */
public class Conexion {
    
    static String bd="ejemplojava";
    static String login="root";
    static String password="";
    static String url="jdbc:mysql://localhost/"+bd;
    
    Connection conn=null;
    
    /*Constructor*/
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //obtener la conexion
            conn=DriverManager.getConnection(url, login, password);
            if (conn!=null) {
                System.out.println("Conexión a la BD "+bd+" OK");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
    public Connection getConnection() {
        return conn;
    }
    public void desconectar() {
        conn=null;
    }
}
