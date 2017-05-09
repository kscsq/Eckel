package polymorphism;

/**
 * Created by kscsq on 09.05.2017.
 */
public class Baseclass {
    public void firstMethod(){
        secondMethod();
    }
    public void secondMethod(){
        System.out.println("Second method Base class.");
    }
}
