package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {

    public static void main(final String[] args) {
        final Subject subject = new Subject();

        final Observer observerA = new ConcreteValueObserver(subject);
        final Observer observerB = new ValueLoweredObserver(subject);
        final Observer observerC = new TenChangedObserver(subject);

        subject.notifyAllObserver();
        subject.changeValue();
        subject.notifyAllObserver();
        subject.changeValue();
        subject.notifyAllObserver();
        subject.changeValue();
        subject.notifyAllObserver();
    }
}
