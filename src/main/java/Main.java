import model.Calculator;
import java.util.Scanner;
import static model.Calculator.execute;

public class Main  {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    double num1 = getInt();
    char operation = getOperation();
    double num2 = getInt();
    double result = calc(num1,num2,operation);
    System.out.println("Результат операции: "+result);
    System.out.println("Результат калькулятора "+execute(new String[]{String.valueOf(operation),String.valueOf(num1),String.valueOf(num2)}));
  }

  public static double getInt(){
    System.out.println("Введите число:");
    double num;
    if(scanner.hasNextInt()){
      num = scanner.nextInt();
    } else {
      System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
      scanner.next();//рекурсия
      num = getInt();
    }
    return num;
  }

  public static char getOperation(){
    System.out.println("Введите операцию:");
    char operation;
    if(scanner.hasNext()){
      operation = scanner.next().charAt(0);
    } else {
      System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
      scanner.next();//рекурсия
      operation = getOperation();
    }
    return operation;
  }

  public static double calc(double num1, double num2, char operation){
    double result;
    switch (operation){
      case '+':
        result = num1+num2;
        break;
      case '-':
        result = num1-num2;
        break;
      case '*':
        result = num1*num2;
        break;
      case '/':
        result = num1/num2;
        break;
      default:
        System.out.println("Операция не распознана. Повторите ввод.");
        result = calc(num1, num2, getOperation());//рекурсия
    }
    return result;
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





