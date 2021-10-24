/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp_groupassignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Master Vee
 */
public class TestingTest {
    
    public TestingTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class Testing.
     */
    @Test//testing Equality
    public void testAdd()
    {
        System.out.println("add");
        String s1 = "4";
        String s2 = "4";
        Testing instance = new Testing();
        int expResult = 0;
        int result =Integer.parseInt( instance.equal(s1));
        assertEquals(expResult, result);
       
    }
    
     @Test(expected=NumberFormatException.class)//test failling
    public void testAdd2() 
    {
        System.out.println("add");
        String s1 = "fot";
        String s2 = "4";
        Testing instance = new Testing();
       int result= instance.add(s1, s2);
       
    }
    
@Test//*(timeout=1000)*
    public void testAdd3()
    {
        System.out.println("add");
        String s1 = "4";
        String s2 = "4";
        int timeout=5;
        Testing instance = new Testing();
        final int factorialOf = 1 + (int) (30000 * Math.random());
    }
    
    @Test
public void temporarilyDisabledTest() throws Exception {
    System.out.println("done");
    assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    
}
    
}