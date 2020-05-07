/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop;

import dsproyectop.ds.proyectop.bridge.PaneMaker;
import dsproyectop.ds.proyectop.factory.Nivel;
import dsproyectop.ds.proyectop.factory.niveles.NivelAvanzado;
import dsproyectop.ds.proyectop.factory.niveles.NivelBasico;
import dsproyectop.ds.proyectop.factory.niveles.NivelIntermedio;

/**
 *
 * @author coque
 */
public final class Main {
    /**
     *Construcotr never call.
     */
    private Main() {
        //not called.
     }
    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        //Database db;
        PaneMaker paneMaker = new PaneMaker();
        String nombreUsuario;
        String[] options = {"Iniciar Juego", "Salir"};
        String mensaje = "Es necesario que seleccione una opcion";
        if (paneMaker.paneOptions(options, mensaje) == 1) {
            System.exit(0);
        }
        mensaje = "Ingrese nombre de usuario";
        nombreUsuario = paneMaker.paneInput(mensaje);
        String[] optionsMenu = {"Nivel Básico",
        "Nivel Intermedio", "Nivel Avanzado"};
        mensaje = "Bienenido " + nombreUsuario
        + " Selecciona una opción para iniciar el juego:";
        int seleccionMenu = paneMaker.paneOptions(optionsMenu, mensaje);
        String[] optionsObjetos = {"20", "35", "50"};
        mensaje = "Selecciona la cantidad de basura a clasificar.";
        int cantidadObjetos = paneMaker.paneOptions(optionsObjetos, mensaje);
        switch (seleccionMenu) {
            case 0:
                String[] basuraMenuBasico = {"Orgánico", "Inorgánico"};
                int tiempoBasico = 1000;
                Nivel nivelBasico = new NivelBasico();
                nivelBasico.ejecutarNivel(cantidadObjetos,basuraMenuBasico,tiempoBasico);
                break; // break es opcional
            case 1:
                String[] basuraMenuIntermedio = {"Orgánico", "Inorgánico", "Reciclable"};
                int tiempoIntermedio = 2000;
                Nivel nivelIntermedio = new NivelIntermedio();
                nivelIntermedio.ejecutarNivel(cantidadObjetos,basuraMenuIntermedio,tiempoIntermedio);
                break; // break es opcional
            case 2:
                String[] basuraMenuAvanzado = {"Orgánico", "Papel",
                 "Vidrio", "Metal", "Plástico", "Textiles",
                 "Basura tecnológica"};
                 int tiempoAvanzado = 3000;
                 
                Nivel nivelAvanzado = new NivelAvanzado();
                nivelAvanzado.ejecutarNivel(cantidadObjetos,basuraMenuAvanzado,tiempoAvanzado);
                break; // break es opcional
            default :
            System.exit(0);
        }
    }
}
