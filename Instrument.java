public abstract class Instrument {
    String name;
    public abstract void play();     //if its abstract no need to give the implemetation
    public void play1(){      // need to give the implemntation as this is not abstract
       System.out.println("play1");
    }
}
