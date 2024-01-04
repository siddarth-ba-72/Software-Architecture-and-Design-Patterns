package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Task;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(10, 5));
        shapes.add(new Circle(10));
        shapes.add(new Triangle(10, 5));

        ShapeAreaVisitor shapeAreaVisitor = new ShapeArea();

        for (Shape shape : shapes)
            System.out.println(shape.accept(shapeAreaVisitor));
    }
}
