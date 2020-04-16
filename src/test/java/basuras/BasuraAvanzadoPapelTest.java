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
public class BasuraAvanzadoPapelTest {
    BasuraAvanzadoPapel basuraAvanzadoPapel;
    @Before
    public void setUp(){
        basuraAvanzadoPapel = new BasuraAvanzadoPapel();
    }
    
    @Test
    public void testNam() {
        assertEquals("funciona BasuraAvanzadoPapel", basuraAvanzadoPapel.getStatus());
    }
    
    @Test
    public void testMostrarDescripcionNivel() {
        assertEquals("Nivel Avanzado", basuraAvanzadoPapel.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        assertEquals("Tipo de basura: Papel", basuraAvanzadoPapel.mostrarTipoBasura());
    }
}
