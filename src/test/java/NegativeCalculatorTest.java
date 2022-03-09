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
              //  {"/", "6", "0"},
              //  {"plus", "7", "two"}
        };
    }

    @Test(dataProvider = "negativeData")
    public void negativeTest(String c, String a, String b) throws CalculatorException {
        try {
            if (a.equals("") && b.equals("") & a.equals("0") || c.equals("/")) {
                throw new CalculatorException("CalculatorException");
            } else {
                assertNotNull(Calculator.execute(new String[]{a, c, b}), "Значения равны");

            }
        }catch (Exception e){
            throw new CalculatorException("CalculatorException");

        }


    }
}
