package polymorphism;

/**
 * Created by kscsq on 09.05.2017.
 */
public class Inheritedclass extends Baseclass {
    @Override
    public void secondMethod() {
        System.out.println("Second method Inherited class!");
    }

    public static void main(String[] args) {
        Baseclass bc = new Inheritedclass();
        bc.firstMethod();
    }
}
