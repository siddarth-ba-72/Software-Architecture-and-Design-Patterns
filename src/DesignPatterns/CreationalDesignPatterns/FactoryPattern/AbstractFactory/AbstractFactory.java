package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model.Car;

public interface AbstractFactory {
    Car getCar(String type);
}
