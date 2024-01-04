package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model.Car;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model.PetrolFord;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model.PetrolToyota;

public class PetrolCarFactory implements AbstractFactory {
    @Override
    public Car getCar(String type) {
        if ("FORD".equals(type))
            return new PetrolFord();
        else if ("TOYOTA".equals(type))
            return new PetrolToyota();
        throw new RuntimeException("Unsupported car model...");
    }
}
