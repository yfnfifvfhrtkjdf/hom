package model;


import java.math.BigDecimal;
import java.math.MathContext;


public class Calculator {

    public static String execute(String[] params) {
        try {
            double a = Double.parseDouble(params[0]);
            BigDecimal f1 = new BigDecimal(params[0]);
            double b = Double.parseDouble(params[2]);
            BigDecimal f2 = new BigDecimal(params[2]);
            double result = 0;
            BigDecimal f3 = new BigDecimal(result);
            MathContext mc = new MathContext(3);
            String operator = params[1];
            String exq = String.valueOf(new CalculatorException("CalculatorException"));
            try {
                switch (params[1]) {
                    case "+":
                        return f1.add(f2).toString();
                }
            } catch (Exception e) {
                try {
                    throw new CalculatorException("CalculatorException");
                } catch (CalculatorException ex) {
                    ex.printStackTrace();
                }
            }
            try {
                switch (params[1]) {
                    case ("-"):
                        return f1.subtract(f2).toString();
                }
            } catch (Exception e) {
                try {
                    throw new CalculatorException("CalculatorException");
                } catch (CalculatorException ex) {
                    ex.printStackTrace();
                }
            }
            try {
                switch (params[1]) {
                    case ("*"):
                        return f1.multiply(f2).toString();
                }
            } catch (Exception e) {
                try {
                    throw new CalculatorException("CalculatorException");
                } catch (CalculatorException ex) {
                    ex.printStackTrace();
                }
            }
            try {

                switch (params[1]) {
                    case ("/"):
                        return f1.divide(f2, mc).toString();
                }
            } catch (Exception e) {
                try {
                    throw new CalculatorException("CalculatorException");
                } catch (CalculatorException ex) {
                    ex.printStackTrace();
                }
            }
            return String.valueOf(exq);

        } catch (Exception e){
            try {
                throw new  CalculatorException("CalculatorException");
            } catch (CalculatorException ex) {
                ex.printStackTrace();
            }
        }return null;
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
