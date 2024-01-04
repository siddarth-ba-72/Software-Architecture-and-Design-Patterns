package DesignPatterns.BehavioralDesignPatterns.StrategyPattern.Task;


import DesignPatterns.BehavioralDesignPatterns.StrategyPattern.Task.Solution.ImageManager;
import DesignPatterns.BehavioralDesignPatterns.StrategyPattern.Task.Solution.TVRenderer;

public class App {

    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager();
        imageManager.setDevice(new TVRenderer());
        imageManager.execute();
    }
}
