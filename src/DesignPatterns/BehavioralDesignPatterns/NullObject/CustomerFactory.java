package DesignPatterns.BehavioralDesignPatterns.NullObject;

public class CustomerFactory {

    private Database database;

    public CustomerFactory() {
        this.database = new Database();
    }

    public AbstractCustomer getCustomer(String customer) {
        if (checkName(customer))
            return new RealCustomer(customer);
        return new NullCustomer();
    }

    private boolean checkName(String name) {
        return database.existCustomer(name);
    }
}
