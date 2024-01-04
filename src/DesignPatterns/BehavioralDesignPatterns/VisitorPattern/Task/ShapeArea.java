package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Task;

public class ShapeArea implements ShapeAreaVisitor {

    @Override
    public double visit(Circle circle) {
        return circle.getArea();
    }

    @Override
    public double visit(Rectangle rectangle) {
        return rectangle.getArea();
    }

    @Override
    public double visit(Triangle triangle) {
        return triangle.getArea();
    }

}
