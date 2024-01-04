package SolidDesignPrinciples.InterfacesSegregationPrinciple.Task;

public class Worker implements Employee {
    @Override
    public void salary() {
        System.out.println("Worker earn money...");
    }
}
