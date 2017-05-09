package polymorphism.rodents;

/**
 * Created by kscsq on 09.05.2017.
 */
public class Rodent {
    @Override
    public String toString() {
        return "Rodent{}";
    }
    public int size(){
        return Integer.parseInt(null);
    }

    public static void main(String[] args) {
        Rodent[] rod = new Rodent[10];
        RodentGenerator rg = new RodentGenerator();
        for (int i = 0; i < rod.length; i++)
            rod[i] = rg.next();
        for(Rodent rrr : rod)
            System.out.println(rrr.size());
    }
}
