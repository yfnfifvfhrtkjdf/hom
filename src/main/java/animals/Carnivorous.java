package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Поел мясо");
            satiety = food.getEnergy(10);
            System.out.println("Сытость " + satiety);
        } else {
            System.out.println("хищники не едят траву");
            satiety--;
            System.out.println("Сытость " + satiety);
        }

    }

    //  @Override
    public void getVoice(Voice voice) {
        voice.getVoice(voice);
        //   System.out.println(voice);

    }

    @Override
    public void swim() {
        System.out.println("Я плывуууу");
        swim();
    }

    //  @Override
    //  public void swim(List<Swim> pond) {
    //      swim(createPond());
    //  }
}