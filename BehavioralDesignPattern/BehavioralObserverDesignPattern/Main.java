package BehavioralDesignPattern.BehavioralObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        
        TechEventSystem techEventSystem = new TechEventSystem();

        Observer student1 = new Student("pranav");
        Observer student2 = new Student("faisal");
        Observer student3 = new Student("Aditya");

        // Students subscribe to tech event updates
        
        techEventSystem.subscribe(student2);
        techEventSystem.subscribe(student3); 

        // A new event is created and all subscribers are notified
        techEventSystem.createEvent("TechTalk on AI and Blockchain");

        // One student unsubscribes
        techEventSystem.unsubscribe(student2); // faisal unsubscribes
        techEventSystem.subscribe(student1); // pranav subscribed now

        // Another event is created and the remaining subscribers are notified
        techEventSystem.createEvent("Hands on Workshop on Cloud Computing");
    }
}
