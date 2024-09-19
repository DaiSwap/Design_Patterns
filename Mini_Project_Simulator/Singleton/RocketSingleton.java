package Mini_Project_Simulator.Singleton;

import Mini_Project_Simulator.Rocket;

public class RocketSingleton {
    private static Rocket instance;

    private RocketSingleton() { }

    public static Rocket getInstance() {
        if (instance == null) {
            instance = new Rocket();
        }
        return instance;
    }
}
