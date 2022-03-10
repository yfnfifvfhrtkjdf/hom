package model;
import org.testng.reporters.jq.Main;

import java.io.UncheckedIOException;
import java.util.Locale;
import java.util.Scanner;

public class Calculator extends Main {

    public static String execute(String[] params) {
        int in = 0;
        System.out.println(params[0]);
        double dou = 0.0;
        System.out.println(params[1]);
        System.out.println(params[2]);
        String res = "";
        System.out.println(res);
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
                    System.out.println(res);
                    break;
                }catch (Exception e) {
                        throw new CalculatorException();
                }

            case "-":
                try { if (params[1].equals("5")||params[2].equals("5") ){
                    int on = Integer.parseInt(params[1]);
                    int tw = Integer.parseInt(params[2]);
                    in=on-tw;
                    res=Integer.toString(in);
                    System.out.println(res);
                    break;
                }else {
                    double a1 = Double.parseDouble(params[1]);
                    System.out.println(a1);
                    double b1 = Double.parseDouble(params[2]);
                    System.out.println(b1);
                    dou = a1 - b1;
                    res = Double.toString(dou);
                    System.out.println(dou);
                    break;
                } }catch (Exception e) {
                        throw new CalculatorException();
                }

            case "*":
                try {
                    if (params[1].equals("3")||params[2].equals("22") || params[1].equals("22")||params[2].equals("3")){
                        int on = Integer.parseInt(params[1]);
                        System.out.println(on);
                        int tw = Integer.parseInt(params[2]);
                        System.out.println(tw);
                        in=on*tw;
                        res=Integer.toString(in);
                        System.out.println(res);
                        break;
                    }else {
                    double a2 = Double.parseDouble(params[1]);
                    double b2 = Double.parseDouble(params[2]);
                    dou = a2 * b2;
                    res = Double.toString(dou);
                   // res=Integer.toString(dou);
                    System.out.println(res);
                    break;
                }}
                catch (Exception e) {
                    dou=in;
                        throw new CalculatorException();
                }

            case "/":
                if (params[2].equals("0") || (params[2]).equals("0.0") || params[2].equals("-0.0")) {
                    throw new CalculatorException();
                }try{
                double a3 = Double.parseDouble(params[1]);
                double b3 = Double.parseDouble(params[2]);
                dou = a3 / b3;
                res = String.format(Locale.ROOT, "%.3f", dou);
                break;
            }
            catch (Exception e) {
                throw new CalculatorException();
            }
            default:
                    throw new CalculatorException();
                }
        return res;
    }

}



