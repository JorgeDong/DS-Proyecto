/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author coque
 */
public class DatabaseConnection extends Database {
    private static Database uniqueInstance;

    private DatabaseConnection(){
        try {   
            connection = (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
    
    public static Database getConnection(){
        if(uniqueInstance== null){
            uniqueInstance = new DatabaseConnection();
        }
        return uniqueInstance;
    }

    public static void clearConnection(){
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexion cerrada");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
            }
        }
        uniqueInstance = null;
    }
    
}
