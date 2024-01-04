package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model.Car;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model.ElectricFord;
import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model.ElectricToyota;

public class ElectricCarFactory implements AbstractFactory {

    @Override
    public Car getCar(String type) {
        if ("FORD".equals(type))
            return new ElectricFord();
        else if ("TOYOTA".equals(type))
            return new ElectricToyota();
        throw new RuntimeException("Unsupported card model...");
    }
}
