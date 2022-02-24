package animals;

public class Dog extends Carnivorous implements Voice, Run {
    @Override
    public int getSatiety() {
        return super.getSatiety();
    }

    @Override
    public void run() {
        int speed;
        int dist;


    }

   // public void getVoice(Voice voice) {
     //   //  voice ="WOOOOOOW";
       //    }

    @Override
    public void getVoice() {
        System.out.println("Я головорю WOOOOOOW");
    }
}
