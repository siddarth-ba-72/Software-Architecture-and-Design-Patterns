package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Planet;

public class Mars implements Planet {

    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
