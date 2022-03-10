import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Scanner;

public class NegativeCalculatorTest {
    @DataProvider
    public Object[][] negativeData()  {
        return new Object[][]{


        };
    }

    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)

    public void negativeTest(String b, String a, String c) throws CalculatorException{
         try {
             Calculator.execute(new String[]{b,a,c});
             //  Assert.assertEquals(Calculator.execute(new String[]{b,a,c}), "НЕПРАВИЛЬНО");
         }catch (CalculatorException e){
           e.printStackTrace();
            // throw new CalculatorException();
         }

       // Assert.assertNotEquals(Calculator.execute(new String[]{b,a,c}), "НЕПРАВИЛЬНО");


}
}
