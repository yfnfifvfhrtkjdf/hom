import model.Calculator;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String line = getInt();
        String line1 = getInt();
        String operation = getOperation();

        System.out.println("Результат операции: " + Calculator.execute(new String[]{line, operation, line1}));
        System.out.println(operation);
        System.out.println(line);
        System.out.println(line1);
    }
    public static String getInt(){
        System.out.println("1 ЧИСЛО ");
        String num;
        if (in.hasNextLine()){
            num = in.nextLine();
    }else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия
            num = getInt();
        }
        return num;
    }
    public static String getOperation(){
        System.out.println("Введите операцию:");
        String operation;
        if(in.hasNextLine()){
            operation = in.nextLine();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            in.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }



}

