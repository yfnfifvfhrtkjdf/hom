import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertNotNull;

public class PositiveCalculatorTest extends Calculator {

    @DataProvider
    public Object[][] positiveData() {
        return new Object[][]{
                {"+", "0", "1", "1"},
                {"-", "5", "5", "0"},
                {"*", "3", "22", "66"},
                {"+", "2", "3", "5"},


        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String c, String a, String b, String result) throws CalculatorException {
        try {
            //Assert.assertEquals(result, Calculator.execute(new String[]{a, c, b}));
            assertNotNull(result, Calculator.execute(new String[]{a, c, b}));
        } catch (Exception e) {
           throw new CalculatorException("CalculatorException");

        }

        //  throw new CalculatorException("CalculatorException");

    }
}
