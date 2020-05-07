/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop.ds.proyectop.behaviors.impl;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.basuras.BasuraBasicoInorganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraBasicoOrganico;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author coque
 */
public class Repartir20BasurasBasico implements Repartir20Basuras {
    final int diez = 10;
        final int diesiciete = 17;
        final int diesiocho = 18;
        final int veinticinco = 25;
        Basura basuraBasicoOrganica = new BasuraBasicoOrganico();
        Basura basuraBasicoInorganica = new BasuraBasicoInorganico();
    /* En este metodo mezclamos para que quede el arreglo
    final a mostrar de basuras dependiedo del tama*/
      protected ArrayList nombresBasuraTotal = new ArrayList();
       protected ArrayList iteracionesTotal = new ArrayList();
       protected ArrayList combinacionesTotal = new ArrayList();
        
    @Override
    public ArrayList repartir20() {
        Collections.shuffle(this.basuraBasicoOrganica.getNombresBasura());
        Collections.shuffle(this.basuraBasicoInorganica.getNombresBasura());
        //20
                //Tamaño para margen
                for (int i = 0; i < this.diez; i++) {
                    this.nombresBasuraTotal.add(
                        this.basuraBasicoOrganica.getNombresBasura().get(i));
                    this.nombresBasuraTotal.add(
                        this.basuraBasicoInorganica.getNombresBasura().get(i));
                }
                System.out.println(this.nombresBasuraTotal.size());
                
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
