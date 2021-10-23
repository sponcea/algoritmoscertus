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
public class numeroMayorTest {
    
    public numeroMayorTest() {
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
     * Test of obtenerNumeroMayor method, of class numeroMayor.
     */
    @Test
    public void testObtenerNumeroMayorB() {
        //Esto es lo que imprime en la consola
        System.out.println("caso 1 de la prueba del méteodo obtenerNumeroMayor, el mayor es b");
        
        //Acá se encuentran los argumentos del método que vamos a probar
        int a = 3;
        int b = 6;
        int c = 1;
        
        //Instanciamos la clase para luego invocar al método
        numeroMayor mayor = new numeroMayor();
        
        //El resultado esperado
        int expResult = b;
        
        //El resultado obtenido
        int result = mayor.obtenerNumeroMayor(a, b, c);
        
        //Compara el resultado esperado con el obtenido
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testObtenerNumeroMayorA() {
        //Esto es lo que imprime en la consola
        System.out.println("caso 1 de la prueba del méteodo obtenerNumeroMayor, el mayor es a");
        
        //Acá se encuentran los argumentos del método que vamos a probar
        int a = 13;
        int b = 6;
        int c = 1;
        
        //Instanciamos la clase para luego invocar al método
        numeroMayor mayor = new numeroMayor();
        
        //El resultado esperado
        int expResult = a;
        
        //El resultado obtenido
        int result = mayor.obtenerNumeroMayor(a, b, c);
        
        //Compara el resultado esperado con el obtenido
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testObtenerNumeroMayorIguales2() {
        //Esto es lo que imprime en la consola
        System.out.println("caso 1 de la prueba del méteodo obtenerNumeroMayor, 2 variables iguales");
        
        //Acá se encuentran los argumentos del método que vamos a probar
        int a = 3;
        int b = 11;
        int c = 11;
        
        //Instanciamos la clase para luego invocar al método
        numeroMayor mayor = new numeroMayor();
        
        //El resultado esperado
        int expResult = -1;
        
        //El resultado obtenido
        int result = mayor.obtenerNumeroMayor(a, b, c);
        
        //Compara el resultado esperado con el obtenido
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testObtenerNumeroMayorIguales3() {
        //Esto es lo que imprime en la consola
        System.out.println("caso 1 de la prueba del méteodo obtenerNumeroMayor, 3 variables iguales");
        
        //Acá se encuentran los argumentos del método que vamos a probar
        int a = 11;
        int b = 11;
        int c = 11;
        
        //Instanciamos la clase para luego invocar al método
        numeroMayor mayor = new numeroMayor();
        
        //El resultado esperado
        int expResult = -1;
        
        //El resultado obtenido
        int result = mayor.obtenerNumeroMayor(a, b, c);
        
        //Compara el resultado esperado con el obtenido
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    
    
}
