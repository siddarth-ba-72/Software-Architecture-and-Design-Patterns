package DesignPatterns.BehavioralDesignPatterns.VisitorPattern.Example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table("desk", 200));
        items.add(new Chair("chair", 100));
        items.add(new Table("chair-desk", 150));

        ShoppingCardVisitor shoppingCardVisitor = new ShoppingCard();
        double sum = 0;

        for (ShoppingItem item : items)
            sum = sum + item.accept(shoppingCardVisitor);

        System.out.println(sum);
    }
}
