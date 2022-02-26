package animals;
import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

import java.util.*;

import static model.Size.SMALL;

public class Kotik extends Carnivorous implements Voice, Run {
    private String name;
    public Kotik(String name) {super(name);}

    public Size getSize() {return  SMALL;}

    @Override
    public int getSatiety() {
        return satiety;
    }

    public String getVoice() {return "MEOW";}

    @Override
    public void run() {
        int speed = 25;
        String k = "Километров в час";
        System.out.println("Котик бежит со скоростью " +speed + k);
    }
   /* @Override
    public int eat(Food food) {
        try {
            if (food instanceof Meat){
                satiety = food.getEnergy();
                System.out.format("Котик сыт - %d \n", satiety);
              //  System.out.println("Котик сыт"+ satiety);
            }
            else if (food instanceof Grass){
              //  System.out.println("Хищники травку не едят");
                throw new WrongFoodException("WrongFoodException");}
        }
        catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return satiety;
    }

*/


}
