/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.behaviors.impl;

import dsproyectop.ds.proyectop.behaviors.Repartir50Basuras;
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
public class Repartir50BasurasIntermedio implements Repartir50Basuras {
    final int seis = 6;
        final int siete = 7;
        final int once = 11;
        final int doce = 12;
        final int diesiciete = 17;
        Basura basuraIntermedioOrganica = new BasuraIntermedioOrganico();
        Basura basuraIntermedioInorganica = new BasuraIntermedioInorganico();
        Basura basuraIntermedioReciclable = new BasuraIntermedioReciclable();
        
         protected ArrayList nombresBasuraTotal = new ArrayList();
         protected ArrayList iteracionesTotal = new ArrayList();
          protected ArrayList combinacionesTotal = new ArrayList();

    @Override
    public ArrayList repartir50() {
        
        Collections.shuffle(basuraIntermedioOrganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioInorganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioReciclable.getNombresBasura());
        
         for (int i = 0; i < seis; i++) {
                    nombresBasuraTotal.add(
                        basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(
                    basuraIntermedioInorganica.getNombresBasura()
                    .get(diesiciete));
                nombresBasuraTotal.add(
                    basuraIntermedioReciclable.getNombresBasura()
                    .get(diesiciete));
             return this.nombresBasuraTotal;
    }

    @Override
    public ArrayList iteraryCombinar50Basuras() {
for (int i = 0; i < 50; i++) {
            combinacionesTotal.add("id"+i);
        }  
        for (int i = 0; i < 50; i++) {
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
        }
             return this.iteracionesTotal;
    }
         
         
}

