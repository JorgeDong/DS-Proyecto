/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong y Luis
 * @version: 21/02/2020
*/
public final class DatabaseConnection extends Database {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private static Database uniqueInstance;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private DatabaseConnection() {
        try {
             setConnection((Connection) DriverManager.getConnection(URL,
                USER, PASSWORD));
            System.out.println("Conexion exitosa");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public static Database getConnection() {
        if (uniqueInstance == null) {
            uniqueInstance = new DatabaseConnection();
        }
        return uniqueInstance;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes.
    * en la serie.
    * @param connection la conexión
    */
    public static void clearConnection(final Connection connection) {
        if (uniqueInstance != null) {
            uniqueInstance = null;
            try {
            connection.close();
             System.out.println("Conexion cerrada");
            } catch (SQLException ex) {
                // handle any errors
                System.out.println("SQLException: " + ex.getMessage());
                System.exit(0);
            }
        }
    }
}
