package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model.Car;

public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("ELECTRIC");
        Car ford = abstractFactory.getCar("FORD");
        ford.assembe();
    }
}
