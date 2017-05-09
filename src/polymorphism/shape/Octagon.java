package polymorphism.shape;

import static net.mindview.util.Print.print;

/**
 * Created by kscsq on 08.05.2017.
 */
public class Octagon extends Shape {
    public void draw() { print("Octagon.draw()"); }
    public void erase() { print("Octagon.erase()"); }
    public void message(){
        System.out.println("Octagon.Message!");
    }
}
