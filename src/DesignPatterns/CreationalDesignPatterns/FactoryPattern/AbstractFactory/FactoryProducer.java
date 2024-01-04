package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if ("ELECTRIC".equals(factory))
            return new ElectricCarFactory();
         else if ("PETROL".equals(factory))
            return new PetrolCarFactory();
        throw new RuntimeException("unsupported factory ...");
    }
}
