/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.facade;

import javax.swing.JOptionPane;
/***
 * Esta clase define metodos que cada clase que herede debe implementar.
 * @author: JorgeDong y Luis
 * @version: 21/02/2020
*/
public class PaneMaker {
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    */
    private String titulo = "Juego Clasificar Basura";
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @param options El parámetro numeroItems define el número de element
    * @param message El parámetro numeroItems define el número de element
    * @return El número de ítems (números aleatorios) de que consta la serie
    */
    public int paneOptions(final String[] options, final String message) {
        int seleccion = JOptionPane.showOptionDialog(null,
                message, this.titulo,
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        return seleccion;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    * @param message El parámetro numeroItems define el número de element
    */
    public String paneInput(final String message) {
        String respuesta = JOptionPane.showInputDialog(null,
                message, this.titulo,
            JOptionPane.QUESTION_MESSAGE);
        return respuesta;
    }
    /**
    * Método que devuelve el número de ítems (números aleatorios) existentes en
    * la serie.
    * @return El número de ítems (números aleatorios) de que consta la serie
    * @param message El parámetro numeroItems define el número de element
    */
    public int paneConfirm(final String message) {
        int input = JOptionPane.showConfirmDialog(null,
            message, this.titulo, JOptionPane.DEFAULT_OPTION);
        return input;
    }
}
