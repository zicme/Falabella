/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    public  static Statement stmt;
    public static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(java.lang.ClassNotFoundException err){
            JOptionPane.showMessageDialog(null,"ERROR: No se encuentra el driver de MYSQL");
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/Falabella","root","alumno");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR: No se pudo conectar a base de datos");
            System.exit(0);
        }
        return con;
    }
}
