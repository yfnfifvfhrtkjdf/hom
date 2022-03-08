import model.Calculator;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operation=in.nextLine();
       // System.out.println(operation);

        String line=in.nextLine();
      //  System.out.println(line);

        String line1=in.nextLine();
       // System.out.println(line1);
        Calculator.execute(new String[]{line,operation, line1});
       // System.out.println("Результат операции: "+ Calculator.execute(new String[]{line,operation, line1}));
    }

}
