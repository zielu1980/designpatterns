package pl.sdacademy.designpatterns.singleton;

public class Counter {

    private int value = 0;
    private static Counter counter = new Counter();

    private Counter() {
    }

    public static Counter getInstance() {
        return counter;
    }

    public void increment() {
        value += 1;
        System.out.println(value);
    }

    public void addTwo() {
        value += 2;
        System.out.println(value);
    }

    public void addThree() {
        value += 3;
        System.out.println(value);
    }
}
