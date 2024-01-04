package DesignPatterns.CreationalDesignPatterns.PrototypePattern;

public class Square extends Shape {

    public Square(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        System.out.println("Square with width: " + width + " height: " + height);
    }

    @Override
    public Shape cloneObject() {
        //this
        return new Square(width, height);
    }
}
