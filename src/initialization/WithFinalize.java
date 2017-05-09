package initialization;

/**
 * Created by kscsq on 27.04.2017.
 */
public class WithFinalize {
    public void finalize(){
        System.out.println("Finalized!");
    }

    public static void main(String[] args) {
        new WithFinalize();
//        wf.finalize();
        System.gc();
    }
}
