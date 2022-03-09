package model;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Calculator  {
    static Scanner in = new Scanner(System.in);


    public static String execute(String[]params) {
       int a = parseInt(params[0]);
       int b = parseInt(params[2]);
        int operation =0;


            try { switch (params[1]) {case "+":operation = a + b;break;}
               // throw new CalculatorException("CalculatorException");
            } catch (Exception e) {
                e.printStackTrace();
            }


                    try { switch (params[1]) {case "-":operation = a - b;break;}
                       // throw  new CalculatorException("CalculatorException");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }




            try { switch (params[1]) {case "*":operation = a * b;break;}
               // throw new CalculatorException("CalculatorException");
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {switch (params[1]) {case "/":operation = a / b;break;}
             //   throw new CalculatorException("CalculatorException");
            } catch (Exception e) {
                e.printStackTrace();
            }





        return String.valueOf(operation);
        }
    public static String getInt(String num){
        System.out.println("1 ЧИСЛО ");
        if (in.hasNextLine()){
            num = in.nextLine();
        }else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия
            num = getInt(num);
        }
        return num;
    }
    public static String getOperation(String operation){
        System.out.println("Введите операцию:");
        if(in.hasNextLine()){
            operation = in.nextLine();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            in.next();//рекурсия
            operation = getOperation(operation);
        }
        return operation;

    }
    }