package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {super(name);}

    @Override
    public int eat(Food food) throws WrongFoodException {
        try {
        if(food instanceof Grass){
            System.out.println("Еда подходит для травоядного");
            return 0;
        }
        else{
            throw new WrongFoodException("WrongFoodException");
        }}
         catch (WrongFoodException e) {
        e.printStackTrace();
        System.out.println(e.toString());

    }return 0;
    }

   // @Override
   // public int eat(Food food) throws WrongFoodException {
   //     if (food instanceof Grass){
  //          satiety++;
   //         satiety= food.getEnergy();
   //         System.out.println(" Поел травки " +" Сытоть: "+satiety);
   //         return 0;
   //     }else {
   //         satiety--;
   //         System.out.println("травоядные не едят мясо");
   //         System.out.println("Сытоть:"+satiety);
    //        throw new WrongFoodException("WrongFoodException");
    //    }


  //  public String getVoice(String voice) {
  //      java.lang.String a = "Животное говорит ";
  //      getVoice(voice);
  //      System.out.println(Voice.a);
   //   //  System.out.println("Животное говорит ");
    //    return voice;
    }

  //  @Override
  //  public void swim() {
  //      System.out.println("Животное плывет");
  //  }

