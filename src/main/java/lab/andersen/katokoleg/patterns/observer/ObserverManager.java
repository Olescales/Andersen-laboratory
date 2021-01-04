package lab.andersen.katokoleg.patterns.observer;

import java.util.Map;
import java.util.Set;

public class ObserverManager {

    private Map<Class<?>, Set<Observer>> observers;

    public ObserverManager(Map<Class<?>, Set<Observer>> observers) {
        this.observers = observers;
    }

    public void addObserver(Class<?> clazz, Observer observer) {
        Set<Observer> observerSet = this.observers.get(clazz);
        observerSet.add(observer);
    }

    public void removeObserver(Class<?> clazz, Observer observer) {
        Set<Observer> observerSet = this.observers.get(clazz);
        observerSet.remove(observer);
    }

    public void notifyAll(Class<?> clazz, String info) {
        Set<Observer> observers = this.observers.get(clazz);
        observers.forEach(o -> o.inform(info));
    }
}
