package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Task;

public interface Shape {
    double accept(ShapeAreaVisitor areaVisitor);
}
