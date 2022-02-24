package animals;

import food.Food;

public class Kotik extends Carnivorous implements Voice, Run {

    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void run() {
        int speed = 25;
        String k = "Километров в час";
        System.out.println("Котик бежит со скоростью " +speed + k);
    }

    public void getVoice(Voice voice) {
        System.out.println("MEOW");
    }

    @Override
    public boolean eat(Food food) {
        return super.eat(food);
    }
}