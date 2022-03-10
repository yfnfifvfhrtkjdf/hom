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
                {"+", "18", "101"},
                {"-", "9", "7"},
                {"*", "50", "2"},

        };
    }

    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)

    public void negativeTest(String b, String a, String c) throws CalculatorException{
         try {
             Calculator.execute(new String[]{b,a,c});
             Assert.fail("Ex");
             //  Assert.assertEquals(Calculator.execute(new String[]{b,a,c}), "НЕПРАВИЛЬНО");
         }catch (CalculatorException e){
             Assert.assertNotEquals("", e.getMessage());
            // throw new CalculatorException();
         }

       // Assert.assertNotEquals(Calculator.execute(new String[]{b,a,c}), "НЕПРАВИЛЬНО");


}
}
