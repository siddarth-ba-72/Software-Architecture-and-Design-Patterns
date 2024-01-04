package DesignPatterns.ServiceLocator;

public class App {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("databaseService");
        service.execute();
    }
}
