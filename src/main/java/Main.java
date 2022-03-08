import model.Calculator;
import model.CalculatorException;


import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String operation = in.nextLine();
        System.out.println(operation);

        String line = in.nextLine();
        System.out.println(line);

        String line1 = in.nextLine();
        System.out.println(line1);

            System.out.println("Результат операции: " + Calculator.execute(new String[]{line, operation, line1}));

    }
}

