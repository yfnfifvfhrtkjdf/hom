package food;

public class Grass extends Food {

   // public int getEnergy(int energy) {
  //      System.out.println("Энергия мяса: "+energy);
  //      return energy;
  //  }

    @Override
    public int getEnergy() {
        return 0;
    }

    @Override
    public void meat() {
        getEnergy();
    }
}
