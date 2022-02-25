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


    public String getVoice(String voice) {
        java.lang.String a = "Животное говорит ";
        getVoice(voice);
        System.out.println(Voice.a);
      //  System.out.println("Животное говорит ");
        return voice;
    }

    @Override
    public void swim() {
        System.out.println("Животное плывет");
    }
}
