package pl.sdacademy.designpatterns.observer;

public class ValueLoweredObserver extends Observer {

    private int previousValue = Integer.MAX_VALUE;

    public ValueLoweredObserver(final Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        if (subject.getSubjectValue() < previousValue) {
            System.out.println("Value lowered!");
        }
        previousValue = subject.getSubjectValue();
    }
}
