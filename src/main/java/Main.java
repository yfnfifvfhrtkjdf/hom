import model.Calculator;
import java.util.Scanner;
import static model.Calculator.execute;

public class Main  {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner in = new Scanner(System.in);
   // System.out.println("операция :");
    String line2 = in.nextLine();

   // System.out.println("Введите первое число ");
    String line = in.nextLine();

   // System.out.println("Введите второе число :");
    String line3 = in.nextLine();

   // String s = execute(new String[]{line2, line,line3 });
   // System.out.println(s);
    System.out.println(execute(new String[]{line2, line,line3 }));
   // execute(new String[]{line2, line,line3 });

}
}


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





