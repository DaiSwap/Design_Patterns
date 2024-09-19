package Mini_Project_Simulator.Strategy;

import Mini_Project_Simulator.Rocket;

public class DefaultFuelStrategy implements FuelStrategy {
    @Override
    public void refuel(Rocket rocket) {
        rocket.consumeFuel(-100);
        System.out.println("Rocket refueled to 100% using default strategy.");
    }
}
