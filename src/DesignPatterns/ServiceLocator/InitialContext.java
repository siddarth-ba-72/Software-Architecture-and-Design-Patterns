package DesignPatterns.ServiceLocator;

public class InitialContext {
    public Service lookup(String jndiName) {
        return switch (jndiName) {
            case DatabaseService.NAME -> new DatabaseService();
            case MessagingService.NAME -> new MessagingService();
            default -> null;
        };
    }
}
