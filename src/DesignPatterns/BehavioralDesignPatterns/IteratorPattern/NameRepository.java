package DesignPatterns.BehavioralDesignPatterns.IteratorPattern;

public class NameRepository {

    private String[] names = {"Adam", "John", "Sarah"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
