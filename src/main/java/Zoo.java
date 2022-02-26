import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;

public class Zoo {

        private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.LARGE);
        private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.MEDIUM);

    public static void fillCarnivorousAviary()  {
        Dog dog = new Dog("Cobaka");
        Fish fish = new Fish("Riba");
        Kotik kotik = new Kotik("Kot");
       // Duck duck=new Duck("Utka");
        carnivorousAviary.addAnimal(dog);
    }
    public static void fillHerbivoreAviary() {
        Duck duck=new Duck("Utka");
      //  Dog dog = new Dog("Cobaka");
        Nosorog nosorog = new Nosorog("Nosorogik");
        Vorobey vorobey = new Vorobey("Ptitsa");

        herbivoreAviary.addAnimal(nosorog);
    }
    public static Carnivorous getCarnivorous (String name){
        return carnivorousAviary.getAnimal(name);
    }
    public static Herbivore getHerbivore (String name){
        return herbivoreAviary.getAnimal(name);
    }

    //  public static Swim[] createPond(){
    //      Swim[] swims = new Swim[3];
    //      swims[0] = new Fish("Riba");
   //       swims[1]=new Dog("Cobaka");
    //      swims[2] = new Vorobey("Ptitsa");
    //      return swims;
   // }

    public static void main(String[] args) {
       // fillCarnivorousAviary();
      //  fillHerbivoreAviary();
      //  getCarnivorous("Riba");
      //  getHerbivore("Utka");

        Kotik kotik = new Kotik("Kot");
        Fish fish = new Fish("Riba");
        Dog dog = new Dog("Cobaka");
        Duck duck=new Duck("Utka");
        Nosorog nosorog = new Nosorog("Nosorogik");
        Vorobey vorobey = new Vorobey("Ptitsa");


        Grass grass = new Grass();
        Meat meat = new Meat();
        System.out.println("fish");
        fish.eat(meat);
        fish.eat(grass);
        System.out.println();
        System.out.println("dog");
        dog.eat(meat);
        dog.eat(grass);
        System.out.println();
        System.out.println("duck");
        duck.eat(meat);
        duck.eat(grass);
        System.out.println();
        System.out.println("nosorog");
        nosorog.eat(meat);
        nosorog.eat(grass);
        System.out.println();
        System.out.println("vorobey");
        vorobey.eat(meat);
        vorobey.eat(grass);
        System.out.println();
        System.out.println("kotik");
        kotik.eat(meat);
        kotik.eat(grass);




    }
}