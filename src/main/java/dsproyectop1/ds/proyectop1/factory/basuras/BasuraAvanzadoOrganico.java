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
public class BasuraAvanzadoOrganico extends Basura {
        String status;
        
        public BasuraAvanzadoOrganico() {
        Database db = DatabaseConnection.getConnection();
        String sql = "SELECT idAvanzado,nombre "
                + "FROM basura "
                + "WHERE idAvanzado = 1";
        nombresBasura = db.query(sql,"avanzado");
        status = "funciona BasuraAvanzadoOrganico";
        
    }
    
    public String getStatus() {
        return this.status;
    }
    
    @Override
    public String mostrarDescripcionNivel() {
        return "Nivel Avanzado";
    }

    @Override
    public String mostrarTipoBasura() {
        return "Tipo de basura: Organico";
    }
        
}
