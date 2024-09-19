package BehavioralDesignPattern.BehavioralObserverDesignPattern;

public interface Observer {
    void update(String eventDetails);
    String getName();  // New method to get the name of the observer
}
