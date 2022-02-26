package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {super(name);}



    public String getVoice() {
        java.lang.String a = "Животное говорит ";
        getVoice();
       // return;
        //   System.out.println(voice);
        return a;
    }

    @Override
    public int eat(Food food) throws WrongFoodException {
        if(food instanceof Meat){
            return 0;
        }
        else{
            throw new WrongFoodException("WrongFoodException");
        }
    }
    @Override
    public void swim() {
        System.out.println("Я плывуууу");
        swim();
    }
}