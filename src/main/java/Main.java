import model.Calculator;

import java.util.Scanner;

public class Main {
  public   static Scanner in = new Scanner(System.in);
    private static String number1;
    private static String number2;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       // Calculator.getInt(number1);
        System.out.print("Введите первое целое число: ");

   //     System.out.println(Calculator.getInt(number1));
        String number1 = in.nextLine();
   //     System.out.println(Calculator.getInt(number2));
        System.out.print("Введите арифметическую операцию + - или *: ");
        String mathOperation = in.nextLine();


        System.out.print("Введите второе целое число: ");
        String number2 = in.nextLine();




      ///  System.out.println(Calculator.getOperation(mathOperation));
        System.out.println("Результат:"+Calculator.execute(new String[]{number1,mathOperation,number2}));
    }
}

