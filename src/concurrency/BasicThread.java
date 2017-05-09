package concurrency;

/**
 * Created by kscsq on 28.01.2017.
 */
public class BasicThread {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
