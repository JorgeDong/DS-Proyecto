package basuras;

import org.junit.Test;

import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.factory.basuras.BasuraIntermedioInorganico;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * BasuraIntermedioInorganico test class.
 */
public class BasuraIntermedioInorganicoTest {
    BasuraIntermedioInorganico basuraIntermedioInorganico;
    Basura basura;

    @Before
    public void setUp() {
        basuraIntermedioInorganico = new BasuraIntermedioInorganico();
        basura = mock(BasuraIntermedioInorganico.class);
    }

    @Test
    public void testMostrarDescripcionNivel() {
        when(basura.mostrarDescripcionNivel()).thenReturn("Nivel Intermedio");
        assertEquals("Nivel Intermedio", basuraIntermedioInorganico.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        when(basura.mostrarTipoBasura()).thenReturn("Tipo de basura: Inorganico");
        assertEquals("Tipo de basura: Inorganico", basuraIntermedioInorganico.mostrarTipoBasura());
    }

    @Test
    public void testgetStatus() {
        assertEquals("funciona BasuraIntermedioInorganico",  basuraIntermedioInorganico.getStatus());
    }

}