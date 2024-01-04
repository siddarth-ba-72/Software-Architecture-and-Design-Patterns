package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model;

public class ElectricFord implements Car {
    @Override
    public void assembe() {
        System.out.println("Assembling an electric Ford");
    }
}
