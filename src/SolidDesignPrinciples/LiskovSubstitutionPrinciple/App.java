package SolidDesignPrinciples.LiskovSubstitutionPrinciple;

public class App {
    public static void main(String[] args) {
        Vehicle vehicle = new ElectricCar("Tesla", 12);
        vehicle.speedUp();
        vehicle.slowDown();
        vehicle.fuel();
    }
}
