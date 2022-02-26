package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {super(name);}

    @Override
    public int eat(Food food) throws WrongFoodException {
        try{
        if (food instanceof Meat) {
            System.out.println("еда подходит");
        } else {
            throw  new WrongFoodException ("WrongFoodException");
        }}
        catch (WrongFoodException e) {
            throw  new WrongFoodException ("WrongFoodException");
        }
return eat(food);
    }


    public String getVoice() {
        java.lang.String a = "Животное говорит ";
        getVoice();
       // return;
        //   System.out.println(voice);
        return a;
    }

    @Override
    public void swim() {
        System.out.println("Я плывуууу");
        swim();
    }
}