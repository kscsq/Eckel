//: polymorphism/music3/Music3.java
// An extensible program.
package polymorphism.music3;
import polymorphism.music.Note;

import java.util.Random;

import static net.mindview.util.Print.*;

class Instrument {
  @Override
  public String toString() {
    return "Instrument{}";
  }

  void play(Note n) { print("Instrument.play() " + n); }
  String what() { return "Instrument"; }
  void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
  void play(Note n) { print("Wind.play() " + n); }
  String what() { return "Wind"; }
  void adjust() { print("Adjusting Wind"); }
}	

class Percussion extends Instrument {
  void play(Note n) { print("Percussion.play() " + n); }
  String what() { return "Percussion"; }
  void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
  void play(Note n) { print("Stringed.play() " + n); }
  String what() { return "Stringed"; }
  void adjust() { print("Adjusting Stringed"); }
}
class Ykulele extends Stringed {
  void play(Note n) { print("Ykulele.play() " + n); }
  String what() { return "Ykulele"; }
  void adjust() { print("Adjusting Ykulele"); }
}

class Brass extends Wind {
  void play(Note n) { print("Brass.play() " + n); }
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  void play(Note n) { print("Woodwind.play() " + n); }
  String what() { return "Woodwind"; }
}	

public class Music3 {
  // Doesn't care about type, so new types
  // added to the system still work right:
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune(i);
  }
  static class InstrumentGenerator {
    Random rand = new Random(57);
public Instrument next(){
  switch (rand.nextInt(6)){
    default:
    case 0: return new Brass();
    case 1: return new Percussion();
    case 2: return new Stringed();
    case 3: return new Wind();
    case 4: return new Woodwind();
    case 5: return new Ykulele();
  }
}
  }
  public static void main(String[] args) {

    Instrument[] ins = new Instrument[10];
    InstrumentGenerator ig = new InstrumentGenerator();
for (int i = 0; i < ins.length; i++)
  ins[i] = ig.next();
    // Upcasting during addition to the array:
//    Instrument[] orchestra = {
//      new Wind(),
//      new Percussion(),
//      new Stringed(),
//      new Brass(),
//      new Woodwind(),
//            new Ykulele()
//    };
//    tuneAll(orchestra);
//    System.out.println(new Wind().what());
  for (Instrument i: ins)
    System.out.println(i.what());
  }
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
