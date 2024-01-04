package SolidDesignPrinciples.InterfacesSegregationPrinciple.Task;

public class App {
    public static void main(String[] args) {
        CeoLevel ceoLevel = new CEO();
        ceoLevel.salary();
        ceoLevel.addBonus();
        ceoLevel.makeDecisions();
        ceoLevel.addStocks();

        ManagerLevel managerLevel = new Manager();
        managerLevel.salary();
        managerLevel.hire();
        managerLevel.train();
        managerLevel.addBonus();

        Employee employee = new Worker();
        employee.salary();
    }
}
