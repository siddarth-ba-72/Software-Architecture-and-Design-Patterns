package SolidDesignPrinciples.InterfacesSegregationPrinciple.Task;

public interface CeoLevel extends Bonus, Employee {
    void makeDecisions();

    void addStocks();
}
