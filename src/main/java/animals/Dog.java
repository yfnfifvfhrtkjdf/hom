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
                throw new WrongFoodException("WrongFoodException");
            }
            else if (food instanceof Grass){
                satiety = food.getEnergy();
                System.out.format("Животное сыто, уровень сытости - %d \n", satiety);
            }}
        catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return satiety;
    }
}
