package DesignPatterns.CreationalDesignPatterns.FactoryPattern.ConcreteFactory;

import DesignPatterns.CreationalDesignPatterns.FactoryPattern.ConcreteFactory.Model.*;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType animalType) {
        if (AnimalType.CAT.equals(animalType))
            return new Cat();
        else if (AnimalType.TIGER.equals(animalType))
            return new Tiger();
        else if (AnimalType.LION.equals(animalType))
            return new Lion();
        else if (AnimalType.DOG.equals(animalType))
            return new Dog();
        throw new RuntimeException("unsupported object type: " + animalType);
    }

}
