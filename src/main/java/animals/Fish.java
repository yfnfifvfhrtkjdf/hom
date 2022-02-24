package animals;

import food.Food;

public class Fish extends Carnivorous implements Swim {
    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void swim() {
        System.out.println("Fish swim");
    }

    @Override
    public boolean eat(Food food) {
        return super.eat(food);
    }

}