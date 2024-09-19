package Excersize1.CreationalDesignPattern.CreationalFactoryDesignPattern;

// Concrete Factory for Truck
public class TruckFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
