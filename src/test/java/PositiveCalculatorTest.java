import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveData (){
        return new  Object[][]{
              //  {"+", "0", "1", "1"},
              //  {"-", "5", "5", "0"},
              //  {"*", "3", "22", "66"},
                {"1","0","1","+"},
               {"0","5","5","-"},
                {"66","3","22","*"},
        };
    }

    @Test(dataProvider = "positiveData")
    public void   positiveTest(String result, String a, String b, String c){
        Assert.assertEquals(result, Calculator.execute(new  String[]{a,c,b}), "Значения не равны");
    }
}
