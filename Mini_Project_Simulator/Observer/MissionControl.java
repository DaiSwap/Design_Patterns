package Mini_Project_Simulator.Observer;

import Mini_Project_Simulator.Rocket;

public class MissionControl implements Observer {
    @Override
    public void update(Rocket rocket) {
        System.out.println("Mission Control: Rocket state updated. Current Altitude: " + rocket.getAltitude() + " km, Speed: " + rocket.getSpeed() + " km/h, Fuel: " + rocket.getFuel() + "%.");
    }
}
