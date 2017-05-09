package reusing;

/**
 * Created by kscsq on 04.05.2017.
 */
public class Sterilizer extends Detergent {
    private String s = "Sterilizer";
    public void scrub(){
        append(" Sterilizer.scrub()");
    }
    public void sterilize(){
        append(" sterilize()");
    }
    public String toString(){
        return s;
    }
    public void append(String a){
        s += a;
    }

    public static void main(String[] args) {
        Sterilizer st = new Sterilizer();
        st.dilute();
        st.apply();
        st.scrub();
        st.sterilize();
        System.out.println(st);
    }
}
