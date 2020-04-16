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
import java.util.Collections;

/**
 *
 * @author coque
 */
public class NivelAvanzado extends Nivel{
    
    private static final int TIEMPO = 50000;
    
    @Override
    public String mostrarDescripcionNivel() {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Avanzado:"
            + "<br>Debes clasificar entre Orgánico, Papel, Vidrio, Metal,"
                + "Plástico, Textiles y Basura tecnológica.</html>";
        paneMaker.paneConfirm(mensaje);
        return "Nivel Avanzado";
    }

    @Override
    protected void createBasuras(int objetos) { 
        Basura basuraAvanzadoOrganico = new BasuraAvanzadoOrganico();
        Basura basuraAvanzadoMetal = new BasuraAvanzadoMetal();
        Basura basuraAvanzadoPapel = new BasuraAvanzadoPapel();
        Basura basuraAvanzadoPlastico = new BasuraAvanzadoPlastico();
        Basura basuraAvanzadoTecnologica = new BasuraAvanzadoTecnologica();
        Basura basuraAvanzadoTextiles = new BasuraAvanzadoTextiles();
        Basura basuraAvanzadoVidrio = new BasuraAvanzadoVidrio();
    // En este metodo mezclamos para que quede el arreglo final a mostrar de basuras dependiedo del tama
    
    Collections.shuffle(basuraAvanzadoOrganico.getNombresBasura());
    Collections.shuffle(basuraAvanzadoMetal.getNombresBasura());
    Collections.shuffle(basuraAvanzadoPapel.getNombresBasura());
    Collections.shuffle(basuraAvanzadoPlastico.getNombresBasura());
    Collections.shuffle(basuraAvanzadoTecnologica.getNombresBasura());
    Collections.shuffle(basuraAvanzadoTextiles.getNombresBasura());
    Collections.shuffle(basuraAvanzadoVidrio.getNombresBasura());
    
    
        
        switch (objetos){
            case 0:
                //20
                for (int i=0; i<3; i++) {
                    nombresBasuraTotal.add(basuraAvanzadoOrganico.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoMetal.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoPapel.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoPlastico.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoTecnologica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoTextiles.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(basuraAvanzadoVidrio.getNombresBasura().get(3));
                nombresBasuraTotal.add(basuraAvanzadoVidrio.getNombresBasura().get(4));
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 1:
                for (int i=0; i<5; i++) {
                    nombresBasuraTotal.add(basuraAvanzadoOrganico.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoMetal.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoPapel.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoPlastico.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoTecnologica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoTextiles.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoVidrio.getNombresBasura().get(i));
                }
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 2:
                for (int i=0; i<7; i++) {
                    nombresBasuraTotal.add(basuraAvanzadoOrganico.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoMetal.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoPapel.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoPlastico.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoTecnologica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoTextiles.getNombresBasura().get(i));
                    nombresBasuraTotal.add(basuraAvanzadoVidrio.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(basuraAvanzadoVidrio.getNombresBasura().get(8));
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            default : 
                System.exit(0);
        }
    

    }
    
        @Override
    public void mostrarOpciones(int objetos){
        PaneMaker paneMaker = new PaneMaker();
   
        long startTime = System.currentTimeMillis();

            String[] basuraMenu = {"Orgánico", "Papel",
                 "Vidrio","Metal","Plástico","Textiles","Basura tecnológica"};
            //int i;
            for(int i = 1; i < nombresBasuraSeparado.size(); i++){
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
