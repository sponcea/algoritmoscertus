/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author DIA
 */
public class Conexion {
    static String bd="ejemplojava";
    static String password="";
    static String login="root";
    static String url="jdbc:mysql://localhost/"+bd;
    
    Connection conn=null;
    
    public Conexion() {
        try {
            //Obtener el drive de mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexion
            conn=DriverManager.getConnection(url, login, password);
            //
            if (conn!=null){
                System.out.println("Conexion a base de datos "+bd+" OK");
            }
        }
        catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
    public void desconectar() {
        conn=null;
    }
}
