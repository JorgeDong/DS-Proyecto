/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.factory.niveles;

import dsproyectop1.ds.proyectop1.facade.PaneMaker;
import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.factory.Nivel;
import dsproyectop1.ds.proyectop1.factory.basuras.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author coque
 */
public class NivelBasico extends Nivel{
    
    private static final int TIEMPO = 10000;
    
    @Override
    protected void createBasuras(int objetos) { 
        Basura basuraBasicoOrganica = new BasuraBasicoOrganico();
        Basura basuraBasicoInorganica = new BasuraBasicoInorganico();
    // En este metodo mezclamos para que quede el arreglo final a mostrar de basuras dependiedo del tama
        Collections.shuffle(basuraBasicoOrganica.getNombresBasura());
        Collections.shuffle(basuraBasicoInorganica.getNombresBasura()); 
        
        switch (objetos){
            case 0:
                //20
                //Tamaño para margen
                for (int i=0; i<10; i++) {
                    nombresBasuraTotal.add(basuraBasicoOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraBasicoInorganica.getNombresBasura().get(i));
                }
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 1:
                for (int i=0; i<17; i++) {
                    nombresBasuraTotal.add(basuraBasicoOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraBasicoInorganica.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(basuraBasicoInorganica.getNombresBasura().get(18));
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 2:
                for (int i=0; i<25; i++) {
                    nombresBasuraTotal.add(basuraBasicoOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraBasicoInorganica.getNombresBasura().get(i));
                }
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            default : 
                System.exit(0);
        }
    

    }

    @Override
    public String mostrarDescripcionNivel() {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Basico:"
            + "<br>Debes clasificar la basura entre Orgánico e Inorgánico.</html>";
        paneMaker.paneConfirm(mensaje);
        return "Nivel Basico";
    }
    
    @Override
    public void mostrarOpciones(int objetos){
        
        PaneMaker paneMaker = new PaneMaker();
   
            long startTime = System.currentTimeMillis();
            String[] basuraMenu = {"Orgánico", "Inorgánico"};
            int i;
            for(i = 1 ; i < nombresBasuraSeparado.size(); i++){
                //System.out.println(nombresBasuraTotal.get(i));
                int basuraMostrar = paneMaker.paneOptions(
                        basuraMenu,nombresBasuraSeparado.get(i).toString()+ " (" + i + "/" +objetos+ ")");
                System.out.println(basuraMostrar);
                
                int n = Integer.parseInt(idBasuraTotal.get(i).toString());
                String resultado;
                if(basuraMostrar == n-1){
                    System.out.println("correcto");
                    resultado = nombresBasuraSeparado.get(i).toString()+ " ->correcto";
                    correctos++;
                }else{
                    System.out.println("incorrecto");
                    resultado = nombresBasuraSeparado.get(i).toString()+ " ->inccorrecto";
                }
                resultados.add(resultado);
                         
                long elapsed = System.currentTimeMillis() - startTime;
                if (elapsed >= this.TIEMPO) {
                    break;
                }
            }
 
    }
   
    
}
