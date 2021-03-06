package basuras;


import dsproyectop.ds.proyectop.factory.basuras.BasuraAvanzadoMetal;
import org.junit.Before;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coque
 */


public class BasuraAvanzadoMetalTest {
    BasuraAvanzadoMetal basuraAvanzadoMetal;
    
    @Before
    public void setUp(){
        basuraAvanzadoMetal = new BasuraAvanzadoMetal();       
    }
    
   @Test
    public void testNameMkyong() {
        assertEquals("funciona BasuraAvanzadoMetal", basuraAvanzadoMetal.getStatus());
    }
    
    @Test
    public void testMostrarDescripcionNivel() {
        assertEquals("Nivel Avanzado", basuraAvanzadoMetal.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        assertEquals("Tipo de basura: Metal", basuraAvanzadoMetal.mostrarTipoBasura());
    }
    
}
