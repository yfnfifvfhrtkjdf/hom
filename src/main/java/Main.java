
import model.Calculator;

import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
    String number1 = in.nextLine();
    System.out.println(number1);
    System.out.print(" + - или *: ");
    String mathOperation = in.nextLine();
    System.out.println(mathOperation);
    System.out.print("Введите число: ");
    String number2 = in.nextLine();
    System.out.println(number2);
    System.out.println("Результат:"+ calculator.execute(new String[]{number1,mathOperation,number2}));
  }
}

   //
  //  String st = cal.execute(new  String[]{line});
 //   Calculator.execute(new String[]{});

  //  String line1=in.nextLine();
  //  String operation=in.nextLine();
//getline(Calculator.execute(new String[]{getline(getline(line)), getline(line1), getline(operation) }));


  //}
 // public static String getline(String li){
 //    li = in.nextLine();
 //   System.out.println(li);
 //   return getline(li);


/*
    Calculator calculator = new Calculator();
    calculator.equals(scanner.nextLine());
    String val1 = "";
    String val2 = "";
    String operation = null;
    Calculator calc = new Calculator();
    System.out.println(val1= scanner.nextLine());
    System.out.println( val2=scanner.nextLine());
    System.out.println( operation=scanner.nextLine());
    calc.execute(new String[]{val1, operation, val2});

*/




    // public static void main(String[] args) {
    //  считать из консоли три строки (оператор и два числа),
    //  затем вызвать на этих данных метод execute класса
    //  Calculator и вывести результат обратно в консоль.
   /* System.out.println("Первое число :");
    Scanner in = new Scanner(System.in);
    String line = in.nextLine(Calculator.execute(new String[]{}));
    System.out.println("операция :");
    String line2 = in.nextLine();
    System.out.println("Второе число :");
    String line3 = in.nextLine();
    System.out.println();
    System.out.println("Результат:" + Calculator.execute(new String[]{String.valueOf(line), String.valueOf(line2), String.valueOf(line3)}));
*/





