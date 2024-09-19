package Excersize1.StructuralDesignPattern.StructuralDecoratorDesignPattern;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 5.0; // Base cost of simple coffee
    }
}
