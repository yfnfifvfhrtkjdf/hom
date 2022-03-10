import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Scanner;

public class NegativeCalculatorTest {
    Scanner in = new Scanner(System.in);
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
    public void negativeTest(String c, String a, String b) throws CalculatorException  {
       try {
           Assert.assertNotEquals(Calculator.execute(new String[]{a,c,b}), "НЕПРАВИЛЬНО");
       }catch (Exception e){
           throw new CalculatorException();
       }

    }
}
