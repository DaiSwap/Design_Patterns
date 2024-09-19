package Mini_Project_Simulator.RocketStates;

import Mini_Project_Simulator.*;

public class PreLaunchState implements LaunchState {
    @Override
    public void handle(Rocket rocket) {
        System.out.println("Pre-Launch Checks: All systems are 'Go' for launch.");
        rocket.setState(new FirstStageState());
    }
}
