package control;

/**
 * Created by kscsq on 24.04.2017.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            for (int y = 1; y <= i; y++) {
                if (i % y == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i + " ");
            count = 0;
        }
    }
}
