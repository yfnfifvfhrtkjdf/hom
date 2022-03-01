package animals;

import food.Food;
import food.Grass;
import food.Meat;
import food.WrongFoodException;
import model.Size;

import static model.Size.SMALL;

public class Duck extends Herbivore implements Voice, Run, Swim, Fly {

    private int satiety;

    public Duck(String name) {super(name);}

    public Size getSize() {return SMALL;}

    @Override
    public void run() {
        System.out.println("Duck run");
    }
    public String getVoice() {return "КРЯ";}

    @Override
    public void swim() {System.out.println("Duck swim");}

    @Override
    public void fly() {System.out.println("Duck fly");}

    @Override
    public int eat(Food food) throws WrongFoodException{
        try{
            if (food instanceof Meat){
             //   System.out.println("Травоядные не едят мясо");
                throw new WrongFoodException("WrongFoodException");
            }
            else if (food instanceof Grass){
                satiety = food.getEnergy();
                System.out.format("Уточка поела - %d \n", satiety);
           //     System.out.println("Уточка поела" + satiety);
            }}
        catch (WrongFoodException e) {
         //  System.out.println(e.toString());;
          //  System.out.println(e);
          //  e.printStackTrace();
          //  e.getMessage();
            throw e;
        }
        return satiety;
    }
}
   // @Override
   // public int getSatiety() {
   //     return super.getSatiety();
   // }








