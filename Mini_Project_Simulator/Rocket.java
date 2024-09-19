package Mini_Project_Simulator;

import Mini_Project_Simulator.RocketStates.PreLaunchState;
import Mini_Project_Simulator.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private LaunchState state;
    private int fuel = 100;
    private int altitude = 0;
    private int speed = 0;
    private List<Observer> observers = new ArrayList<>();

    public Rocket() {
        this.state = new PreLaunchState();
    }

    public void setState(LaunchState state) {
        this.state = state;
        notifyObservers();
    }

    public int getFuel() {
        return fuel;
    }

    public void consumeFuel(int amount) {
        this.fuel -= amount;
    }

    public int getAltitude() {
        return altitude;
    }

    public void increaseAltitude(int amount) {
        this.altitude += amount;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int amount) {
        this.speed += amount;
    }

    public void update() {
        state.handle(this);
    }

    public void fastForward(int seconds) {
        for (int i = 0; i < seconds; i++) {
            update();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
