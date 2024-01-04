package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Example;

public class Table implements ShoppingItem {

    private String name;
    private double price;

    public Table(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double accept(ShoppingCardVisitor visitor) {
        return visitor.visit(this);
    }
}
