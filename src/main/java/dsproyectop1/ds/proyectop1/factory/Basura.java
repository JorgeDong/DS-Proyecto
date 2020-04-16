/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1.factory;

import java.util.ArrayList;

/**
 *
 * @author coque
 */
public abstract class Basura {
    
    public ArrayList nombresBasura = new ArrayList();
    public ArrayList idBasura = new ArrayList();
    
    public abstract String mostrarDescripcionNivel();

    public abstract String mostrarTipoBasura();

    public ArrayList getNombresBasura(){
        return this.nombresBasura;
    }
      
    
}
