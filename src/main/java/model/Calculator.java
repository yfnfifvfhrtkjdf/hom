package model;
import static java.lang.Integer.parseInt;

public class Calculator {
  //  static Scanner scanner = new Scanner(System.in);
    public static String execute(String[]params)  {
        int a = parseInt(params[0]);
        int b = parseInt(params[2]);
        int operation = 0;
            try {
                switch (params[1]) {
                    case "+":
                        operation = a + b;
                       break;
                      // throw new CalculatorException("CalculatorException");
                }
            }catch (Exception e){
                e.printStackTrace();
               // throw new CalculatorException("CalculatorException");

            }
            try {
                switch (params[1]) {
                    case "-":
                        operation = a - b;
                       break;
                       // throw new CalculatorException("CalculatorException");
                }
            }catch (Exception e){
              //  throw new CalculatorException("CalculatorException");
                e.printStackTrace();
            }
            try {
                switch (params[1]) {
                    case "*":
                        operation = a * b;
break;
                }
            }catch (Exception e){
               // throw new CalculatorException("CalculatorException");
e.printStackTrace();
            }
            try {
                switch (params[1]) {
                    case "/":
                        operation = a / b;
break;
                }
            }catch (Exception e){
              //  throw new CalculatorException("CalculatorException");
                e.printStackTrace();
            }

        return String.valueOf(operation);
        }

    }

   /* static Scanner scanner = new Scanner(System.in);
    public static String execute (String[] params) {
        int a = parseInt(params[0]);
        int b = parseInt(params[2]);
        int operation = 0;
        int result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
               throw new CalculatorException ("CalculatorException");
        }
        return String.valueOf(operation);
    }
*/
  /*  public static int getInt(){
        System.out.println("Введите число:");
        int a;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            a = getInt();
        }
        return a;
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
}

    public static String[] execute(String[]params)  {

    int a = parseInt(params[0]);
        int b = parseInt(params[2]);
        int operation = 0;
        switch (params[1]){
            case "+": operation = a+b; break;
            case "-": operation = a-b; break;
            case "*": operation = a*b; break;
 default:

        }
        return params;
       // return String.valueOf(operation);
        //  return AssertionError.toString();
    }




}
*/