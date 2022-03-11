import model.Calculator;
import java.util.Scanner;
import static model.Calculator.execute;

public class Main  {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    execute(new  String[3]);
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите число, операцию, второе число");

    String line1 = scan.nextLine();
    String line2 = scan.nextLine();
    String line3 = scan.nextLine();
    System.out.println(execute (new String[]{line1, line2, line3}));
    scan.close();






    System.out.println("операция :");


    System.out.println("Второе число :");


    System.out.printf("Результат:%s%n", execute(new String[]{line1}));
    System.out.println("Результат:" + execute(new String[]{line2}));
    System.out.println("Результат:" + execute(new String[]{line3}));
  }
}
  /*  String[] array = new String[3];
    array[3]=calculator.execute(new String[3]);

    String s =  array[0];
    System.out.println("1 +s");
    array[0]=in.nextLine();
    String s1 = array[1];
    array[1]=in.nextLine();
    array[2]=in.nextLine();
    String s2 = array[2];
    System.out.println("Результат: "+ execute(new String[]{s,s1,s2}));
in.close();
  }
}
 */ /*  System.out.println( calculator.execute(ew));

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





