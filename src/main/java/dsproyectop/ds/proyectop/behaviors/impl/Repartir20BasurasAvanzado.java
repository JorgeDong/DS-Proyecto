/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.behaviors.impl;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoMetal;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoOrganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoPapel;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoPlastico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoTecnologica;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoTextiles;
import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoVidrio;
import dsproyectop.ds.proyectop.factory.basuras.BasuraBasicoInorganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraBasicoOrganico;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author coque
 */
public class Repartir20BasurasAvanzado implements Repartir20Basuras {
        final int tres = 3;
        final int cuatro = 4;
        final int cinco = 5;
        final int siete = 7;
        final int ocho = 8;
        Basura basuraAvanzadoOrganico = new BasuraAvanzadoOrganico();
        Basura basuraAvanzadoMetal = new BasuraAvanzadoMetal();
        Basura basuraAvanzadoPapel = new BasuraAvanzadoPapel();
        Basura basuraAvanzadoPlastico = new BasuraAvanzadoPlastico();
        Basura basuraAvanzadoTecnologica = new BasuraAvanzadoTecnologica();
        Basura basuraAvanzadoTextiles = new BasuraAvanzadoTextiles();
        Basura basuraAvanzadoVidrio = new BasuraAvanzadoVidrio();
        
        protected ArrayList nombresBasuraTotal = new ArrayList();
        protected ArrayList iteracionesTotal = new ArrayList();
         protected ArrayList combinacionesTotal = new ArrayList();
        
    @Override
    public ArrayList repartir20() {
    Collections.shuffle(basuraAvanzadoOrganico.getNombresBasura());
    Collections.shuffle(basuraAvanzadoMetal.getNombresBasura());
    Collections.shuffle(basuraAvanzadoPapel.getNombresBasura());
    Collections.shuffle(basuraAvanzadoPlastico.getNombresBasura());
    Collections.shuffle(basuraAvanzadoTecnologica.getNombresBasura());
    Collections.shuffle(basuraAvanzadoTextiles.getNombresBasura());
    Collections.shuffle(basuraAvanzadoVidrio.getNombresBasura());
    
    for (int i = 0; i < tres; i++) {
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
                }
                nombresBasuraTotal.add(
                    basuraAvanzadoVidrio.getNombresBasura().get(tres));
                nombresBasuraTotal.add(
                    basuraAvanzadoVidrio.getNombresBasura().get(cuatro));
                System.out.println(nombresBasuraTotal.size());
       return this.nombresBasuraTotal;     
    }
    
    @Override
    public ArrayList iteraryCombinar20Basuras() {
    for (int i = 0; i < 20; i++) {
            combinacionesTotal.add("id"+i);
        }  
        for (int i = 0; i < 20; i++) {
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
            this.iteracionesTotal.add(
            this.combinacionesTotal.get(i));
        }

             return this.iteracionesTotal;
    }

}
