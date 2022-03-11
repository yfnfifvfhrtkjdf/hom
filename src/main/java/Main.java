import model.Calculator;
import java.util.Scanner;
import static model.Calculator.execute;

public class Main  {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner in = new Scanner(System.in);
    String line2 = in.nextLine();
    String line = in.nextLine();
    String line3 = in.nextLine();
    System.out.println(execute(new String[]{line2, line,line3 }));

}
}




