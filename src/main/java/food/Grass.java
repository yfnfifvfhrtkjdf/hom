package food;

public class Grass extends Food {
    @Override
    public int getEnergy(int energy) {
        System.out.println("Энергия мяса: "+energy);
        return super.getEnergy(energy);
    }

    @Override
    public boolean meat() {
        getEnergy(10);
        return false;
    }
}
