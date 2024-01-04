package DesignPatterns.CreationalDesignPatterns.FactoryPattern.ConcreteFactory.Model;

public class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("Tiger is eating...");
    }
}
