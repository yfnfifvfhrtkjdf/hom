
import model.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    //  считать из консоли три строки (оператор и два числа),
    //  затем вызвать на этих данных метод execute класса
    //  Calculator и вывести результат обратно в консоль.
    System.out.println("Первое число :");
    Scanner in = new Scanner(System.in);
    String line = in.nextLine();
    System.out.println("операция :");
    String line2 = in.nextLine();
    System.out.println("Второе число :");
    String line3 = in.nextLine();
    System.out.println();
    System.out.println("Результат:"+ "1: %s 2 %s 3 %s"+ Calculator.execute(new String[]{String.valueOf(line), String.valueOf(line2), String.valueOf(line3)}));

  }
  }




