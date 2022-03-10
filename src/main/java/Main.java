import model.Calculator;
import org.testng.Assert;

import java.util.Scanner;

public class Main {


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String nam = in.next();
    String num = in.next();

    String number1 = in.nextLine();
    String mathOperation=in.nextLine();
    String number2=in.nextLine();
    //System.out.println("Результат:"+Calculator.execute(new String[]{number1,mathOperation,number2}));

    System.out.print("Введите первое целое число: " + number1);
 //number1 = in.nextLine();

    System.out.print("Введите арифметическую операцию + - или *: ");
  //   mathOperation = in.nextLine();
    System.out.print("Введите второе целое число: ");
  //  number2 = in.nextLine();
  //  Assert.assertEquals( Calculator.execute(new String[]{number1, mathOperation, number2}), "Значения не равны");
   //
  }


}


