package DesignPatterns.BehavioralDesignPatterns.ObserverPattern.Task;

public interface Subject {
    void addObserver(Observer observer);

    void notifyObservers();
}
