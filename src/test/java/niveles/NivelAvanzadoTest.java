package niveles;

import org.junit.Test;

import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.factory.Nivel;
import dsproyectop1.ds.proyectop1.factory.niveles.NivelAvanzado;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * NivelBasico test class.
 */
public class NivelAvanzadoTest {
    NivelAvanzado nivelAvanzado;
    Nivel nivel;

    @Before
    public void setUp() {
        nivelAvanzado = new NivelAvanzado();
        nivel = mock(NivelAvanzado.class);
    }

    @Test
    public void testMostrarDescripcionNivel() {
        when(nivel.mostrarDescripcionNivel()).thenReturn("Nivel Avanzado");
        assertEquals("Nivel Avanzado", nivelAvanzado.mostrarDescripcionNivel());
    }

}