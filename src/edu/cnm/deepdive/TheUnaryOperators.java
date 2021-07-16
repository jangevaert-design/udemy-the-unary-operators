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

    //increment and decrement have a higher order than +, -, *, /,...
    int myInt = 5;
    int myOtherInt = ++myInt;
    /*
    this is the same as:
    myInt = myInt + 1;
    myOtherInt = myInt;
     */
    System.out.println("myInt = " + myInt + " and myOtherInt = " + myOtherInt);

    int newInt = 5;
    int newOtherInt = newInt++;
        /*
    this is the same as:
    newOtherInt = newInt;
    newInt = newInt + 1;
     */
    System.out.println("newInt = " + newInt + " and newOtherInt = " + newOtherInt);

    int count = 0;
    System.out.println(count);// 0
    System.out.println(++count);// first increment then print hence 1
    System.out.println(count);// stays 1
    System.out.println(count--);// first print then decrement, hence prints 1 but count is set to 0
    System.out.println(count);// prints 0

    // exam questions
    int e = 3;
    int f = ++e * 5 / e-- + --e;
    System.out.println("e = " + e + " and f = " + f);// e = 2 and f = 7

    int g = 6;
    int h = 2;
    int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
    /*
    i = 3 + 5 * 3 + 2 * g++ - h-- % --g (h = 3, g = 5)
    i = 3 + 5 * 3 + 2 * 5 - 3 % --g (g = 6, h = 2)
    i = 3 + 5 * 3 + 2 * 5 - 3 % 5 (g = 5, h = 2) when you divide 3 by 5, the outcome is 0 and the remainder is 3.
    i = 3 + 15 + 10 - 3 (g = 5, h = 2)
    i = 25
     */
    System.out.println("g = " + g + ", h = " + h + " and i = " + i);
  }

}
