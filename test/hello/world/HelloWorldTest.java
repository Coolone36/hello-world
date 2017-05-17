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
public class HelloWorldTest {

    public HelloWorldTest() {
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
     * Test of main method, of class HelloWorld.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HelloWorld.main(args);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(5, 5);
    }

    /**
     * Test of add method, of class HelloWorld.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 3;

        int expResult = 8;

        int result = HelloWorld.add(a, b);
        System.out.println("Expected: " + a + "+" + b + "=" + expResult);
        System.out.println("Actual: " + a + "+" + b + "=" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testAdd2() {
        System.out.println("add");
        int a = 5;
        int b = 4;

        int expResult = 9;

        int result = HelloWorld.add(a, b);
        System.out.println("Expected: " + a + "+" + b + "=" + expResult);
        System.out.println("Actual: " + a + "+" + b + "=" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
