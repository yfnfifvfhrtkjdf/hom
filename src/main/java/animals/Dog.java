package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

import static model.Size.SMALL;

public class Dog extends Carnivorous implements Voice, Run {
    private int satiety;
    public Dog(String name) {super(name);}

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {System.out.println("RUUUUUUUN");}

    public Size getSize() {return SMALL;}

    @Override
    public String getVoice() {return "WOOOOOOW";}

    @Override
    public int eat(Food food) {
        try{
           if (food instanceof Meat){
                satiety = food.getEnergy();
                System.out.format("Собачка поела - %d \n", satiety);
         //       System.out.println("Собачка поела" + satiety);
            }
            else if (food instanceof Grass){
         //       System.out.println("Хищники травку не едят");
                throw new WrongFoodException("WrongFoodException");
            }}
        catch (WrongFoodException e) {
            e.printStackTrace();
       //     System.out.println(e.toString());;

       }return satiety;
    }


}
