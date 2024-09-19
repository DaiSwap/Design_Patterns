package Mini_Project_Simulator.RocketStates;

import Mini_Project_Simulator.*;

public class OrbitAchievedState implements LaunchState {
    @Override
    public void handle(Rocket rocket) {
        System.out.println("Orbit achieved! Mission Successful.");
    }
}
