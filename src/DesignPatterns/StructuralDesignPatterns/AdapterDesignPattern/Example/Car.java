package DesignPatterns.StructuralDesignPatterns.AdapterDesignPattern.Example;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
}
