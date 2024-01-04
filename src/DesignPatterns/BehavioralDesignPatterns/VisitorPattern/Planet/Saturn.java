package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Planet;

public class Saturn implements Planet {

    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
