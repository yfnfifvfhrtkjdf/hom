package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

import static model.Size.SMALL;

public class Vorobey extends Herbivore implements Voice, Fly {
    private int satiety;
    public Vorobey(String name) {super(name);}

    @Override
    public Size getSize() {return SMALL;}

    @Override
    public int getSatiety() {return satiety;}

    @Override
    public void fly() {
        int sp = 25;
        String kt = "Километров в час";
        System.out.println("Птичка летит со скоростью " + sp + kt);
    }

    public String getVoice() {return "Чик чирик";}

    @Override
    public int eat(Food food) {
        try{
            if (food instanceof Meat){
            //    System.out.println("Травоядные не едят мясо");
                throw new WrongFoodException("WrongFoodException");
            }
            else if (food instanceof Grass){
                satiety = food.getEnergy();
                System.out.format("Воробушек сыт - %d \n", satiety);
           //     System.out.println("Воробушек сыт" + satiety);
            }}
        catch (WrongFoodException e) {
           // System.out.println(e.toString());;
            e.printStackTrace();
        }
        return satiety;
    }

    @Override
    public void swim() {
        System.out.println("SWIIIIM");
    }
}
