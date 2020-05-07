/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong y Luis
 * @version: 21/02/2020
*/
public abstract class Database {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public static final String BASE = "VfmPbt0NKi";
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public static final String USER = "VfmPbt0NKi";
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public static final String PASSWORD = "C1t0EIKAKP";
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public static final String URL = "jdbc:mysql://remotemysql.com:3306/"
        + BASE;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private static Connection connection;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public void probarDriverMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException cnfex) {
            System.out.println("Problem in"
                + " loading MySQL JDBC driver");
            cnfex.printStackTrace();
        }
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @param sql El parámetro numeroItems define el número de element
    * @param nivel El parámetro numeroItems define el número de element
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public ArrayList query(final String sql, final String nivel) {
        Database db = DatabaseConnection.getConnection();
         ArrayList nombres = new ArrayList();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String id = "";
                if (nivel == "basico") {
                    id = rs.getString("idBasico");
                } else if (nivel == "intermedio") {
                    id = rs.getString("idIntermedio");
                } else if (nivel == "avanzado") {
                    id = rs.getString("idAvanzado");
                }
                String cad = id + "," + nombre;
                nombres.add(cad);
            }
            return nombres;
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.exit(0);
            return null;
        }
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @param conn El parámetro numeroItems define el número de element
    */
    public void setConnection(final Connection conn) {
         this.connection = conn;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public Connection getConnections() {
        return this.connection;
    }
    
   public void closeConnection(){
      DatabaseConnection.clearConnection(this.connection);
   }
    
    
    
}
