package basuras;

import org.junit.Test;

import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.basuras.BasuraIntermedioOrganico;

import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * BasuraIntermedioInorganico test class.
 */
public class BasuraIntermedioOrganicoTest {
    BasuraIntermedioOrganico basuraIntermedioOrganico;
    Basura basura;

    @Before
    public void setUp() {
        basuraIntermedioOrganico = new BasuraIntermedioOrganico();
        basura = mock(BasuraIntermedioOrganico.class);
    }

    @Test
    public void testMostrarDescripcionNivel() {
        when(basura.mostrarDescripcionNivel()).thenReturn("Nivel Intermedio");
        assertEquals("Nivel Intermedio", basuraIntermedioOrganico.mostrarDescripcionNivel());
    }

    @Test
    public void testMostrarTipoBasura() {
        when(basura.mostrarTipoBasura()).thenReturn("Tipo de basura: Organico");
        assertEquals("Tipo de basura: Organico", basuraIntermedioOrganico.mostrarTipoBasura());
    }

    @Test
    public void testgetStatus() {
        assertEquals("funciona BasuraIntermedioOrganico",  basuraIntermedioOrganico.getStatus());
    }

}