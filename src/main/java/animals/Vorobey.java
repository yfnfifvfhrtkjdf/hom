package animals;

import food.Food;

public class Vorobey extends Herbivore implements Voice, Fly {
    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void fly() {
        int sp = 25;
        String kt = "Километров в час";
        System.out.println("Птичка летит со скоростью " + sp + kt);
    }



    public void getVoice() {
        // voice = "Чик чирик";
        System.out.println("Чик чирик");
    }

}
