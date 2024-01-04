package SolidDesignPrinciples.LiskovSubstitutionPrinciple;

public class ElectricCar extends Vehicle {

    public ElectricCar(String type, int age) {
        super(type, age);
    }

    protected void speedUp() {
        System.out.println("Electric car is speeding up...");
    }

    protected void slowDown() {
        System.out.println("Electric car is slowing down...");
    }

    @Override
    public void fuel() {
        System.out.println("Electric car is being charged...");
    }
}
