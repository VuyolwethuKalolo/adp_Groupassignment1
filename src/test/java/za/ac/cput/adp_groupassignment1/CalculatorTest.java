
package za.ac.cput.adp_groupassignment1;

/*
 * Name & Surname: Bavuyise Mpila
 * Student Number: 216061067
 * File : CalculatorTest Class
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
      private Calculator calc;
    private int string;
    private Assertions Assert;

    @BeforeEach
    void setUp() throws Exception {
        calc =new Calculator();
    }

    @Test
    public void testObjectEquality(){
        String results = calc.strings("x","x");
        Assert.assertEquals(true, true == true, results);
    }

    private String strings(String x, String x1) {
        return x;
    }

    //object identity
    @Test
    public void testObjectIdentity(){
        String results = calc.strings("xy","yz");
        Assert.assertNotSame(results,true);
    }


    //timeout test
    @Test
    public void testTimeOut(){
        int results =calc.stringLength("String1");
        assertEquals(results,7);}

    private int stringLength(String string1) {
        return  string;
    }

    // failing test
    @Test
    public void testFail(){
        Calculator test = new Calculator();
        int result = test.calculate(10, 5);
        assertEquals(11, result);
    }

    @Disabled ("Disable the test")
    @Test
    public void testDisabling(){
        int results = calc.stringLength("String1");
        assertEquals(results,0);
    }
}