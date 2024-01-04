package SolidDesignPrinciples.DependencyInversion.Example;

//high level module
public class DatabaseController {

    //we program to an interface - so we can achieve loosely coupled architecture
    private DatabaseDriver databaseDriver;

    public DatabaseController(DatabaseDriver databaseDriver) {
        this.databaseDriver = databaseDriver;
    }

    public void connect() {
        databaseDriver.disconnect();
    }

    public void disconnect() {
        databaseDriver.connect();
    }
}
