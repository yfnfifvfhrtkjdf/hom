import model.Calculator;

import java.util.Scanner;

public class Main extends Calculator {


  public static void main(String[] args)  {
    Calculator calculator = new Calculator();
    Scanner in = new Scanner(System.in);
    System.out.println("one: ");
   // System.out.println(calculator.execute(new String[3]));
    calculator.execute(new String[3]);
    String s = calculator.execute(new String[0]);

    s = in.nextLine();
  //  double d = Double.parseDouble(execute(new String[0]));
  //   d =in.nextDouble();
    System.out.println("two ");
    String s1 = calculator.execute(new String[1]);
    s1 = in.nextLine();
    String s2 = calculator.execute(new String[2]);
    s2 = in.nextLine();
    System.out.println("Результат: "+ execute(new String[]{s,s1,s2}));
//execute(new String[]{s, s1, s2});

  }
}
  /*  System.out.println( calculator.execute(ew));

 if (operator.equals("+")) {
        System.out.println("=" + calculator.execute(new String[]{String.valueOf(one), operator, String.valueOf(two)}));
      }
      if (operator.equals("-")) {
        System.out.println("=" + (one - two));
      }
      if (operator.equals("*")) {
        System.out.println("=" + (one * two));
      }
      if (operator.equals("/")) {
        System.out.println("=" + (one / two));
      }
  }
}

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





