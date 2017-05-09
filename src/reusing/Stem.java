package reusing;

/**
 * Created by kscsq on 04.05.2017.
 */
public class Stem extends Root{
    public Component1 c1 = new Component1();
    public Component2 c2 = new Component2();
    public Component3 c3 = new Component3();

    public Stem(){
        System.out.println("Stem constructor");
    }

    public static void main(String[] args) {
        Stem st = new Stem();
    }
}
