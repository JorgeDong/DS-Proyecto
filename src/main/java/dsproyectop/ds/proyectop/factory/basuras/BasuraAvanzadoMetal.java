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
public class BasuraAvanzadoMetal extends Basura {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private String status;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public BasuraAvanzadoMetal() {
        Database db = DatabaseConnection.getConnection();
        String sql = "SELECT idAvanzado,nombre "
                + "FROM basura "
                + "WHERE idAvanzado = 4";
        setNombresBasura(db.query(sql, "avanzado"));
        status = "funciona BasuraAvanzadoMetal";
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
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    @Override
    public String mostrarDescripcionNivel() {
        return "Nivel Avanzado";
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    @Override
    public String mostrarTipoBasura() {
        return "Tipo de basura: Metal";
    }
}
