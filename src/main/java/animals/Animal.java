package animals;
import food.Food;
import food.WrongFoodException;
import model.Size;

public abstract class Animal implements Voice, Swim {
    int satiety;

    private String name;

    public  String getName(){return name;}

    public Animal (String name){this.name=name;}

    public abstract Size getSize();

    public int getSatiety() {
        //  satiety++;
        //  return satiety;
        return 0;
    }
    abstract public int eat(Food food)throws WrongFoodException;


}