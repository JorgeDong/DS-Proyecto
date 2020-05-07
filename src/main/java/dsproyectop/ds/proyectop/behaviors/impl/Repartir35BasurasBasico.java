/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.behaviors.impl;

import dsproyectop.ds.proyectop.behaviors.Repartir35Basuras;
import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.basuras.BasuraBasicoInorganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraBasicoOrganico;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author coque
 */
public class Repartir35BasurasBasico  implements Repartir35Basuras {
    /**
     * Variable de descicion.
     */
    private final int treintaycinco = 35;
    /**
     * Variable de descicion.
     */
    private final int diesiciete = 17;
    /**
     * Variable de descicion.
     */
    private final int diesiocho = 18;
    /**
     * Variable de descicion.
     */
    private Basura basuraBasicoOrganica = new BasuraBasicoOrganico();
    /**
     * Variable de descicion.
     */
    private Basura basuraBasicoInorganica = new BasuraBasicoInorganico();
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
        Collections.shuffle(this.basuraBasicoOrganica.getNombresBasura());
        Collections.shuffle(this.basuraBasicoInorganica.getNombresBasura());
        for (int i = 0; i < this.diesiciete; i++) {
                    this.nombresBasuraTotal.add(
                        this.basuraBasicoOrganica.getNombresBasura().get(i));
                    this.nombresBasuraTotal.add(
                        this.basuraBasicoInorganica.getNombresBasura().get(i));
                }
                this.nombresBasuraTotal.add(
                    this.basuraBasicoInorganica.getNombresBasura().get(
                    this.diesiocho));
                System.out.println(this.nombresBasuraTotal.size());
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
