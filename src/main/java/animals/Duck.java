package animals;

import food.Food;

public class Duck extends Herbivore implements Voice, Run, Swim, Fly {
    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void run() {
        System.out.println("Duck run");
    }


    public void getVoice() {
        // voice="КРЯ";
        System.out.println("КРЯ");

    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }

    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

}