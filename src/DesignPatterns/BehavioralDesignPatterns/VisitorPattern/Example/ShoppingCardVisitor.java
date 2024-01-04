package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Example;

public interface ShoppingCardVisitor {

    double visit(Table table);

    double visit(Chair chair);
}
