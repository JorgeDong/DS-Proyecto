/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.factory;

import dsproyectop.ds.proyectop.facade.PaneMaker;
import java.util.ArrayList;

/**
 *
 * @author coque
 */
public abstract class Nivel {
    /**
     * It return the actual level of the game.
     * @return An arrayList.
     */
    protected ArrayList nombresBasuraTotal = new ArrayList();
    /**
     * It return the actual level of the game.
     * @return An arrayList.
     */
    protected ArrayList nombresBasuraSeparado = new ArrayList();
    /**
     * It return the actual level of the game.
     * @return An arrayList.
     */
    protected ArrayList idBasuraTotal = new ArrayList();
    /**
     * It return the actual level of the game.
     * @return An arrayList.
     */
    protected ArrayList resultados = new ArrayList();

    /**
     * Variable cantidadObjetos.
     */
    private int cantidadObjetos;
    /**
     * Variable correctos.
     */
    protected int correctos = 0;
    /**
     * It return the actual level of the game.
     * @return A String.
     */
    public abstract String mostrarDescripcionNivel();
    /**
     * It return the actual level of the game.
     * @param objetos
     * @return An integer.
     */
    public abstract Integer mostrarOpciones(int objetos);
    /**
     * It return the actual level of the game.
     * @param objetos
     * @return An integer.
     */
    public abstract Integer createBasuras(int objetos);
    /**
     * It return the actual level of the game.
     * @param objetos
     * @return A boolean.
     */
    public Boolean ejecutarNivel(final int objetos) {
        final int veinte = 6;
        final int treintaycinco = 7;
        final int ciencuenta = 11;
        createBasuras(objetos);
        mostrarDescripcionNivel();
        System.out.println("entro");
        separarId();
        if (objetos == 0) {
            this.cantidadObjetos = veinte;
        } else if (objetos == 1) {
            this.cantidadObjetos = treintaycinco;
        } else {
            this.cantidadObjetos = ciencuenta;
        }
        mostrarOpciones(this.cantidadObjetos);
        for (int i = 1; i < resultados.size(); i++) {
            System.out.println(resultados.get(i));
        }
        mostrarResultados();
        return true;
    }
    /**
     * It return the actual level of the game.
     * @return A boolean.
     */
    public Boolean separarId() {
        for (int i = 1; i < nombresBasuraTotal.size(); i++) {
            System.out.println(nombresBasuraTotal.get(i));
            String str = nombresBasuraTotal.get(i).toString();
            System.out.println(str);
            String kept = str.substring(0, str.indexOf(","));
             System.out.println(kept);
            idBasuraTotal.add(kept);
            System.out.println(str);
            String remainder = str.substring(
                str.indexOf(",") + 1, str.length());
            System.out.println(remainder);
            nombresBasuraSeparado.add(remainder);
        }
        return true;
    }
    /**
     * It return the actual level of the game.
     * @return A boolean.
     */
    public Boolean mostrarResultados() {
        PaneMaker paneMaker = new PaneMaker();
        //paneMaker.paneConfirm(resultados.toString());
        String mensaje = "<html><table><tr><th>Resultados correctos: "
        + correctos + "/" + cantidadObjetos + "</th></tr>";
        for (int i = 1; i < resultados.size(); i++) {
            System.out.println(resultados.get(i));
            mensaje += "<tr><td>" + resultados.get(i) + "</td></tr>";
        }
        mensaje += "</table></html>";
        paneMaker.paneConfirm(mensaje);
        return true;
    }
}
