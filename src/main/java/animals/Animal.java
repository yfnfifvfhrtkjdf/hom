package animals;

import food.Food;


public abstract class Animal implements Voice, Swim {
    int satiety=0;

    public int getSatiety() {
        return satiety;
    }

    abstract public void eat(Food food);

}