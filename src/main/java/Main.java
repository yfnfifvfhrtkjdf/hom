
import model.Calculator;

import java.util.Scanner;

public class Main extends Calculator {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String val1 = "";
    String val2 = "";
    String operation = null;
    Calculator calc = new Calculator();
    System.out.println(val1= scanner.nextLine());
    System.out.println( val2=scanner.nextLine());
    System.out.println( operation=scanner.nextLine());
    calc.execute(new String[]{val1, operation, val2});






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
  }
}




