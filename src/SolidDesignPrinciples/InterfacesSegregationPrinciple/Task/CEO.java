package SolidDesignPrinciples.InterfacesSegregationPrinciple.Task;

public class CEO implements CeoLevel {

    @Override
    public void addBonus() {
        System.out.println("CEO adding bonus...");
    }

    @Override
    public void makeDecisions() {
        System.out.println("CEO make decision...");
    }

    @Override
    public void addStocks() {
        System.out.println("CEO adding stocks...");
    }

    @Override
    public void salary() {
        System.out.println("CEO earn money...");
    }
}
