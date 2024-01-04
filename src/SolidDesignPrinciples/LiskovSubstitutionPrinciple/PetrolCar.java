package SolidDesignPrinciples.LiskovSubstitutionPrinciple;

public class PetrolCar extends Vehicle {

    public PetrolCar(String type, int age) {
        super(type, age);
    }

    protected void speedUp() {
        System.out.println("Petrol car is speeding up...");
    }

    protected void slowDown() {
        System.out.println("Petrol car is slowing down...");
    }

    public void fuel() {
        System.out.println("Petrol car fuel method...");
    }
}
