package BehavioralDesignPattern.BehavioralObserverDesignPattern;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventDetails) {
        System.out.println(name + " received notification: " + eventDetails);
    }

    public String getName() {
        return name;
    }
}
