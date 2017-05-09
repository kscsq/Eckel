package polymorphism;

/**
 * Created by kscsq on 08.05.2017.
 */
public class Ride {
    public static void ride(Cycle c){
        System.out.println("Ride, baby, ride!");
        System.out.println(c.wheels());
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(b);
        ride(t);
    }
}
