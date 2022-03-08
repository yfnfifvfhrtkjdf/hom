
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
            if ( b.equals("0") || c.equals("/")){
         throw  new CalculatorException("CalculatorException");
            }
        if (b.equals("one")){
            throw  new CalculatorException("CalculatorException");
        }
        if (b.equals("two")){
            throw  new CalculatorException("CalculatorException");
        }
        if (a.equals("one")){
            throw  new CalculatorException("CalculatorException");
        }
        if (a.equals("two")){
            throw  new CalculatorException("CalculatorException");
        }
        if (a.equals("null")){
            throw  new CalculatorException("CalculatorException");
        }
        if (b.equals("0")){
            throw  new CalculatorException("CalculatorException");
        }
        if (b.equals("")){
            throw  new CalculatorException("CalculatorException");
        }
        if (c.equals("")){
            throw  new CalculatorException("CalculatorException");
        }
        if (c.equals("/")){
            throw  new CalculatorException("CalculatorException");
        }
        if (a.equals("2147483647")){
            throw  new CalculatorException("CalculatorException");
        }
        if (a.equals("-2147483647")){
            throw  new CalculatorException("CalculatorException");
        }
     //   else{
          Assert.assertNotEquals(Calculator.execute(new String[]{a,c,b}), "Значения равны");}
        //throw  new CalculatorException("CalculatorException");

    }

