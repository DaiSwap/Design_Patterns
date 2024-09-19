
package CreationalFactoryDesignPattern;

//Entry point
public class Main {
    public static void main(String[] args) {
        // Using TruckFactory to create a Truck
        TransportFactory truckFactory = new TruckFactory();
        Logistics logistics = new Logistics(truckFactory);
        logistics.planDelivery();
        
        // Using ShipFactory to create a Ship
        TransportFactory shipFactory = new ShipFactory();
        logistics = new Logistics(shipFactory);
        logistics.planDelivery();
    }
}
