package animals;
import food.Food;
import java.util.*;

public class Kotik extends Carnivorous implements Voice, Run {

    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void run() {
        int speed = 25;
        String k = "Километров в час";
        System.out.println("Котик бежит со скоростью " +speed + k);
    }

    public String getVoice() {
       String voice = "MEOW";
        System.out.println(voice);
       // System.out.println("MEOW");
        return Voice.a;
    }



}
