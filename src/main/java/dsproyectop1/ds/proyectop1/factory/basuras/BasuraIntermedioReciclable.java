/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.factory.basuras;

import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.singleton.Database;
import dsproyectop1.ds.proyectop1.singleton.DatabaseConnection;

/**
 *
 * @author coque
 */
public class BasuraIntermedioReciclable extends Basura{
    public BasuraIntermedioReciclable() {
        Database db = DatabaseConnection.getConnection();
        String sql = "SELECT idIntermedio,nombre FROM basura WHERE idIntermedio = 3";
        nombresBasura = db.query(sql,"intermedio"); 
        //DatabaseConnection.clearConnection();     
    }
}
