package DesignPatterns.BehavioralDesignPatterns.StrategyPattern.Example;

public class App {
    public static void main(String[] args) {
        OperationManager operationManager = new OperationManager();
        operationManager.setStrategy(new Division());
        operationManager.execute(110, 11);
    }
}

//Strategy pattern