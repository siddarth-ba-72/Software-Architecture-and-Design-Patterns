package SolidDesignPrinciples.InterfacesSegregationPrinciple.Task;

public class Manager implements ManagerLevel {
    @Override
    public void addBonus() {
        System.out.println("Manager adding bonus...");
    }

    @Override
    public void hire() {
        System.out.println("Manager hiring...");
    }

    @Override
    public void train() {
        System.out.println("Manager training...");
    }

    @Override
    public void salary() {
        System.out.println("Manager earn money...");
    }
}
