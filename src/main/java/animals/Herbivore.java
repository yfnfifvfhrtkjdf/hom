package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {


    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            satiety++;
            satiety= food.getEnergy();
            System.out.println(" Поел травки " +" Сытоть: "+satiety);
        }else {
            satiety--;
            System.out.println("травоядные не едят мясо");
            System.out.println("Сытоть:"+satiety);
        }
    }


    public void getVoice(String voice) {
        getVoice(voice);
        System.out.println("Животное говорит ");
    }

    @Override
    public void swim() {
        System.out.println("Животное плывет");
    }
}
