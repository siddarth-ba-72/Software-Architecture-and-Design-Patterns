package DesignPatterns.ServiceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<Service> serviceList;

    public Cache() {
        this.serviceList = new ArrayList<>();
    }

    public Service getService(String jndName) {
        for (Service service : serviceList) {
            if (service.getName().equals(jndName)) {
                return service;
            }
        }
        return null;
    }

    public void addService(Service service) {
        this.serviceList.add(service);
    }

}
