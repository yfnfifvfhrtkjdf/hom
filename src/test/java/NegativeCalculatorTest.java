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
                {"/", "1", "0"},
                {"/", "-1.1", "-0.0"},
                {"+", "null", "null"},
                {"-", "one", "two"}
        };
    }

    @Test(dataProvider = "negativeData")
    public void negativeTest(String b, String a, String c) throws CalculatorException  {

           Assert.assertNotEquals(Calculator.execute(new String[]{b,a,c}), "НЕПРАВИЛЬНО");


}
}
