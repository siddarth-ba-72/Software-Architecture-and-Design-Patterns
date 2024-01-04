package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Example;

public interface ShoppingItem {
    double accept(ShoppingCardVisitor visitor);
}
