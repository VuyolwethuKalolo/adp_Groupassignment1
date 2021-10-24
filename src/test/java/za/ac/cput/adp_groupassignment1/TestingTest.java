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
     private Testing number1;
    private Testing number2;
    private Testing number3;
  
    
    @BeforeEach
    public void setUp() {
       number1= new Testing();
       number2= new Testing();
       number3= new Testing();
    }
    
    @AfterEach
    public void tearDown() {
    }
    @Test 
    public void testIdenty(){
    assertSame(number1,number3);
    }
    @Test 
    public void testEquality(){
    
    assertEquals(number1,number3);
    }
   
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        Testing instance = new Testing();
        int expResult = 4;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    
}
