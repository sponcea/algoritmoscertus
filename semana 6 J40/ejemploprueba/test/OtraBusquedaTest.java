/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DIA
 */
public class OtraBusquedaTest {
    
    public OtraBusquedaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of busca method, of class OtraBusqueda.
     */
    @Test
    public void testBusca() {
        System.out.println("busca");
        int ele = 0;
        int[] a = null;
        int expResult = -2;
        int result = OtraBusqueda.busca(ele, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBusca2() {
        System.out.println("Buscar en array Vacío");
        int ele = 20;
        int[] a = null;
        int expResult = -2;
        int result = OtraBusqueda.busca(ele, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testArrayVacio() {
        // Array vacío (1)
        System.out.println("Buscar elemento en arreglo vacío");
        int[] a = {};
            int pos = OtraBusqueda.busca(20, a);
            assertTrue("No excepción, array vacío", pos==-1);
        // El comportamiento correcto es que se lance la excepción
        // Simplemente la cojo para que no salga fuera del método y
        // JUnit lo interprete como un error
    }
    
        @Test
    public void testArrayMasDeUnEle() throws BuscaEnArray.SecuenciaVacia {
        int pos;
        // encontrado primero (4)
        int[] a1 = {17, 29, 21, 23};
        pos = OtraBusqueda.busca(17, a1);
        assertTrue("Error, en posición:" + pos, pos == 0);
        // encontrado central (5)
        int[] a2 = {17, 18, 21, 23, 29, 41, 38};
        pos = OtraBusqueda.busca(23, a2);
        assertTrue("Error, No encontrado:" + pos, pos == 3);
        // encontrado último (6)
        int[] a3 = {41, 18, 9, 31, 30, 16, 45};
        pos = OtraBusqueda.busca(45, a3);
        assertTrue("Error, en posición:" + pos, pos == 6);
        // no encontrado (7)
        int[] a4 = {21, 23, 29, 33, 38};
        pos = OtraBusqueda.busca(25, a4);
        assertTrue("Error, No encontrado:" + pos, pos == -1);
    }
    
        @Test
    public void testArrayUnEle() throws BuscaEnArray.SecuenciaVacia {
        int[] a = {17};
        int pos;
        // elemento encontrado (2)
        pos = OtraBusqueda.busca(17, a);
        assertTrue("Error posición:" + pos, pos == 0);
        // elemento no encontrado (3)
        pos = OtraBusqueda.busca(18, a);
        assertTrue("Error posición:" + pos, pos == -1);
    }
    
}
