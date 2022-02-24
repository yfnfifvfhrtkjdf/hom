package food;

public class Meat extends  Food{

   // public int getEnergy(int energy) {
   //     System.out.println("Энергия травки: "+ energy);
   //     return energy;
   // }

    @Override
    public int getEnergy() {
        return 10;
    }

    @Override
    public void meat() {
        getEnergy();
    }
}