package Mini_Project_Simulator.RocketStates;

import Mini_Project_Simulator.*;

public class SecondStageState implements LaunchState {
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
