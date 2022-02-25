package employee;
import animals.*;
import food.Food;


public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    // (вывести на экран то, что говорит конкретное животное).
//У метода должен быть один параметр –животное, которое издает звук.
// Метод должен принимать в качестве аргумента
// только тех животных, которые могут издавать звуки.
    public String getVoice(Voice voice) {
        voice.getVoice();
        System.out.println(Voice.a);
        return Voice.a;

    }
}