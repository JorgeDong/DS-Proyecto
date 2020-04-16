package niveles;

import org.junit.Test;

import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.factory.Nivel;
import dsproyectop1.ds.proyectop1.factory.niveles.NivelIntermedio;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * NivelBasico test class.
 */
public class NivelIntermedioTest {
    NivelIntermedio nivelIntermedio;
    Nivel nivel;

    @Before
    public void setUp() {
        nivelIntermedio = new NivelIntermedio();
        nivel = mock(NivelIntermedio.class);
    }

    @Test
    public void testmostrarDescripcionNivel() {
        when(nivel.mostrarDescripcionNivel()).thenReturn("Nivel Intermedio");
        assertEquals("Nivel Intermedio", nivelIntermedio.mostrarDescripcionNivel());
    }

}