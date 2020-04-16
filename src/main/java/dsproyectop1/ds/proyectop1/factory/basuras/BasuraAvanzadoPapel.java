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
public class BasuraAvanzadoPapel extends Basura{
        String status;
        public BasuraAvanzadoPapel(){
        Database db = DatabaseConnection.getConnection();
        String sql = "SELECT idAvanzado,nombre FROM basura WHERE idAvanzado = 2";
        nombresBasura = db.query(sql,"avanzado");
        status = "funciona BasuraAvanzadoPapel";
        //DatabaseConnection.clearConnection();
    }
    
    public String getStatus(){
        return this.status;
    }
        
        
}
