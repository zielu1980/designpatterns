package pl.sdacademy.designpatterns.singleton;

// EAGER
public class Counter {

  private static final Counter INSTANCE = new Counter();

  private int value = 0;

  public static Counter getInstance() {
    return INSTANCE;
  }

  private Counter() {
  }

  public void addOne() {
    value++;
    System.out.println("Value is now " + value);
  }

  public void addTwo() {
    value += 2;
    System.out.println("Value incresed by two and is now " + value);
  }

  public void addThree() {
    value += 3;
    System.out.println("Value is " + value);
  }
}
