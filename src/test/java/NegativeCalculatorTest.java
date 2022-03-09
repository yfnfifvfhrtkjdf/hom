import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertNotNull;

public class NegativeCalculatorTest  {

    @DataProvider
    public Object[][] negativeData()  {
        return new Object[][]{
                {"+", "18", "101"},
                {"-", "9", "7"},
                {"*", "50", "2"},

        };
    }

    @Test(dataProvider = "negativeData")
    public void negativeTest(String c, String a, String b) throws CalculatorException {

        try { Calculator.execute(new String[]{a,c,b});
        }catch (Exception e) {
            throw new CalculatorException("CalculatorException");
        }
   }
}
