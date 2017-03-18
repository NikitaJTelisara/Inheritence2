/* This class must be either declared as abstract or implement the abstract method Play */
public class ElectricGuitar extends Instrument {
    public ElectricGuitar(String name){
        super();
        this.name = name;
    }

    public void play(){
        System.out.println("Play");
    }

    public void play2(){
        System.out.println("Play2");
    }


}
