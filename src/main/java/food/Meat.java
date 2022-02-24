package food;

public class Meat extends  Food{
    @Override
    public int getEnergy(int energy) {
        System.out.println("Энергия травки: "+ energy);
        return energy;
    }

    @Override
    public void meat() {
        getEnergy(5);
    }
}