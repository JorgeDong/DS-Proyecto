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
import dsproyectop1.ds.proyectop1.factory.basuras.BasuraIntermedioOrganico;
import java.util.Collections;

/**
 *
 * @author coque
 */
public class NivelIntermedio extends Nivel{
    
    private static final int TIEMPO = 5000;
    
    @Override
    public String mostrarDescripcionNivel() {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Intermedio:"
            + "<br>Debes clasificar entre Orgánico, Inorgánico y Reciclable.</html>";
        paneMaker.paneConfirm(mensaje);
        return "Nivel Intermedio";
    }

@Override
    protected void createBasuras(int objetos) { 
        Basura basuraIntermedioOrganica = new BasuraIntermedioOrganico();
        Basura basuraIntermedioInorganica = new BasuraIntermedioInorganico();
        Basura basuraIntermedioReciclable = new BasuraIntermedioReciclable();
    // En este metodo mezclamos para que quede el arreglo final a mostrar de basuras dependiedo del tama
        Collections.shuffle(basuraIntermedioOrganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioInorganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioReciclable.getNombresBasura());
        
        switch (objetos){
            case 0:
                //20
                //Tamaño para margen
                for (int i=0; i<6; i++) {
                    nombresBasuraTotal.add(basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(basuraIntermedioInorganica.getNombresBasura().get(7));
                nombresBasuraTotal.add(basuraIntermedioReciclable.getNombresBasura().get(7));
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 1:
                for (int i=0; i<11; i++) {
                    nombresBasuraTotal.add(basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(basuraIntermedioInorganica.getNombresBasura().get(12));
                nombresBasuraTotal.add(basuraIntermedioReciclable.getNombresBasura().get(12));
                
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 2:
                for (int i=0; i<16; i++) {
                    nombresBasuraTotal.add(basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(basuraIntermedioInorganica.getNombresBasura().get(17));
                nombresBasuraTotal.add(basuraIntermedioReciclable.getNombresBasura().get(17));
                break; // break es opcional
            default : 
                System.exit(0);
        }
    

    }
    
    @Override
    public void mostrarOpciones(int objetos){
        PaneMaker paneMaker = new PaneMaker();
   
        long startTime = System.currentTimeMillis();
            String[] basuraMenu = {"Orgánico", "Inorgánico","Reciclable"};
            int i;
            for(i = 1; i < nombresBasuraSeparado.size(); i++){
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
