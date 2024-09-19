package CreationalFactoryDesignPattern;

//concrete Factory for Ship
public class ShipFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
