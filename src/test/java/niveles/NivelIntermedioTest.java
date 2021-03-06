package niveles;

import org.junit.Test;

import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.Nivel;
import dsproyectop.ds.proyectop.factory.basuras.BasuraIntermedioOrganico;
import dsproyectop.ds.proyectop.factory.niveles.NivelIntermedio;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * NivelBasico test class.
 */
public class NivelIntermedioTest {
    NivelIntermedio nivelIntermedio;
    Nivel nivel;
    Basura basura;

    @Before
    public void setUp() {
        nivelIntermedio = new NivelIntermedio();
        nivel = mock(NivelIntermedio.class);
    }

    @Test
    public void testSetUp() {
        when(nivel.setUp()).thenReturn(true);
        assertEquals(true, nivelIntermedio.setUp());
    }

    @Test
    public void testMostrarDescripcionNivel() {
        when(nivel.mostrarDescripcionNivel(10)).thenReturn("Nivel Intermedio");
        assertEquals("Nivel Intermedio", nivelIntermedio.mostrarDescripcionNivel(10));
    }

    @Test
    public void testCreateBasuras() {
        //when(nivel.createBasuras(1)).thenReturn(basura);
        basura = nivelIntermedio.createBasuras(1);
        assertEquals("Nivel Intermedio", basura.mostrarDescripcionNivel());
    }


    @Test
    public void testMostrarOpciones() {
        when(nivel.mostrarOpciones(35)).thenReturn(35);
        assertEquals((Integer) 35, nivelIntermedio.mostrarOpciones(35));
    }


}