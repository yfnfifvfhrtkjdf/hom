import model.Calculator;
import model.CalculatorException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Арифметическая операция +, -, *: ");
        String operation=in.nextLine();

        System.out.println("Первое число: ");
        String line=in.nextLine();

        System.out.println("Второе число: ");
        String line1=in.nextLine();


        System.out.println("Результат операции: "+ Calculator.execute(new String[]{line,operation, line}));
    }
}
