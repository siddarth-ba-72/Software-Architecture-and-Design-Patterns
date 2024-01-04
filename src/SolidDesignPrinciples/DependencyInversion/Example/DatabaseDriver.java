package SolidDesignPrinciples.DependencyInversion.Example;

//this is the abstract layer
public interface DatabaseDriver {
    void connect();

    void disconnect();
}
