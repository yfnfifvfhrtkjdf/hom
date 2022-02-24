package animals;

import food.Food;


public abstract class Animal implements Voice, Swim {
    int satiety;

    public int getSatiety() {
        return satiety;
    }

    abstract public boolean eat(Food food);

}
