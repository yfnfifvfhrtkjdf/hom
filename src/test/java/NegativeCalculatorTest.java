
import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest extends Calculator {
    @DataProvider
    public Object[][] negativeData (){
            return new Object [][]{
                   {"+", "18", "101"},
                   {"-", "9", "7"},
                    {"*", "50", "2"},
                    {"/", "0", "0"},
                    {"+", "null", "null"}
            };
    }

    @Test(dataProvider = "negativeData")
    public void negativeTest(String c, String a, String b)  throws CalculatorException {
            if (b.equals("") && a.equals("") & b.equals("0") || c.equals("/")){
         throw  new CalculatorException("CalculatorException");

            }
        else{
          Assert.assertNotEquals(Calculator.execute(new String[]{a,c,b}), "Значения равны");}
        //throw  new CalculatorException("CalculatorException");
    }

}