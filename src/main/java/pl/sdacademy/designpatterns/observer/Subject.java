package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int subjectValue;

    public List<Observer> getObservers() {
        return observers;
    }

    public int getSubjectValue() {
        return subjectValue;
    }

    public void add(final Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObserver() {
        observers.forEach(Observer::update);
    }

    public void changeValue() {
        subjectValue = new Random().nextInt();
    }
}
