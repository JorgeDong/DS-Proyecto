/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import dsproyectop1.ds.proyectop1.singleton.Database;
import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.singleton.Database;
import dsproyectop1.ds.proyectop1.singleton.DatabaseConnection;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author coque
 */
public class DatabaseTest {
    Database db;
    @Before
    public void setUp(){
        db = DatabaseConnection.getConnection();
    }
    
    @Test
    public void testDriver(){
        db.probarDriverMySQL();
    }
    
    @Test
    public void clearConnectionTest(){
        DatabaseConnection.clearConnection();
    }
}