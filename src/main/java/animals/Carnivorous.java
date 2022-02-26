package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {super(name);}


    public String getVoice() {
        java.lang.String a = "Животное говорит ";
        getVoice();
        return a;
    }

   // @Override
   // public int eat(Food food) throws WrongFoodException {
   //     try {
    //    if(food instanceof Meat){
    //        System.out.println("Еда подходит для хищника");
    //        return 0;
    //    }
     //   else{
     //       throw new WrongFoodException("WrongFoodException");
     //   }
     //   }
    //     catch (WrongFoodException e) {
     //       e.printStackTrace();
     //        System.out.println(e.getMessage());
     //       System.out.println(e.toString());
      //  }return 0;
  //  }
    @Override
    public void swim() {
        System.out.println("Я плывуууу");
        swim();
    }
    @Override
    public int eat(Food food) throws WrongFoodException {
        Meat meat = new Meat();
        try {
           food.equals(meat);
            throw new WrongFoodException("WrongFoodException");
        }catch (WrongFoodException e){
            System.out.println(e.toString());
            e.printStackTrace();
        }

       // if(food instanceof Meat){
            return food.getEnergy();
    //    }
      //  else{
      //      throw new WrongFoodException("WrongFoodException");
        }
    }


//}