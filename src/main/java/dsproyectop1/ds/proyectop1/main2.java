/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author coque
 */
public class main2 {
    
    public static void main(String[] args) {
         //*************** Concetar con la base de datos*********************
        String base = "VfmPbt0NKi";
        String user = "VfmPbt0NKi";
        String password = "C1t0EIKAKP";
        String url = "jdbc:mysql://remotemysql.com:3306/"+ base;
        Connection conn = null;
        
        try { 
            //Class.forName("com.mysql.jdbc.Driver");
            
            conn = (Connection) DriverManager.getConnection(url,user,password);
            System.out.println("Conexion exitosa");
            
             String query = "SELECT id,nombre FROM basura WHERE idBasico = 2";
              Statement st = conn.createStatement();
              ResultSet rs = st.executeQuery(query);
                      
                System.out.print(rs);
              
              while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
//        String lastName = rs.getString("last_name");
//        Date dateCreated = rs.getDate("date_created");
//        boolean isAdmin = rs.getBoolean("is_admin");
//        int numPoints = rs.getInt("num_points");
        
        // print the results
        System.out.format("%s,%s\n", id, nombre);
      }
      st.close();
              
             
            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            System.exit(0); 
        }
    }
}
