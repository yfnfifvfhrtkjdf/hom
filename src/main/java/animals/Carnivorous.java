package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {

    @Override
    public boolean eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Поел мясо");
            satiety = food.getEnergy(10);
            System.out.println("Сытость " + satiety);
            return food.meat();
        } else {
            System.out.println("хищники не едят траву");
            satiety--;
            System.out.println("Сытость " + satiety);
        }
        return food.meat();
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
