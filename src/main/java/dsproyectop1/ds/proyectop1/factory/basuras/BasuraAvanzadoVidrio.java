/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.factory.basuras;

import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.singleton.Database;
import dsproyectop1.ds.proyectop1.singleton.DatabaseConnection;

/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong y Luis
 * @version: 21/02/2020
*/
public class BasuraAvanzadoVidrio extends Basura {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private String status;
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    public BasuraAvanzadoVidrio() {
        Database db = DatabaseConnection.getConnection();
        String sql = "SELECT idAvanzado,nombre "
                + "FROM basura WHERE idAvanzado = 3";
        setNombresBasura(db.query(sql, "avanzado"));
        //DatabaseConnection.clearConnection();
        status = "funciona BasuraAvanzadoVidrio";
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
        return "Tipo de basura: Vidrio";
    }
}
