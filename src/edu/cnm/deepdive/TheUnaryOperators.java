package edu.cnm.deepdive;

public class TheUnaryOperators {

  public static void main(String[] args) {
    int x = +3;//+ sign is redundant
    double y = -x;
    System.out.println("x = " + x+ ", y = " + y);

    y = -y;// -1 * y
    System.out.println("x = " + x+ ", y = " + y);

    boolean a = true;
    boolean b = !a;
    System.out.println("a = " + a + ", b = " + b);

    b = !b;
    System.out.println("a = " + a + ", b = " + b);

    //int myInt = !5; will not compile. Exclamation point is only used with booleans.
    //boolean myBoolean = -true; Does not compile either.
    //boolean z = !0. zero and boolean are not related in Java so will not compile.
  }

}
