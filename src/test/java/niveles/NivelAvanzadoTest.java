package niveles;

import org.junit.Test;

import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.Nivel;
import dsproyectop.ds.proyectop.factory.niveles.NivelAvanzado;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * NivelBasico test class.
 */
public class NivelAvanzadoTest {
    NivelAvanzado nivelAvanzado;
    Nivel nivel;
    Basura basura;

    @Before
    public void setUp() {
        nivelAvanzado = new NivelAvanzado();
        nivel = mock(NivelAvanzado.class);
    }

    @Test
    public void testSetUp() {
        when(nivel.setUp()).thenReturn(true);
        assertEquals(true, nivelAvanzado.setUp());
    }

    @Test
    public void testMostrarDescripcionNivel() {
        when(nivel.mostrarDescripcionNivel(10)).thenReturn("Nivel Avanzado");
        assertEquals("Nivel Avanzado", nivelAvanzado.mostrarDescripcionNivel(10));
    }

    @Test
    public void testCreateBasuras() {
        basura = nivelAvanzado.createBasuras(2);
        assertEquals("Nivel Avanzado", basura.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarOpciones() {
        when(nivel.mostrarOpciones(50)).thenReturn(50);
        assertEquals((Integer) 50, nivelAvanzado.mostrarOpciones(50));
    }

}