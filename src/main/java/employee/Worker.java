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
    public void getVoice(Voice voice) {
        voice.getVoice(Voice.a);

    }
}