/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laritz.michael
 */
public class MultiplyStuffTest {
    
    public MultiplyStuffTest() {
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
     * Test of multiply method, of class MultiplyStuff.
     */
    @Test
    public void testMultiply() {
        System.out.println("-------------------------------------");
        System.out.println("multiply test");
        int a = 5;
        int b = 3;

        int expResult = 15;

        int result = MultiplyStuff.multiply(a, b);
        System.out.println("Expected: " + a + "*" + b + "=" + expResult);
        System.out.println("Actual: " + a + "*" + b + "=" + result);
        assertEquals(expResult, result);
        System.out.println("-------------------------------------");
    }
    
}
