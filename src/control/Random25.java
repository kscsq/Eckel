package control;

/**
 * Created by kscsq on 24.04.2017.
 */
public class Random25 {
    public static void main(String[] args) {
        int y = (int) (Math.random()*100);
        int k;
        for (int i = 0; ; i++){
            k = (int) (Math.random()*100);
            if (k < y)
                System.out.println(k + " < " + y);
            else if (k > y)
                System.out.println(k + " > " + y);
            else System.out.println(k + " = " + y);
        }

    }
}
