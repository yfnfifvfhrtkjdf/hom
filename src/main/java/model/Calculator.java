package model;

import org.testng.reporters.jq.Main;

public class Calculator  {


    public static String execute(String[]params) throws NumberFormatException {
    int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[2]);
        int operation = 0;
        switch (params[1]){
            case "+": operation = a+b; break;
            case "-": operation = a-b; break;
            case "*": operation = a*b; break;
        }
        return String.valueOf(operation);
        //  return AssertionError.toString();
    }




}
