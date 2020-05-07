/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.behaviors.impl;

import dsproyectop.ds.proyectop.behaviors.Repartir35Basuras;
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
public class Repartir35BasurasIntermedio implements Repartir35Basuras {
    /**
     * Variable de descicion.
     */
    private final int treintaycinco = 35;
    /**
     * Variable de descicion.
     */
    private final int once = 11;
    /**
     * Variable de descicion.
     */
    private final int doce = 12;
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
    public ArrayList repartir35() {
         Collections.shuffle(basuraIntermedioOrganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioInorganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioReciclable.getNombresBasura());
        for (int i = 0; i < once; i++) {
                    nombresBasuraTotal.add(
                        basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(
                    basuraIntermedioInorganica.getNombresBasura().get(doce));
                nombresBasuraTotal.add(
                    basuraIntermedioReciclable.getNombresBasura().get(doce));
                    System.out.println(nombresBasuraTotal.size());
        return this.nombresBasuraTotal;
    }
    /**
     * Variable de descicion.
     * @return reparticion.
     */
    @Override
    public ArrayList iteraryCombinar35Basuras() {
   for (int i = 0; i < treintaycinco; i++) {
            combinacionesTotal.add("id" + i);
        }
        for (int i = 0; i < treintaycinco; i++) {
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
        }
             return this.iteracionesTotal;
    }
}