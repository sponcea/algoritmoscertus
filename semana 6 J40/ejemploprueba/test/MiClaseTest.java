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
public class MiClaseTest {
    
    public MiClaseTest() {
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
     * Test of numeroMayor method, of class MiClase.
     */
    
    @Test
    public void testNumeroMayor_caso1() {
        System.out.println("numeroMayor");
        int a = 3;
        int b = 5;
        int c = 7;
        MiClase instance = new MiClase();
        int expResult = 7;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testNumeroMayor_caso2() {
        System.out.println("numeroMayor");
        int a = 10;
        int b = 5;
        int c = 7;
        MiClase instance = new MiClase();
        int expResult = 10;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testNumeroMayor_caso3() {
        System.out.println("numeroMayor");
        int a = 8;
        int b = 20;
        int c = 1;
        MiClase instance = new MiClase();
        int expResult = 20;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of numeroMayor method, of class MiClase.
     */
    @Test
    public void testNumeroMayor() {
        System.out.println("numeroMayor");
        int a = 0;
        int b = 0;
        int c = 0;
        MiClase instance = new MiClase();
        int expResult = -1;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
