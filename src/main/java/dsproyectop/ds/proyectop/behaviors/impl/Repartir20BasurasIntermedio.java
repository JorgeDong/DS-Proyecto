/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.behaviors.impl;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.basuras.BasuraIntermedioInorganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraIntermedioOrganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraIntermedioReciclable;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author coque
 */
public class Repartir20BasurasIntermedio implements Repartir20Basuras {
    /**
     * Variable de descicion.
     */
    private final int veinte = 20;
    /**
     * Variable de descicion.
     */
    private final int seis = 6;
    /**
     * Variable de descicion.
     */
    private final int siete = 7;
    /**
     * Variable de descicion.
     */
   private Basura basuraIntermedioOrganica = new BasuraIntermedioOrganico();
    /**
     * Variable de descicion.
     */
   private Basura basuraIntermedioInorganica = new BasuraIntermedioInorganico();
    /**
     * Variable de descicion.
     */
   private Basura basuraIntermedioReciclable = new BasuraIntermedioReciclable();
    /**
     * Variable de descicion.
     */
    private ArrayList nombresBasuraTotal = new ArrayList();
        /**
     * Variable de descicion.
     */
    private ArrayList iteracionesTotal = new ArrayList();
    /**
     * Variable de descicion.
     */
    private ArrayList combinacionesTotal = new ArrayList();
    /**
     * Variable de descicion.
     * @return reparticion.
     */
    @Override
    public ArrayList repartir20() {
            /*En este metodo mezclamos para que quede el arreglo
    final a mostrar de basuras dependiedo del tama*/
        Collections.shuffle(basuraIntermedioOrganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioInorganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioReciclable.getNombresBasura());
        //20
                //Tamaño para margen
                for (int i = 0; i < seis; i++) {
                    nombresBasuraTotal.add(
                        basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(
                    basuraIntermedioInorganica.getNombresBasura().get(siete));
                nombresBasuraTotal.add(
                    basuraIntermedioReciclable.getNombresBasura().get(siete));
                System.out.println(nombresBasuraTotal.size());
           return this.nombresBasuraTotal;
    }
    /**
     * Variable de descicion.
     * @return reparticion.
     */
    @Override
    public ArrayList iteraryCombinar20Basuras() {
        for (int i = 0; i < veinte; i++) {
            combinacionesTotal.add("id" + i);
        }
        for (int i = 0; i < veinte; i++) {
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
        }
        return this.iteracionesTotal;
    }
}
