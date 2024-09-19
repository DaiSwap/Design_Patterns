package Mini_Project_Simulator;

import Mini_Project_Simulator.Facade.LaunchFacade;
import Mini_Project_Simulator.Observer.MissionControl;
import Mini_Project_Simulator.Singleton.RocketSingleton;
import Mini_Project_Simulator.Strategy.DefaultFuelStrategy;

import java.util.Scanner;

public class RocketLaunchSimulator {
    public static void main(String[] args) {
        Rocket rocket = RocketSingleton.getInstance();
        MissionControl missionControl = new MissionControl();
        DefaultFuelStrategy defaultFuelStrategy = new DefaultFuelStrategy();
        
        LaunchFacade launchFacade = new LaunchFacade(rocket, missionControl, defaultFuelStrategy);
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Type 'start_checks' to begin pre-launch checks.");
        
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("start_checks")) {
                launchFacade.startPreLaunchChecks();
                break;
            } else {
                System.out.println("Invalid input. Please type 'start_checks'.");
            }
        }

        System.out.println("Type 'launch' to begin the mission.");
        
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("launch")) {
                launchFacade.launch();
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
                    launchFacade.fastForward(seconds);
                } catch (Exception e) {
                    System.out.println("Invalid command. Use 'fast_forward X' where X is the number of seconds.");
                }
            } else {
                rocket.update();
            }
        }
    }
}
