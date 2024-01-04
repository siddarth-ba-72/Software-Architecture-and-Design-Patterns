package DesignPatterns.BehavioralDesignPatterns.StrategyPattern.Example;

//abstract layer in between the high level and the low level modules
public class OperationManager {

    //we he to use composition
    //BECAUSE THE BEHAVIOR CAN BE CHANGED AT RUN-TIME
    private Operation operation;

    public void setStrategy(Operation operation) {
        this.operation = operation;
    }

    public void execute(int num1, int num2) {
        operation.execute(num1, num2);
    }
}
