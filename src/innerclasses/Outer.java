package innerclasses;

/**
 * Created by kscsq on 26.04.2017.
 */
public class Outer {
    class Inner{

    }
    public Inner getInstance(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer out = new Outer();
        Inner in = out.getInstance();
    }
}
