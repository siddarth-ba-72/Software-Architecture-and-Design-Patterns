package DesignPatterns.BehavioralDesignPatterns.TemplatePattern.Task;

public class Football extends Game {

    @Override
    protected void initializeGame() {
        System.out.println("Initializing football game...");
    }

    @Override
    protected void playing() {
        System.out.println("Playing football game...");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing the results for the football game...");
    }
}
