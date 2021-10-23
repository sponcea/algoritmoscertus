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
public class BusquedaTest {
    
    public BusquedaTest() {
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
     * Test of busca method, of class Busqueda.
     */
    @Test
    public void testBusca_arrayVacio() {
        System.out.println("Probamos que el array esté vacío");
        int numero = 0;
        int[] arreglo = {};
        int expResult = -1;
        int pos = Busqueda.busca(numero, arreglo);
        assertTrue("Error, se esperaba -1 y se obtuvo: "+pos, pos==expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBusca_arrayNull() {
        System.out.println("Probamos que el array sea igual a null");
        int numero = 0;
        int[] arreglo = null;
        int expResult = -3;
        int pos = Busqueda.busca(numero, arreglo);
        assertTrue("Error, se esperaba -1 y se obtuvo: "+pos, pos==expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
    @Test
    public void testBusca_arrayUnElemento() {
        System.out.println("Probamos que el array tenga un elemento y no se encuentre");
        int numero = 14;
        int[] arreglo = {14};
        int expResult = 0;
        int pos = Busqueda.busca(numero, arreglo);
        assertTrue("Error, se esperaba -1 y se obtuvo: "+pos, pos==expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("Probamos que el array tenga un elemento y que lo encuentre");
        int numero2= 0;
        int[] arreglo2 = {14};
        int expResult2 = -2;
        int pos2 = Busqueda.busca(numero2, arreglo2);
        assertTrue("Error, se esperaba -1 y se obtuvo: "+pos2, pos2==expResult2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBusca_arrayVariosElementos() {
        System.out.println("Probamos que el array tenga varios elementos y no lo encuentre");
        int numero = 1;
        int[] arreglo = {3,5,2,15,14};
        int expResult = -2;
        int pos = Busqueda.busca(numero, arreglo);
        assertTrue("Error, se esperaba -1 y se obtuvo: "+pos, pos==expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("Probamos que el array tenga varios elementos y que lo encuentre en distintas posiciones");
        int numero2= 3;
        int[] arreglo2 = {3,5,2,15,14};
        int expResult2 = 0;
        int pos2 = Busqueda.busca(numero2, arreglo2);
        assertTrue("Error, se esperaba -1 y se obtuvo: "+pos2, pos2==expResult2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("Probamos que el array tenga varios elementos y que lo encuentre en distintas posiciones");
        int numero3= 4;
        int[] arreglo3 = {3,5,4,15,14};
        int expResult3 = 2;
        int pos3 = Busqueda.busca(numero3, arreglo3);
        assertTrue("Error, se esperaba -1 y se obtuvo: "+pos3, pos3==expResult3);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.out.println("Probamos que el array tenga varios elementos y que lo encuentre en distintas posiciones");
        int numero4= 14;
        int[] arreglo4 = {3,5,4,15,14};
        int expResult4 = 4;
        int pos4 = Busqueda.busca(numero4, arreglo4);
        assertTrue("Error, se esperaba -1 y se obtuvo: "+pos4, pos4==expResult4);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }       
}
