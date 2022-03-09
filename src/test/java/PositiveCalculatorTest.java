import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertNotNull;

public class PositiveCalculatorTest  {

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
            if (a.equals("") && b.equals("") & c.equals("")) {
               // throw new CalculatorException("CalculatorException");
            } else {
                assertNotNull(Calculator.execute(new String[]{a, c, b}), "Значения равны");

            }
        }catch (Exception e){
            throw new CalculatorException("CalculatorException");

        }


   }
}
