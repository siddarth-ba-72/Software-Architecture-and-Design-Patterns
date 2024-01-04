package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Planet;

public interface Planet {
    void accept(Explorer explorer);
}
