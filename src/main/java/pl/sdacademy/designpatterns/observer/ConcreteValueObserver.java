package pl.sdacademy.designpatterns.observer;

public class ConcreteValueObserver extends Observer {

    public ConcreteValueObserver(final Subject subject) {
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("New value appeared: " + subject.getSubjectValue());
    }
}
