package Mini_Project_Simulator.RocketStates;

import Mini_Project_Simulator.*;

public class MissionFailureState implements LaunchState {
    @Override
    public void handle(Rocket rocket) {
        System.out.println("Mission Failed due to insufficient fuel.");
    }
}
