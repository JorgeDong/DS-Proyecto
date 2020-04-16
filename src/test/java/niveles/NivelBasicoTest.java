package niveles;

import org.junit.Test;

import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.factory.Nivel;
import dsproyectop1.ds.proyectop1.factory.niveles.NivelBasico;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * NivelBasico test class.
 */
public class NivelBasicoTest {
    NivelBasico nivelBasico;
    Nivel nivel;

    @Before
    public void setUp() {
        nivelBasico = new NivelBasico();
        nivel = mock(NivelBasico.class);
    }

    @Test
    public void testmostrarDescripcionNivel() {
        when(nivel.mostrarDescripcionNivel()).thenReturn("Nivel Basico");
        assertEquals("Nivel Basico", nivelBasico.mostrarDescripcionNivel());
    }

}