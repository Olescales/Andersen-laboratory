package lab.andersen.katokoleg.patterns.observer;

import lab.andersen.katokoleg.patterns.observer.event.ExcursionDatesAddedEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    private static ObserverManager observerManager;

    static {
        Map<Class<?>, Set<Observer>> observers = new HashMap<>();
        observers.put(ExcursionDatesAddedEvent.class, Set.of(new UserAccount()));
        observerManager = new ObserverManager(observers);
    }

    public static void main(String[] args) {
        ExcursionDatesAddedEvent excursionDatesAddedEvent = new ExcursionDatesAddedEvent("Excursion 'In opera theater' on date 25.02.2020 were added");
        observerManager.notifyAll(ExcursionDatesAddedEvent.class, excursionDatesAddedEvent.getMessage());
    }
}
