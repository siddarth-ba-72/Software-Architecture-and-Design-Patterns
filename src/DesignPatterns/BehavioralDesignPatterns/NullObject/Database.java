package DesignPatterns.BehavioralDesignPatterns.NullObject;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<String> customerNames;

    public Database() {
        customerNames = new ArrayList<>();
        this.customerNames.add("Ferid");
        this.customerNames.add("Ilham");
        this.customerNames.add("Yadigar");
        this.customerNames.add("Elvin");
        this.customerNames.add("Aysel");
    }

    public boolean existCustomer(String name) {
        return customerNames.contains(name);
    }
}
