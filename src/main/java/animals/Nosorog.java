package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

import static model.Size.LARGE;
import static model.Size.SMALL;

public class Nosorog extends Herbivore implements Voice, Run {
    private int satiety;
    public Nosorog(String name) {
        super(name);
    }

    public Size getSize() {return LARGE;}

    public String getVoice() {return "*НЕСРАВНИМЫЙ КРИК НОСОРОГА*";}

    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void run() {
        int speed = 25;
        String k = "Километров в час";
        System.out.println("Носорог бегает со скоростью " + speed + k);
    }

    @Override
    public void swim() {    }

    @Override
    public int eat(Food food) {
        try{
            if (food instanceof Meat){
                throw new WrongFoodException("WrongFoodException");
            }
            else if (food instanceof Grass){
                satiety = food.getEnergy();
                System.out.format("Животное сыто, сытость - %d \n", satiety);
            }}
        catch (WrongFoodException e) {
            e.printStackTrace();
        }
        return satiety;
    }


}

