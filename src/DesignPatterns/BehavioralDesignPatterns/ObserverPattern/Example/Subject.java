package DesignPatterns.BehavioralDesignPatterns.ObserverPattern.Example;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObservers();
}
