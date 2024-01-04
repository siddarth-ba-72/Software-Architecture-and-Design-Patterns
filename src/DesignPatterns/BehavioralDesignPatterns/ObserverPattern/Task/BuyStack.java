package DesignPatterns.BehavioralDesignPatterns.ObserverPattern.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BuyStack implements Subject {

    private float price = 100;
    private Random random;
    private List<Observer> observers;

    public BuyStack() {
        observers = new ArrayList<>();
        random = new Random();
    }

    public void start() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            price = price + 2 * random.nextFloat() - 1;
            notifyObservers();
            System.out.println(price);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(price);
    }
}
