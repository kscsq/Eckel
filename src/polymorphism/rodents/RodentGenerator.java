package polymorphism.rodents;

import java.util.Random;

/**
 * Created by kscsq on 09.05.2017.
 */
public class RodentGenerator {
    Random rand = new Random(57);
    public Rodent next(){
        switch (rand.nextInt(3)){
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
        }
    }
}
