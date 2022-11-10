package observer;

import java.util.ArrayList;
import java.util.List;

public class Child implements Subject{
    private List<Observer> observers;
    private int value;

    public Child() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
}
