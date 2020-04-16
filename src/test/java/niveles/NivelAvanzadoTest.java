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

    @Test
    public void testCreateBasuras() {
        when(nivel.createBasuras(2)).thenReturn(2);
        assertEquals((Integer) 2, nivelAvanzado.createBasuras(2));
    }

    @Test
    public void testMostrarOpciones() {
        when(nivel.mostrarOpciones(50)).thenReturn(50);
        assertEquals((Integer) 50, nivelAvanzado.mostrarOpciones(50));
    }

}