//: polymorphism/shape/Square.java
package polymorphism.shape;
import static net.mindview.util.Print.*;

public class Square extends Shape {
  @Override
  public void draw() { print("Square.draw()"); }
  public void erase() { print("Square.erase()"); }
  public void message(){
    System.out.println("Square.Message!");
  }
} ///:~
