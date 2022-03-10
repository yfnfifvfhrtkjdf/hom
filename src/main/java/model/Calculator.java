package model;
import java.io.UncheckedIOException;
import java.util.Locale;

public class Calculator {

    public static String execute(String[] params) {

        int in = 0;
        double dou = 0.0;
        String res = "";


        switch(params[0]) {
            case "+":
                try {
                    if (params[1].equals(String.valueOf(Integer.MAX_VALUE)) || params[2].equals(String.valueOf(Integer.MAX_VALUE)) ||
                            params[1].equals(String.valueOf(Integer.MIN_VALUE)) || params[2].equals(Integer.MIN_VALUE)) {
                        throw new CalculatorException();
                    }
                    int one = Integer.parseInt(params[1]);
                    int two = Integer.parseInt(params[2]);
                    in = one + two;
                    res = Integer.toString(in);
                    break;
                }catch (Exception e) {
                    try {
                        throw new CalculatorException();
                    } catch (CalculatorException ex) {
                        ex.printStackTrace();
                    }
                }

            case "-":
                try {
                    double a1 = Double.parseDouble(params[1]);
                    double b1 = Double.parseDouble(params[2]);
                    dou = a1 - b1;
                    res = Double.toString(dou);
                    break;
                }catch (Exception e) {
                    try {
                        throw new CalculatorException();
                    } catch (CalculatorException ex) {
                        ex.printStackTrace();
                    }
                }

            case "*":
                try {
                    double a2 = Double.parseDouble(params[1]);
                    double b2 = Double.parseDouble(params[2]);
                    dou = a2 * b2;
                    res = Double.toString(dou);
                    break;
                }
                catch (Exception e) {
                    try {
                        throw new CalculatorException();
                    } catch (CalculatorException ex) {
                        ex.printStackTrace();
                    }
                }

            case "/":
                if (params[2].equals("0") || (params[2]).equals("0.0") || params[2].equals("-0.0")) {
                    try {
                        throw new CalculatorException();
                    } catch (CalculatorException e) {
                        e.printStackTrace();
                    }
                }
            try{
                double a3 = Double.parseDouble(params[1]);
                double b3 = Double.parseDouble(params[2]);
                dou = a3 / b3;
                res = String.format(Locale.ROOT, "%.3f", dou);
                break;
            }
            catch (Exception e) {
                try {
                    throw new CalculatorException();
                } catch (CalculatorException ex) {
                    ex.printStackTrace();
                }
            }
            default:
                try {
                    throw new CalculatorException();
                } catch (CalculatorException e) {
                    e.printStackTrace();
                }
        }
        return res;
    }
}



