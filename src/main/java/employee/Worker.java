package employee;
import animals.*;
import food.Food;


public class Worker {
    public void feed(Animal animal, Food food) throws Exception {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        System.out.println(animal.getVoice());
    }
}
