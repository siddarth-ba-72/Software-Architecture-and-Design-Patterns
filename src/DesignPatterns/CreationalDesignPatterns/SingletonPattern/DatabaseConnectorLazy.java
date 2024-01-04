package DesignPatterns.CreationalDesignPatterns.SingletonPattern;

public class DatabaseConnectorLazy {
    //Lazy version
    private static DatabaseConnectorLazy INSTANCE;

    //"reflection attack"
    private DatabaseConnectorLazy() {
    }

    public static DatabaseConnectorLazy getInstance() {
        //we just instantiate the class if necessary
        // IF WE HAVE MULTIPLE THREADS???
        if (INSTANCE == null)
            //this block can be entered by a single thread
            //PROBLEM: it is too slow (100x)
            synchronized (DatabaseConnectorLazy.class) {
                INSTANCE = new DatabaseConnectorLazy();
            }
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting to the database...");
    }

}
