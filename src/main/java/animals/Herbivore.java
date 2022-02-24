package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animal {


    @Override
    public boolean eat(Food food) {
        if (food instanceof Grass){
            satiety= food.getEnergy(5);
            System.out.println(" Поел травки " +" Сытоть: "+satiety);
            return !food.meat();
        }else {
            satiety--;
            System.out.println("травоядные не едят мясо");
            System.out.println("Сытоть:"+satiety);
        }
        return !food.meat();
    }


    @Override
    public void getVoice(Voice voice) {
        voice.getVoice(voice);
        System.out.println("Животное говорит ");
    }

    @Override
    public void swim() {
        System.out.println("Животное плывет");
    }
}
