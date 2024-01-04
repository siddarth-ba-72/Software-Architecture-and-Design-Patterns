package DesignPatterns.CreationalDesignPatterns.FactoryPattern.AbstractFactory.Model;

public class ElectricToyota implements Car {

    @Override
    public void assembe() {
        System.out.println("Assembling an electric Toyota...");
    }

}
