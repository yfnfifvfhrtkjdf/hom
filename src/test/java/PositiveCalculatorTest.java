import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveTestData(){
        return new  Object[][]{
                {"1","0","1","+"},
                {"0","5","5","-"},
                {"66","3","22","*"},
        };
    }

    @Test(dataProvider = "positiveTestData")
    public void   positiveTest(String result, String a, String b, String c){
        Assert.assertEquals(result, Calculator.execute(new  String[]{a,c,b}), "Значения не равны");
    }
}
