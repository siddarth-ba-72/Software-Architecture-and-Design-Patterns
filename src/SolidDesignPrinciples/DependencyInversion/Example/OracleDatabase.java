package SolidDesignPrinciples.DependencyInversion.Example;

//low level module
public class OracleDatabase implements DatabaseDriver {

    @Override
    public void connect() {
        System.out.println("Connecting to an Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting to an Oracle database...");
    }
}
