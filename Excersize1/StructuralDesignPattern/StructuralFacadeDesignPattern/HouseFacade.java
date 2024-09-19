package StructuralDesignPattern.StructuralFacadeDesignPattern;

public class HouseFacade {
    private Light light;
    private Fan fan;
    private Appliances appliances;
    private Door door;

    public HouseFacade() {
        this.light = new Light();
        this.fan = new Fan();
        this.appliances = new Appliances();
        this.door = new Door();
    }

    public void leave() {
        System.out.println("Leaving the house...");
        light.turnOff();
        fan.turnOff();
        appliances.turnOff();
        door.close();
        door.lock();
        System.out.println("You have successfully left the house.");
    }
}
