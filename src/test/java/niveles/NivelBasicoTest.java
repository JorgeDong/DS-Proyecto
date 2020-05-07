package niveles;

import org.junit.Test;

import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.Nivel;
import dsproyectop.ds.proyectop.factory.niveles.NivelBasico;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * NivelBasico test class.
 */
public class NivelBasicoTest {
    NivelBasico nivelBasico;
    Nivel nivel;
    Basura basura;

    @Before
    public void setUp() {
        nivelBasico = new NivelBasico();
        nivel = mock(NivelBasico.class);
    }

    @Test
    public void testSetUp() {
        when(nivel.setUp()).thenReturn(true);
        assertEquals(true, nivelBasico.setUp());
    }

    @Test
    public void testMostrarDescripcionNivel() {
        when(nivel.mostrarDescripcionNivel(10)).thenReturn("Nivel Basico");
        assertEquals("Nivel Basico", nivelBasico.mostrarDescripcionNivel(10));
    }

    @Test
    public void testCreateBasuras() {
        
        basura = nivelBasico.createBasuras(0);
        assertEquals("Nivel Basico", basura.mostrarDescripcionNivel());
    }


    @Test
    public void testMostrarOpciones() {
        when(nivel.mostrarOpciones(20)).thenReturn(20);
        assertEquals((Integer) 20, nivelBasico.mostrarOpciones(20));
    }


}