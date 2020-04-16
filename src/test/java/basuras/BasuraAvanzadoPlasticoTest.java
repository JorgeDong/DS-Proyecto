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
public class BasuraAvanzadoPlasticoTest {
    BasuraAvanzadoPlastico basuraAvanzadoPlastico;
    @Before
    public void setUp(){
       basuraAvanzadoPlastico = new BasuraAvanzadoPlastico();
    }
    
    @Test
    public void testNam() {
        assertEquals("funciona BasuraAvanzadoPlastico", basuraAvanzadoPlastico.getStatus());
    }
    
    @Test
    public void testMostrarDescripcionNivel() {
        assertEquals("Nivel Avanzado", basuraAvanzadoPlastico.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        assertEquals("Tipo de basura: Plastico", basuraAvanzadoPlastico.mostrarTipoBasura());
    }
}
