package initialization;

public class InitialValues {
  boolean bool = true;
  char ch = 'x';
  byte b = 47;
  short s = 0xff;
  int i = 999;
  long lng = 1;
  float f = 3.14f;
  double d = 3.14159;
  InitialValues reference;
  void printInitialValues() {
    System.out.println("Data type      Initial value");
    System.out.println("boolean        " + bool);
    System.out.println("char           [" + ch + "]");
    System.out.println("byte           " + b);
    System.out.println("short          " + s);
    System.out.println("int            " + i);
    System.out.println("long           " + lng);
    System.out.println("float          " + f);
    System.out.println("double         " + d);
    System.out.println("reference      " + reference);
  }
  public static void main(String[] args) {
    InitialValues iv = new InitialValues();
    iv.printInitialValues();
    /* You could also say:
    new InitialValues().printInitialValues();
    */
  }
} /* Output:
Data type      Initial value
boolean        false
char           [ ]
byte           0
short          0
int            0
long           0
float          0.0
double         0.0
reference      null
*///:~
