package DesignPatterns.BehavioralDesignPatterns.ObserverPattern.Task;

public class App {
    public static void main(String[] args) {
        BuyStack buyStack = new BuyStack();
        buyStack.addObserver(new SellStockObserver());
        buyStack.addObserver(new BuyStockObserver());

        buyStack.start();
    }
}
