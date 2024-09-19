package Excersize1.BehavioralDesignPattern.BehavioralObserverDesignPattern;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
