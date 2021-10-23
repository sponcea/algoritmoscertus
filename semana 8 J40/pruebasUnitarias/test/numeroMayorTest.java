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
     * Test of retornarMayor method, of class numeroMayor.
     */
    @Test
    public void testRetornarMayorC() {
        //Esto es lo que se imprimirá en consola, colocar un texto que permita identificar la prueba
        System.out.println("Probamos el método Retornar mayor, en este caso el mayor debe ser c");
        
        //Declaración de las variables que usaremos para probar el método, en este caso son 3 variables
        int a = 3;
        int b = 4;
        int c = 5;
        
        //Instanciamos la clase numeroMayor, el objeto se llama instance
        numeroMayor instance = new numeroMayor();
        
        //Variable que almacena el resultado esperado
        int expResult = c;
        
        //Variable que almacena el resultado obtenido
        int result = instance.retornarMayor(a, b, c);
        
        //Si expResult es igual a result, entonces la prueba finalizó con éxito
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRetornarMayorA() {
        //Esto es lo que se imprimirá en consola, colocar un texto que permita identificar la prueba
        System.out.println("Probamos el método Retornar mayor, en este caso el mayor debe ser A");
        
        //Declaración de las variables que usaremos para probar el método, en este caso son 3 variables
        int a = 100;
        int b = 100;
        int c = 8;
        
        //Instanciamos la clase numeroMayor, el objeto se llama instance
        numeroMayor instance = new numeroMayor();
        
        //Variable que almacena el resultado esperado
        int expResult = a;
        
        //Variable que almacena el resultado obtenido
        int result = instance.retornarMayor(a, b, c);
        
        //Si expResult es igual a result, entonces la prueba finalizó con éxito
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRetornarMayorB() {
        //Esto es lo que se imprimirá en consola, colocar un texto que permita identificar la prueba
        System.out.println("Probamos el método Retornar mayor, en este caso el mayor debe ser b");
        
        //Declaración de las variables que usaremos para probar el método, en este caso son 3 variables
        int a = 15;
        int b = 13;
        int c = 14;
        
        //Instanciamos la clase numeroMayor, el objeto se llama instance
        numeroMayor instance = new numeroMayor();
        
        //Variable que almacena el resultado esperado
        int expResult = b;
        
        //Variable que almacena el resultado obtenido
        int result = instance.retornarMayor(a, b, c);
        
        //Si expResult es igual a result, entonces la prueba finalizó con éxito
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
