package reusing;

/**
 * Created by kscsq on 04.05.2017.
 */
public class C extends A {
    public B bbb;

    public C(int i) {
        super(i);

    }

    public static void main(String[] args) {
        C c = new C(5);
    }
}
