package operators;//: operators/PassObject.java
// Passing objects to methods may not be
// what you're used to.

class Letter {
  float c;
}

public class PassObject {
  static void f(Letter y) {
    y.c = 1.222f;
  }
  public static void main(String[] args) {
    Letter x = new Letter();
    x.c = 3.555f;
    System.out.println("1: x.c: " + x.c);
    f(x);
    System.out.println("2: x.c: " + x.c);
  }
} /* Output:
1: x.c: a
2: x.c: z
*///:~
