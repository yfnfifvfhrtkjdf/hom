import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {
    @DataProvider
    public Object[][] negativeTestData(){
            return new  Object[][]{
                    {"-1","18","-101","+"},
                    {"0","9","7","-"},
                    {"1004","50","2","*"},
            };
    }

    @Test(dataProvider = "negativeTestData")
    public void negativeTest(String result, String a, String b, String c) throws CalculatorException {

        if(a.equals("") && b.equals("") & a.equals("0")|| c.equals("/")){
    throw  new CalculatorException("CalculatorException");
        }
        else{
            Assert.assertNotEquals(result, Calculator.execute(new String[]{a,b,c}), "Значения равны");
        }
    }

}