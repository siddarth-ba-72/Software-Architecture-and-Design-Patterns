package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class DatabaseConnectorEager {

    //EAGER VERSION
    private static DatabaseConnectorEager INSTANCE = new DatabaseConnectorEager();

    private DatabaseConnectorEager() {
    }

    public static DatabaseConnectorEager getInstance() {
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting to the database...");
    }

}
