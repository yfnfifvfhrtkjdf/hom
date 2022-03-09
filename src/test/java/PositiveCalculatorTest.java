import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertNotNull;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveData() {
        return new Object[][]{
                {"+", "0", "1", "1"},
                {"-", "5", "5", "0"},
                {"*", "3", "22", "66"},
                {"+", "2", "3", "5"},
                {"/", "2", "3", "0.667"},
                {"*", "2", "4.8", "9.6"},
                {"-", "-0.0", "-2.4", "2.4"}

        };
    }

    @Test(dataProvider = "positiveData")
    public void positiveTest(String c, String a, String b, String result) {
        System.out.println(a + c + b + "=" + result);

try {
            Assert.assertEquals(result, Calculator.execute(new String[]{a, c, b}), "Значения не равны");
    }catch (Exception e) {
        throw new AssertionError("");
    }
    }
}
