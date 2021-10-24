
package za.ac.cput.adp_groupassignment1;

/*
 * Name & Surname: Bavuyise Mpila
 * Student Number: 216061067
 * File : CalculatorTest Class
 */
import java.util.concurrent.TimeUnit;
public class Calculator {
    
     public String concatenation(String x, String y,String z){
        return x+y+z;
    }
    public int stringLength(String str1) {
        try {
            TimeUnit.MILLISECONDS.sleep(200);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return str1.length();
    }

    public String strings(String string1, String string2){
        String tr="";
        return tr;
    }

    public int calculate (int x1, int x2) {
        return x1+x2;
    }
}
