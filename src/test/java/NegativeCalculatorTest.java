import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
         }catch (CalculatorException e){
           e.printStackTrace();
         }
}
}
