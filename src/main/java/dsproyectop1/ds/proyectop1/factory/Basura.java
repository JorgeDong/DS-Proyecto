/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.factory;

import java.util.ArrayList;

/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong y Luis
 * @version: 21/02/2020
*/
public abstract class Basura {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private ArrayList nombresBasura = new ArrayList();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private ArrayList idBasura = new ArrayList();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public abstract String mostrarDescripcionNivel();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public abstract String mostrarTipoBasura();
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public ArrayList getNombresBasura() {
        return this.nombresBasura;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @param nombresBasuraParam El número de ítems (números aleatorios) de que consta la serie
    */
    public void setNombresBasura(ArrayList nombresBasuraParam) {
        this.nombresBasura = nombresBasuraParam;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public ArrayList getidBasura() {
        return this.nombresBasura;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @param idBasuraParam El número de ítems (números aleatorios) de que consta la serie
    */
    public void setidBasuraBasura(ArrayList idBasuraParam) {
        this.nombresBasura = idBasura;
    }
}
