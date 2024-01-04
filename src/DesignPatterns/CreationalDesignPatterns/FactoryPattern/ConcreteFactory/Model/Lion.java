package DesignPatterns.CreationalDesignPatterns.FactoryPattern.ConcreteFactory.Model;

public class Lion implements Animal {
    @Override
    public void eat() {
        System.out.println("Lion ");
    }
}
