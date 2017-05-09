package polymorphism.rodents;

/**
 * Created by kscsq on 09.05.2017.
 */
public class Mouse extends Rodent{
    @Override
    public String toString() {
        return "Mouse{}";
    }

    @Override
    public int size() {
        return 1;
    }
}
