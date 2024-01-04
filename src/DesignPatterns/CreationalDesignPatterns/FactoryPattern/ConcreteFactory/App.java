package DesignPatterns.CreationalDesignPatterns.FactoryPattern.ConcreteFactory;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.ConcreteFactory.Model.Animal;

public class App {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.CAT);
        animal.eat();
    }
}
