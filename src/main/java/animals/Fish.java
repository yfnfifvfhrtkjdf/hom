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
                satiety = food.getEnergy();
                System.out.format("Рыбка поела - %d \n", satiety);
        //        System.out.println("Рыбка поела" + satiety );
            }
            else if (food instanceof Grass){
            //    System.out.println("Хищники травку не едят");
                throw new WrongFoodException("WrongFoodException");
            }}
        catch (WrongFoodException e) {
            e.printStackTrace();
            System.out.println(e.toString());;
            e.getMessage();
        }
        return satiety;
    }

}
