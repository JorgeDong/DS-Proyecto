/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basuras;

import dsproyectop.ds.proyectop.factory.basuras.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author coque
 */
public class BasuraBasicoInorganicoTest {
    BasuraBasicoInorganico  basuraBasicoInorganico;
    @Before
    public void setUp(){
        basuraBasicoInorganico = new  BasuraBasicoInorganico();
    }
    
    @Test
    public void testNam() {
        assertEquals("funciona BasuraBasicoInorganico", basuraBasicoInorganico.getStatus());
    }
    
    @Test
    public void testMostrarDescripcionNivel() {
        assertEquals("Nivel Basico", basuraBasicoInorganico.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        assertEquals("Tipo de basura: Inorganico", basuraBasicoInorganico.mostrarTipoBasura());
    }
}
