package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Task;

public interface ShapeAreaVisitor {

    double visit(Circle circle);

    double visit(Rectangle rectangle);

    double visit(Triangle triangle);
}
