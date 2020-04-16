/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basuras;

import dsproyectop1.ds.proyectop1.factory.basuras.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author coque
 */
public class BasuraBasicoOrganicoTest {
    BasuraBasicoOrganico  basuraBasicoOrganico;
    @Before
    public void setUp(){
        basuraBasicoOrganico = new  BasuraBasicoOrganico();
    }
    
    @Test
    public void testNam() {
        assertEquals("funciona BasuraBasicoOrganico", basuraBasicoOrganico.getStatus());
    } 
    
    @Test
    public void testMostrarDescripcionNivel() {
        assertEquals("Nivel Basico", basuraBasicoOrganico.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        assertEquals("Tipo de basura: Organico", basuraBasicoOrganico.mostrarTipoBasura());
    }
}
