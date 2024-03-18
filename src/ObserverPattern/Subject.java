package ObserverPattern;

//The Observer pattern defines a one-to-many dependency between objects so that when one object changes state,
// all its dependents are notified and updated automatically.
import java.util.*;
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

