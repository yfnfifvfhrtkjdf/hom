
import model.Calculator;

import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
   // Scanner in = new Scanner(System.in);
    Calculator cal = new Calculator();
   // String line=in.nextLine();
 Scanner in = new Scanner(Calculator.execute(new String[]{"","",""}));
    String line=in.nextLine();
    System.out.println("1 "+line);
  //  Scanner scanner = new Scanner ("Первое число, \n" +"Второе число, \n"+ "Операция \n" );
    String line1="";
   Scanner scanner1=new Scanner(cal.execute(new String[]{line1}));
    String s = scanner1.nextLine();
     line1 = scanner1.nextLine();
    System.out.println(s+cal.execute(new  String[]{line1})+s+s);

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





