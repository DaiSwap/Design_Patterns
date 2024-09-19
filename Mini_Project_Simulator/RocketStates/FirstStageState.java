package Mini_Project_Simulator.RocketStates;

import Mini_Project_Simulator.*;

public class FirstStageState implements LaunchState {
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
