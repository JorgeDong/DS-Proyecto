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
public class BasuraAvanzadoTextilesTest {
    BasuraAvanzadoTextiles basuraAvanzadoTextiles;
    @Before
    public void setUp(){
       basuraAvanzadoTextiles = new BasuraAvanzadoTextiles();
    }
    
    @Test
    public void testNam() {
        assertEquals("funciona BasuraAvanzadoTextiles", basuraAvanzadoTextiles.getStatus());
    }
    @Test
    public void testMostrarDescripcionNivel() {
        assertEquals("Nivel Avanzado", basuraAvanzadoTextiles.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        assertEquals("Tipo de basura: Textiles", basuraAvanzadoTextiles.mostrarTipoBasura());
    }
}
