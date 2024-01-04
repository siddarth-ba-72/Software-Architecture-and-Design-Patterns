package DesignPatterns.CreationalDesignPatterns.PrototypePattern;

public class Rectangle extends Shape {

    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with width: " + width + " height: " + height);
    }

    @Override
    public Shape cloneObject() {
        return new Rectangle(width, height);
    }
}
