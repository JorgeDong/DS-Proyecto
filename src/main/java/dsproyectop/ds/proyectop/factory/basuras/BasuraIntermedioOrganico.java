/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.factory.basuras;

import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.singleton.Database;
import dsproyectop.ds.proyectop.singleton.DatabaseConnection;

/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong y Luis
 * @version: 21/02/2020
*/
public class BasuraIntermedioOrganico extends Basura {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private String status;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    @Override
    public String mostrarDescripcionNivel() {
        return "Nivel Intermedio";
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    @Override
    public String mostrarTipoBasura() {
        return "Tipo de basura: Organico";
    }
   /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public BasuraIntermedioOrganico() {
        Database db = DatabaseConnection.getConnection();
        String sql = "SELECT idIntermedio,nombre "
                + "FROM basura WHERE idIntermedio = 1";
        setNombresBasura(db.query(sql, "intermedio"));
        status = "funciona BasuraIntermedioOrganico";
        //DatabaseConnection.clearConnection();
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public String getStatus() {
        return this.status;
    }
}
