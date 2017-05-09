//: polymorphism/shape/Triangle.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Triangle extends Shape {
  @Override
  public void draw() { print("Triangle.draw()"); }
  public void message(){
    System.out.println("Triangle.Message!");
  }
  public void erase() { print("Triangle.erase()"); }
} ///:~
