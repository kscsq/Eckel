//: polymorphism/shape/Circle.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Circle extends Shape {
  @Override
  public void draw() { print("Circle.draw()"); }
  public void erase() { print("Circle.erase()"); }
  public void message(){
    System.out.println("Circle.Message!");
  }
} ///:~
