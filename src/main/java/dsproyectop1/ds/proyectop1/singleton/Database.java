/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author coque
 */
public abstract class Database {
    public static final String BASE = "VfmPbt0NKi";
    public static final String USER = "VfmPbt0NKi";
    public static final String PASSWORD = "C1t0EIKAKP";
    public static final String URL = "jdbc:mysql://remotemysql.com:3306/" + BASE;
    
    public static Connection connection;
    
    public void probarDriverMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in"
                    + " loading MySQL JDBC driver");
            cnfex.printStackTrace();
        }
    }
    
    
    public ArrayList query(String sql,String nivel){
        Database db = DatabaseConnection.getConnection();
         ArrayList nombres = new ArrayList();
        try { 
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String nombre = rs.getString("nombre");
                String id = "";
                if(nivel == "basico"){
                    id = rs.getString("idBasico");
                }else if(nivel == "intermedio"){
                    id = rs.getString("idIntermedio");
                }else if(nivel == "avanzado"){
                    id = rs.getString("idAvanzado");
                }
                String cad = id + "," + nombre;
                nombres.add(cad);
            }
            return nombres;
            
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            System.exit(0); 
            return null;
        }
    }
    
    
    
}
