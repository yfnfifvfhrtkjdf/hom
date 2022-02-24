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
        //

  //  }

    @Override
    public void getVoice(String voice) {
        voice ="WOOOOOOW";
     //   System.out.println("Я головорю WOOOOOOW");
        System.out.println(voice);
    }
}
