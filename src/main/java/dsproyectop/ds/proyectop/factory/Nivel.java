/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.factory;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir35Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir50Basuras;
import dsproyectop.ds.proyectop.bridge.PaneMaker;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author coque
 */
public abstract class Nivel {
    /**
     * Variable.
     */
    private Repartir20Basuras repartir20BasurasAvanzado;
    /**
     * Variable.
     */
    private Repartir35Basuras repartir35BasurasAvanzado;
    /**
     * Variable.
     */
    private Repartir50Basuras repartir50BasurasAvanzado;
    /**
     * Variable tiempo.
     */
    private static final int V20 = 20;
    /**
     * Variable tiempo.
     */
    private static final int V35 = 35;
    /**
     * Variable tiempo.
     */
    private static final int V50 = 50;
    /**
     * It return the actual level of the game.
     * @return An arrayList.
     */
    private ArrayList nombresBasuraTotal = new ArrayList();
    /**
     * It return the actual level of the game.
     * @return An arrayList.
     */
    private ArrayList nombresBasuraSeparado = new ArrayList();
    /**
     * It return the actual level of the game.
     * @return An arrayList.
     */
    private ArrayList idBasuraTotal = new ArrayList();
    /**
     * It return the actual level of the game.
     * @return An arrayList.
     */
    private ArrayList resultados = new ArrayList();
    /**
     * Variable correctos.
     */
    private ArrayList elementosIterados = new ArrayList();
    /**
     * Variable cantidadObjetos.
     */
    private int cantidadObjetos;
    /**
     * Variable cantidadObjetos.
     */
    private int objetosReal;
    /**
     * Variable correctos.
     */
    private int correctos = 0;
    /**
     * Variable basuraMenu.
     */
    private String[] basuraMenu;
    /**
     * Variable tiempo.
     */
    private int tiempo;
    /**
     * It return the actual level of the game.
     * @return A String.
     */
    public abstract Boolean setUp();
    /**
     * It return the actual level of the game.
     * @param tiempoDescripcion
     * @return A String.
     */
    public abstract String mostrarDescripcionNivel(int tiempoDescripcion);
    /**
     * It return the actual level of the game.
     * @param objetosB
     * @return An integer.
     */
    public abstract Basura createBasuras(int objetosB);
    /**
     * It return the actual level of the game.
     * @param objetos
     * @param basuraMenuParam
     * @param tiempoParam
     * @return A boolean.
     */
    public Boolean ejecutarNivel(final int objetos,
    final String[] basuraMenuParam,
    final int tiempoParam) {
        this.basuraMenu = basuraMenuParam;
        final int veinte = 6;
        final int treintaycinco = 7;
        final int ciencuenta = 11;
        createBasuras(objetos);
        System.out.println("entro");
        separarId();
        if (objetos == 0) {
            this.cantidadObjetos = veinte;
            this.objetosReal = V20;
            this.tiempo = tiempoParam * V20;
        } else if (objetos == 1) {
            this.cantidadObjetos = treintaycinco;
            this.objetosReal = V35;
            this.tiempo = tiempoParam * V35;
        } else {
            this.cantidadObjetos = ciencuenta;
            this.objetosReal = V50;
            this.tiempo = tiempoParam * V50;
        }
        mostrarDescripcionNivel(this.tiempo);
        //mostrarOpciones(this.cantidadObjetos);
        mostrarOpciones(this.objetosReal);
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
        Collections.shuffle(nombresBasuraTotal);
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
        + correctos + "/" + this.objetosReal + "</th></tr>";
        for (int i = 1; i < resultados.size(); i++) {
            System.out.println(resultados.get(i));
            mensaje += "<tr><td>" + resultados.get(i) + "</td></tr>";
        }
        mensaje += "</table></html>";
        paneMaker.paneConfirm(mensaje);
        return true;
    }
    /**
     * It return the actual level of the game.
     * @param objetos
     * @return A boolean.
     */
    public Integer mostrarOpciones(final int objetos) {
        PaneMaker paneMaker = new PaneMaker();
            long startTime = System.currentTimeMillis();
            //String[] basuraMenu = {"Orgánico", "Inorgánico"};
            int i;
            for (i = 1; i < nombresBasuraSeparado.size(); i++) {
                //System.out.println(nombresBasuraTotal.get(i));
                int basuraMostrar = paneMaker.paneOptions(
                        this.basuraMenu, nombresBasuraSeparado.get(i)
                        .toString() + " (" + i + "/" + objetos + ")");
                System.out.println(basuraMostrar);
                int n = Integer.parseInt(idBasuraTotal
                .get(i).toString());
                String resultado;
                if (basuraMostrar == -1) {
                    System.exit(0);
                }
                if (basuraMostrar == n - 1) {
                    System.out.println("correcto");
                    resultado = nombresBasuraSeparado
                    .get(i).toString() + " ->correcto";
                    correctos++;
                } else {
                    System.out.println("incorrecto");
                    resultado = nombresBasuraSeparado
                    .get(i).toString() + " ->incorrecto";
                }
                resultados.add(resultado);
                long elapsed = System
                .currentTimeMillis() - startTime;
                if (elapsed >= this.tiempo) {
                    break;
                }
            }
        return objetos;
    }
    /**
     * nombresBasuraTotal.
     * @return nombresBasuraTotal.
     */
    public ArrayList getnombresBasuraTotal() {
        return this.nombresBasuraTotal;
    }
    /**
     * nombresBasuraTotalParam.
     * @param nombresBasuraTotalParam
     */
    public void setnombresBasuraTotal(final ArrayList nombresBasuraTotalParam) {
        this.nombresBasuraTotal = nombresBasuraTotalParam;
    }
    /**
     * elementosIterados.
     * @return elementosIterados.
     */
    public ArrayList getelementosIterados() {
        return this.elementosIterados;
    }
    /**
     * elementosIteradosParam.
     * @param elementosIteradosParam
     */
    public void setelementosIterados(final ArrayList elementosIteradosParam) {
        this.elementosIterados = elementosIteradosParam;
    }
}
