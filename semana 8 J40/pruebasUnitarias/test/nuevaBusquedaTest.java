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
public class nuevaBusquedaTest {
    
    public nuevaBusquedaTest() {
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
     * Test of buscar method, of class nuevaBusqueda.
     */
    @Test
    public void testBuscar_array_vacio() {
        System.out.println("Caso Array vacío, debe devolver -2");
        int num = 20;
        int[] a = {};
        int expResult = -2;
        int result = nuevaBusqueda.buscar(num, a);
        //assertTrue("mensaje en caso sea falso", comparacion true/false)
        assertTrue("Error con el caso: Arreglo vacío, devolvió: "+result,result==expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBuscar_array_un_elemento() {
        System.out.println("Caso Array con un elemento, debe devolver 0 (posición)");
        int num = 34;
        int[] a = {34};
        int expResult = 0;
        int result = nuevaBusqueda.buscar(num, a);
        //assertTrue("mensaje en caso sea falso", comparacion true/false)
        assertTrue("Error con el caso: Arreglo vacío, devolvió: "+result,result==expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testBuscar_array_varios_elementos() {
        System.out.println("Caso Array con un elemento, debe devolver la posición");
        //Buscamos y lo encontramos al inicio
        int num = 34;
        int[] a = {34,4,5,6,18};
        int expResult = 0;
        int result = nuevaBusqueda.buscar(num, a);
        //assertTrue("mensaje en caso sea falso", comparacion true/false)
        assertTrue("Error con el caso: Arreglo vacío, devolvió: "+result,result==expResult);
        
        //Buscamos y lo encontramos al medio
        int num2 = 5;
        int[] a2 = {3,4,5,6,18};
        int expResult2 = 2;
        int result2 = nuevaBusqueda.buscar(num2, a);
        //assertTrue("mensaje en caso sea falso", comparacion true/false)
        assertTrue("Error con el caso: Arreglo vacío, devolvió: "+result2,result2==expResult2);

        //Buscamos y lo encontramos al final
        int num3 = 18;
        int[] a3 = {3,4,5,6,18};
        int expResult3 = 4;
        int result3 = nuevaBusqueda.buscar(num3, a);
        //assertTrue("mensaje en caso sea falso", comparacion true/false)
        assertTrue("Error con el caso: Arreglo vacío, devolvió: "+result3,result3==expResult3);

        //Buscamos y no lo encontramos
        int num4 = 20;
        int[] a4 = {3,4,5,6,18};
        int expResult4 = -1;
        int result4 = nuevaBusqueda.buscar(num4, a);
        //assertTrue("mensaje en caso sea falso", comparacion true/false)
        assertTrue("Error con el caso: Arreglo vacío, devolvió: "+result4,result4==expResult4);

    }
}
