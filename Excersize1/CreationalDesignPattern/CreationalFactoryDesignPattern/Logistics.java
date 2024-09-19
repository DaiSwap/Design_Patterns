package Excersize1.CreationalDesignPattern.CreationalFactoryDesignPattern;

//Client code
public class Logistics {
    private TransportFactory transportFactory;

    public Logistics(TransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }

    public void planDelivery() {
        Transport transport = transportFactory.createTransport();
        transport.deliver();
    }
}
