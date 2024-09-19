package BehavioralDesignPattern.BehavioralObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class TechEventSystem implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String eventDetails;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getName() + " has subscribed.");
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getName() + " has unsubscribed.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(eventDetails);
        }
    }

    public void createEvent(String eventDetails) {
        this.eventDetails = eventDetails;
        System.out.println("New tech event: " + eventDetails);
        notifyObservers();
    }
}
