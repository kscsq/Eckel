package polymorphism.rodents;

/**
 * Created by kscsq on 09.05.2017.
 */
public class Hamster extends Rodent {
    @Override
    public int size() {
        return 2;
    }

    @Override
    public String toString() {
        return "Hamster{}";
    }
}
