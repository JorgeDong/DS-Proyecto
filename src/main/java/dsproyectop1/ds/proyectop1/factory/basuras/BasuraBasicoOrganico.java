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
public class BasuraBasicoOrganico extends Basura{
    
    public BasuraBasicoOrganico(){
        Database db = DatabaseConnection.getConnection();
        String sql = "SELECT idBasico,nombre FROM basura WHERE idBasico = 1";
        nombresBasura = db.query(sql,"basico");
       // DatabaseConnection.clearConnection(); 
        
    }

}
