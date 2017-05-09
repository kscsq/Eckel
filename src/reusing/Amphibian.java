package reusing;

/**
 * Created by kscsq on 05.05.2017.
 */
public class Amphibian {
    public void walk(){
        System.out.println("Walking...");
    }
    public void swim(){
        System.out.println("Swimming...");
    }
}

class Frog extends Amphibian{
    public void swim(){
        System.out.println("Frog is swimming...");
    }
    public void walk(){
        System.out.println("Frog is walking...");
    }
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.swim();
        frog.walk();
    }
}
