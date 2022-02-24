package animals;

import food.Food;

public class Nosorog extends Herbivore implements Voice, Run {

    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void run() {
        int speed = 25;
        String k = "Километров в час";
        System.out.println("Носорог бегает со скоростью " + speed + k);
    }


    public void getVoice(Voice voice) {
        //   voice="*НЕСРАВНИМЫЙ КРИК НОСОРОГА*";
        System.out.println("*НЕСРАВНИМЫЙ КРИК НОСОРОГА*");
    }
}

