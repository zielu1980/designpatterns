package pl.sdacademy.designpatterns.observer;

public class TenChangedObserver extends Observer {

    private int previousValue = 0;

    public TenChangedObserver(final Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        if (Math.abs(subject.getSubjectValue() - previousValue) >= 10) {
            System.out.println("Value has changed by 10!");
        }
        previousValue = subject.getSubjectValue();
    }
}
