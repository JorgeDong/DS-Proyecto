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
public class NivelTest {
    Nivel nivel;

    @Before
    public void setUp() {
        nivel = new NivelAvanzado();
    }

    @Test
    public void testEjecutarNivel() {
        String[] basuraMenuAvanzado = {"Orgánico", "Papel",
        "Vidrio", "Metal", "Plástico", "Textiles",
        "Basura tecnológica"};
        int tiempoAvanzado = 3000;
        assertEquals(true, nivel.ejecutarNivel(1, basuraMenuAvanzado, tiempoAvanzado));
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