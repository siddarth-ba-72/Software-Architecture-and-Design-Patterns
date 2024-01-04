package DesignPatterns.BehavioralDesignPatterns.StrategyPattern.Example;

public class Multiplication implements Operation {
    @Override
    public void execute(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}
