package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {


    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            satiety= food.getEnergy(5);
            System.out.println(" Поел травки " +" Сытоть: "+satiety);
        }else {
            satiety--;
            System.out.println("травоядные не едят мясо");
            System.out.println("Сытоть:"+satiety);
        }
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
