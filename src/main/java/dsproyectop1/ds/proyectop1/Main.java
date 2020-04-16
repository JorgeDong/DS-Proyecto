/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1;

import dsproyectop1.ds.proyectop1.facade.PaneMaker;
import dsproyectop1.ds.proyectop1.factory.Nivel;
import dsproyectop1.ds.proyectop1.factory.niveles.NivelAvanzado;
import dsproyectop1.ds.proyectop1.factory.niveles.NivelBasico;
import dsproyectop1.ds.proyectop1.factory.niveles.NivelIntermedio;
import dsproyectop1.ds.proyectop1.singleton.Database;
import dsproyectop1.ds.proyectop1.singleton.DatabaseConnection;

/**
 *
 * @author coque
 */
public class Main {
    
    public static void main(String[] args) {
        //Database db;
        PaneMaker paneMaker = new PaneMaker();
        String nombreUsuario;

        
       // db = DatabaseConnection.getConnection();
        
        String[] options = {"Iniciar Juego", "Salir"};
        String mensaje = "Es necesario que seleccione una opcion";
        if(paneMaker.paneOptions(options, mensaje) == 1){
            System.exit(0); 
        }
        
        mensaje = "Ingrese nombre de usuario";
        nombreUsuario = paneMaker.paneInput(mensaje);
        
        
        String[] optionsMenu = {"Nivel Básico", "Nivel Intermedio","Nivel Avanzado","Registros"};
        mensaje = "Bienenido " + nombreUsuario + " Selecciona una opción para iniciar el juego:";
        int seleccionMenu = paneMaker.paneOptions(optionsMenu,mensaje);
        
        
        String[] optionsObjetos = {"20", "35","50"};
        mensaje = "Selecciona la cantidad de basura a clasificar.";
        int cantidadObjetos = paneMaker.paneOptions(optionsObjetos, mensaje);
        
        switch (seleccionMenu){
            case 0:
                Nivel nivelBasico = new NivelBasico();
                nivelBasico.ejecutarNivel(cantidadObjetos);           
                break; // break es opcional
            case 1:
                Nivel nivelIntermedio = new NivelIntermedio();
                nivelIntermedio.ejecutarNivel(cantidadObjetos); 
                break; // break es opcional
            case 2:
                Nivel nivelAvanzado = new NivelAvanzado();
                nivelAvanzado.ejecutarNivel(cantidadObjetos); 
                break; // break es opcional
            default : 
                System.exit(0);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
    }
}
