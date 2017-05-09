package control;

/**
 * Created by kscsq on 26.04.2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int f = Integer.parseInt(args[0]);
        int first;
        int second = 1;
        int y = 1;
        System.out.print(second + " ");
        for (int i = 1; i < f; i++){
            System.out.print(y + " ");
            first = second;
            second = y;
            y = second + first;
        }
    }
}
