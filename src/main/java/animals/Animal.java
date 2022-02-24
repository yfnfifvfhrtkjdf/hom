package animals;

import food.Food;


public abstract class Animal implements Voice, Swim {
    int satiety;


    public int getSatiety() {
        satiety++;
        return satiety;
    }

    abstract public void eat(Food food);

}