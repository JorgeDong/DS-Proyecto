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
public class BasuraAvanzadoOrganicoTest {
    BasuraAvanzadoOrganico basuraAvanzadoOrganico;
    @Before
    public void setUp(){
        basuraAvanzadoOrganico = new BasuraAvanzadoOrganico();
    }
    
    @Test
    public void testNam() {
        assertEquals("funciona BasuraAvanzadoOrganico", basuraAvanzadoOrganico.getStatus());
    }
    
    @Test
    public void testMostrarDescripcionNivel() {
        assertEquals("Nivel Avanzado", basuraAvanzadoOrganico.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        assertEquals("Tipo de basura: Organico", basuraAvanzadoOrganico.mostrarTipoBasura());
    }
    
}
