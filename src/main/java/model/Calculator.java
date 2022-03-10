package model;


import org.testng.reporters.jq.Main;

public class Calculator extends Main {


    public static String execute(String[] params) {

       Double a = Double.parseDouble(params[0]);

        System.out.println(a);
        Double b = Double.parseDouble(params[2]);
        System.out.println(b);
       double result=0;
        String operator = params[1];

        switch (params[1]) {
            case ("+"):result = a + b;
                return String.valueOf(result);
        }
        switch (params[1]) {case ("-"):
                result = a - b;
                return String.valueOf(result);
        }

        switch (params[1]) {case ("*"):
                result = a * b;
                return String.valueOf(result);
        }

        switch (params[1]) {case ("/"):
                result = a / b;
                return String.valueOf(result);
        }
        return String.valueOf(result);
    }
}




  /*  public static String getInt(String num){
        Scanner in = new Scanner(System.in);
        num = in.nextLine();
        System.out.println("ЧИСЛО ");
        //num=in.nextLine();
        if (in.hasNextLine()){
            num = in.nextLine();
        }else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия
            num = getInt(num);
        }
        return num;
    }

    public static String getOperation(String operation) {
        System.out.println("Введите операцию:");
        if (in.hasNextLine()) {
            operation = in.nextLine();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            in.next();//рекурсия
            operation = getOperation(operation);
        }
        return operation;
  */

/*



                    try { switch (params[1]) {case "-":result = a - b;break;}
                       // throw  new CalculatorException("CalculatorException");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }




            try { switch (params[1]) {case "*":
                result = a * b;break;}
               // throw new CalculatorException("CalculatorException");
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {switch (params[1]) {case "/":
                result = a / b;break;}
             //   throw new CalculatorException("CalculatorException");
            } catch (Exception e) {
                e.printStackTrace();
            }





        return String.valueOf(result);
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


   */
