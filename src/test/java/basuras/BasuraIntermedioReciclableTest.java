package basuras;

import org.junit.Test;

import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.factory.basuras.BasuraIntermedioReciclable;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * BasuraIntermedioReciclable test class.
 */
public class BasuraIntermedioReciclableTest {
    BasuraIntermedioReciclable basuraIntermedioReciclable;
    Basura basura;

    @Before
    public void setUp() {
        basuraIntermedioReciclable = new BasuraIntermedioReciclable();
        basura = mock(BasuraIntermedioReciclable.class);
    }

    @Test
    public void testMostrarDescripcionNivel() {
        when(basura.mostrarDescripcionNivel()).thenReturn("Nivel Intermedio");
        assertEquals("Nivel Intermedio", basuraIntermedioReciclable.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        when(basura.mostrarTipoBasura()).thenReturn("Tipo de basura: Reciclable");
        assertEquals("Tipo de basura: Reciclable", basuraIntermedioReciclable.mostrarTipoBasura());
    }

    @Test
    public void testgetStatus() {
        assertEquals("funciona BasuraIntermedioReciclable",  basuraIntermedioReciclable.getStatus());
    }

}