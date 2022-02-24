package food;

public class Grass extends Food {
    @Override
    public int getEnergy(int energy) {
        System.out.println("Энергия мяса: "+energy);
        return energy;
    }

    @Override
    public void meat() {
        getEnergy(10);
    }
}
