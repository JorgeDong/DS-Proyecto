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
public class NivelTest {
    Nivel nivel;

    @Before
    public void setUp() {
        nivel = new NivelAvanzado();
    }

    @Test
    public void testEjecutarNivel() {
        assertEquals(true, nivel.ejecutarNivel(2));
    }

    @Test
    public void testSepararId() {
        assertEquals(true, nivel.separarId());
    }

    @Test
    public void testMostrarResultados() {
        assertEquals(true, nivel.mostrarResultados());
    }


}