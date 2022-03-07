import model.Calculator;

import java.util.Scanner;

public class Main extends  Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Первое число: ");
        String line1=in.nextLine();

        System.out.println("Арифметическая операция: ");
        String arifmeticOperation=in.nextLine();

        System.out.println("Второе число: ");
        String line2=in.nextLine();
        System.out.println("Результат операции: "+ Calculator.execute(new String[]{line1, arifmeticOperation, line2} ));
    }
}
