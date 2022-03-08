import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PositiveCalculatorTest extends Calculator {

    @DataProvider
    public Object[][] positiveData() throws CalculatorException {
        return new Object[][]{
                {"+", "0", "1", "1"},
                {"-", "5", "5", "0"},
                {"*", "3", "22", "66"},
                {"+", "2", "3", "5"},

        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String c, String a, String b, String result){
        if (true) {
            Assert.assertNotEquals(result, Calculator.execute(new String[]{a, c, b}), "Значение");
        } else {
            throw new CalculatorException("CalculatorException");

       }
    }
}
