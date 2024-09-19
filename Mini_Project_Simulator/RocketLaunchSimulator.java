package Simulator;
import java.util.Scanner;

// State Interface
interface LaunchState {
    void handle(Rocket rocket);
}

// Concrete States
class PreLaunchState implements LaunchState {
    @Override
    public void handle(Rocket rocket) {
        System.out.println("Pre-Launch Checks: All systems are 'Go' for launch.");
        rocket.setState(new FirstStageState());
    }
}

class FirstStageState implements LaunchState {
    @Override
    public void handle(Rocket rocket) {
        if (rocket.getFuel() >= 10) {
            rocket.consumeFuel(10);
            rocket.increaseAltitude(10);
            rocket.increaseSpeed(1000);
            System.out.println("Stage: 1, Fuel: " + rocket.getFuel() + "%, Altitude: " + rocket.getAltitude() + " km, Speed: " + rocket.getSpeed() + " km/h");
        } else {
            rocket.setState(new MissionFailureState());
        }
        if (rocket.getAltitude() >= 100) {
            rocket.setState(new SecondStageState());
        }
    }
}

class SecondStageState implements LaunchState {
    @Override
    public void handle(Rocket rocket) {
        System.out.println("Stage 1 complete. Separating stage. Entering Stage 2.");
        if (rocket.getFuel() >= 5) {
            rocket.consumeFuel(5);
            rocket.increaseAltitude(10);
            rocket.increaseSpeed(500);
            System.out.println("Stage: 2, Fuel: " + rocket.getFuel() + "%, Altitude: " + rocket.getAltitude() + " km, Speed: " + rocket.getSpeed() + " km/h");
        } else {
            rocket.setState(new MissionFailureState());
        }
        if (rocket.getAltitude() >= 200) {
            rocket.setState(new OrbitAchievedState());
        }
    }
}

class OrbitAchievedState implements LaunchState {
    @Override
    public void handle(Rocket rocket) {
        System.out.println("Orbit achieved! Mission Successful.");
    }
}

class MissionFailureState implements LaunchState {
    @Override
    public void handle(Rocket rocket) {
        System.out.println("Mission Failed due to insufficient fuel.");
    }
}

// Context
class Rocket {
    private LaunchState state;
    private int fuel = 100;
    private int altitude = 0;
    private int speed = 0;

    public Rocket() {
        this.state = new PreLaunchState();
    }

    public void setState(LaunchState state) {
        this.state = state;
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
}

// Main Class
public class RocketLaunchSimulator {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Type 'start_checks' to begin pre-launch checks.");
        
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("start_checks")) {
                rocket.update();
                break;
            } else {
                System.out.println("Invalid input. Please type 'start_checks'.");
            }
        }

        System.out.println("Type 'launch' to begin the mission.");
        
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("launch")) {
                break;
            } else {
                System.out.println("Invalid input. Please type 'launch'.");
            }
        }

        while (true) {
            input = scanner.nextLine().trim();
            if (input.startsWith("fast_forward")) {
                try {
                    int seconds = Integer.parseInt(input.split(" ")[1]);
                    rocket.fastForward(seconds);
                } catch (Exception e) {
                    System.out.println("Invalid command. Use 'fast_forward X' where X is the number of seconds.");
                }
            } else {
                rocket.update();
            }
        }
    }
}
