/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.facade;

import javax.swing.JOptionPane;

/**
 *
 * @author coque
 */
public class PaneMaker {
    private String titulo = "Juego Clasificar Basura";
    
    public int paneOptions(String[] options, String message){
        int seleccion = JOptionPane.showOptionDialog(null, 
                message,this.titulo, 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        return seleccion;
    }
    
    public String paneInput(String message){
        String respuesta = JOptionPane.showInputDialog(null, 
                message,this.titulo, 
            JOptionPane.QUESTION_MESSAGE);
        return respuesta;
    }
    
    public int paneConfirm(String message){
        int input = JOptionPane.showConfirmDialog(null, 
            message, this.titulo, JOptionPane.DEFAULT_OPTION);  
        return input;
    }
    
    
}
