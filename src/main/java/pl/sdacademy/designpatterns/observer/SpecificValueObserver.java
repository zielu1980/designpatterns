package pl.sdacademy.designpatterns.observer;

public class SpecificValueObserver extends Observer{

    public SpecificValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void udpade() {
        System.out.println(" Specific value observer " + subject.getState());
    }
}
