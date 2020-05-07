/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.behaviors.impl;

import dsproyectop.ds.proyectop.behaviors.Repartir50Basuras;
import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoMetal;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoOrganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoPapel;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoPlastico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoTecnologica;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoTextiles;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoVidrio;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author coque
 */
public class Repartir50BasurasAvanzado implements Repartir50Basuras {
    /**
     * Variable de descicion.
     */
    private final int cincuenta = 50;
    /**
     * Variable de descicion.
     */
    private final int siete = 7;
    /**
     * Variable de descicion.
     */
    private final int ocho = 8;
    /**
     * Variable de descicion.
     */
    private Basura basuraAvanzadoOrganico = new BasuraAvanzadoOrganico();
    /**
     * Variable de descicion.
     */
    private Basura basuraAvanzadoMetal = new BasuraAvanzadoMetal();
    /**
     * Variable de descicion.
     */
    private Basura basuraAvanzadoPapel = new BasuraAvanzadoPapel();
    /**
     * Variable de descicion.
     */
    private Basura basuraAvanzadoPlastico = new BasuraAvanzadoPlastico();
    /**
     * Variable de descicion.
     */
    private Basura basuraAvanzadoTecnologica = new BasuraAvanzadoTecnologica();
    /**
     * Variable de descicion.
     */
    private Basura basuraAvanzadoTextiles = new BasuraAvanzadoTextiles();
    /**
     * Variable de descicion.
     */
    private Basura basuraAvanzadoVidrio = new BasuraAvanzadoVidrio();
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
    public ArrayList repartir50() {
        Collections.shuffle(basuraAvanzadoOrganico.getNombresBasura());
    Collections.shuffle(basuraAvanzadoMetal.getNombresBasura());
    Collections.shuffle(basuraAvanzadoPapel.getNombresBasura());
    Collections.shuffle(basuraAvanzadoPlastico.getNombresBasura());
    Collections.shuffle(basuraAvanzadoTecnologica.getNombresBasura());
    Collections.shuffle(basuraAvanzadoTextiles.getNombresBasura());
    Collections.shuffle(basuraAvanzadoVidrio.getNombresBasura());
    for (int i = 0; i < siete; i++) {
                    nombresBasuraTotal.add(
                        basuraAvanzadoOrganico.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraAvanzadoMetal.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraAvanzadoPapel.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraAvanzadoPlastico.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraAvanzadoTecnologica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraAvanzadoTextiles.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraAvanzadoVidrio.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(basuraAvanzadoVidrio
                .getNombresBasura().get(ocho));
                System.out.println(nombresBasuraTotal.size());
        return this.nombresBasuraTotal;
    }
    /**
     * Variable de descicion.
     * @return reparticion.
     */
    @Override
    public ArrayList iteraryCombinar50Basuras() {
        for (int i = 0; i < cincuenta; i++) {
            combinacionesTotal.add("id" + i);
        }
        for (int i = 0; i < cincuenta; i++) {
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
        }
             return this.iteracionesTotal;
    }
}