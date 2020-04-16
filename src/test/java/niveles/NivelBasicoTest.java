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

    @Before
    public void setUp() {
        nivelBasico = new NivelBasico();
        nivel = mock(NivelBasico.class);
    }

    @Test
    public void testMostrarDescripcionNivel() {
        when(nivel.mostrarDescripcionNivel()).thenReturn("Nivel Basico");
        assertEquals("Nivel Basico", nivelBasico.mostrarDescripcionNivel());
    }

    @Test
    public void testCreateBasuras() {
        when(nivel.createBasuras(0)).thenReturn(0);
        assertEquals((Integer) 0, nivelBasico.createBasuras(0));
    }


    @Test
    public void testMostrarOpciones() {
        when(nivel.mostrarOpciones(20)).thenReturn(20);
        assertEquals((Integer) 20, nivelBasico.mostrarOpciones(20));
    }


}