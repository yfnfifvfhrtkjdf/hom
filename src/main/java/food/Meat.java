package food;

public class Meat extends  Food{
    @Override
    public int getEnergy(int energy) {
        System.out.println("Энергия травки: "+ energy);
        return super.getEnergy(energy);
    }

    @Override
    public boolean meat() {
        getEnergy(5);
        return true;
    }
}