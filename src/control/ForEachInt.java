package control;
//: control/ForEachInt.java

public class ForEachInt {
  public static void main(String[] args) {
    for(int i : range(10)) // 0..9
      System.out.print(i + " ");
    System.out.println();
    for(int i : range(5, 10)) // 5..9
      System.out.print(i + " ");
    System.out.println();
    for(int i : range(5, 20, 3)) // 5..20 step 3
      System.out.print(i + " ");
    System.out.println();
  }
  public static int[] range(int n) {
    int[] result = new int[n];
    for(int i = 0; i < n; i++)
      result[i] = i;
    return result;
  }
  // Produce a sequence [start..end)
  public static int[] range(int start, int end) {
    int sz = end - start;
    int[] result = new int[sz];
    for(int i = 0; i < sz; i++)
      result[i] = start + i;
    return result;
  }
  // Produce a sequence [start..end) incrementing by step
  public static int[] range(int start, int end, int step) {
    int sz = (end - start)/step;
    int[] result = new int[sz];
    for(int i = 0; i < sz; i++)
      result[i] = start + (i * step);
    return result;
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
5 6 7 8 9
5 8 11 14 17
*///:~
