/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basuras;

import dsproyectop1.ds.proyectop1.factory.basuras.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author coque
 */
public class BasuraBasicoInorganicoTest {
    BasuraBasicoInorganico  basuraBasicoInorganico;
    @Before
    public void setUp(){
        basuraBasicoInorganico = new  BasuraBasicoInorganico();
    }
    
    @Test
    public void testNam() {
        assertEquals("funciona BasuraBasicoInorganico", basuraBasicoInorganico.getStatus());
    }
}
