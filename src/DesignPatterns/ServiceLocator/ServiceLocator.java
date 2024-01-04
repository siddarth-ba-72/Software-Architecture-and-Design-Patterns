package DesignPatterns.ServiceLocator;

public class ServiceLocator {

    private static Cache cache = new Cache();

    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);

        if (service != null)
            return service;

        InitialContext initialContext = new InitialContext();
        Service s = initialContext.lookup(jndiName);
        cache.addService(s);

        return s;
    }
}
