package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

import static model.Size.MEDIUM;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name) {
        super(name);
    }

    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void swim() {
        System.out.println("Fish swim");
    }

    public Size getSize() {return MEDIUM;}
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
