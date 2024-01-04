package SolidDesignPrinciples.DependencyInversion.Example;

//low level module
public class MySQLDatabase implements DatabaseDriver {

    @Override
    public void connect() {
        System.out.println("Connecting to a MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting to a MySQL database...");
    }
}
