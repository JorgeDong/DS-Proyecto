/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.factory;

import dsproyectop1.ds.proyectop1.facade.PaneMaker;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author coque
 */
public abstract class Nivel {

    public ArrayList nombresBasuraTotal = new ArrayList();
    public ArrayList nombresBasuraSeparado = new ArrayList();
    public ArrayList idBasuraTotal = new ArrayList();
     public ArrayList resultados = new ArrayList();
    public int cantidadObjetos;
    public int correctos = 0;
    
    public abstract String mostrarDescripcionNivel();

    public abstract Integer mostrarOpciones(int objetos);
    
    public abstract Integer createBasuras(int objetos);
    
    public Boolean ejecutarNivel(int objetos){
        createBasuras(objetos);
        mostrarDescripcionNivel();
        System.out.println("entro");
        
//        for(int i = 1; i < nombresBasuraTotal.size(); i++){
//            System.out.println(nombresBasuraTotal.get(i));
//        }

        separarId();
        
        if(objetos == 0){
            this.cantidadObjetos = 20;
        }else if (objetos == 1){
            this.cantidadObjetos = 35;
        }else{
            this.cantidadObjetos = 50;
        }
        mostrarOpciones(this.cantidadObjetos);
        
        for(int i = 1; i < resultados.size(); i++){
            System.out.println(resultados.get(i));
        }
        
        mostrarResultados();

        return true;
        
    }
    
    public Boolean separarId(){
        for(int i = 1; i < nombresBasuraTotal.size(); i++){
            System.out.println(nombresBasuraTotal.get(i));            
            String str = nombresBasuraTotal.get(i).toString();
            System.out.println(str);
            
            String kept = str.substring( 0, str.indexOf(","));
             System.out.println(kept);
            idBasuraTotal.add(kept);
            System.out.println(str);
            
            String remainder = str.substring(str.indexOf(",")+1, str.length());
            System.out.println(remainder);
            nombresBasuraSeparado.add(remainder);
            
        }
        return true;
    }
    
    public Boolean mostrarResultados(){
        PaneMaker paneMaker = new PaneMaker();
        
        //paneMaker.paneConfirm(resultados.toString());
        String mensaje = "<html><table><tr><th>Resultados correctos: "+ correctos+ "/"+ cantidadObjetos + "</th></tr>";
        for(int i = 1; i < resultados.size(); i++){
            System.out.println(resultados.get(i));
            mensaje+="<tr><td>"+resultados.get(i)+"</td></tr>";
        }
        mensaje+="</table></html>";
        paneMaker.paneConfirm(mensaje);
        
        return true;
    }
}
