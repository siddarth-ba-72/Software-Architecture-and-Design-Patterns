package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Task;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double accept(ShapeAreaVisitor areaVisitor) {
        return areaVisitor.visit(this);
    }
}
