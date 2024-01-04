package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Planet;

public class Mercury implements Planet {

    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
