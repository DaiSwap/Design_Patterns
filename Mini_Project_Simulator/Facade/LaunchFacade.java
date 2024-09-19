package Mini_Project_Simulator.Facade;

import Mini_Project_Simulator.Rocket;
import Mini_Project_Simulator.Observer.MissionControl;
import Mini_Project_Simulator.Strategy.FuelStrategy;

public class LaunchFacade {
    private Rocket rocket;
    private MissionControl missionControl;
    private FuelStrategy fuelStrategy;

    public LaunchFacade(Rocket rocket, MissionControl missionControl, FuelStrategy fuelStrategy) {
        this.rocket = rocket;
        this.missionControl = missionControl;
        this.fuelStrategy = fuelStrategy;
    }

    public void startPreLaunchChecks() {
        System.out.println("Initiating pre-launch checks...");
        fuelStrategy.refuel(rocket);
        rocket.addObserver(missionControl);
        rocket.update();
    }

    public void launch() {
        System.out.println("Starting launch sequence...");
        rocket.update();
    }

    public void fastForward(int seconds) {
        System.out.println("Fast forwarding " + seconds + " seconds...");
        rocket.fastForward(seconds);
    }
}
