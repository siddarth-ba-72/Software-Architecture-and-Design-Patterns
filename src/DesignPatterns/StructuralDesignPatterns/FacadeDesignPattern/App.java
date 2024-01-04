package DesignPatterns.StructuralDesignPatterns.FacadeDesignPattern;

public class App {
    public static void main(String[] args) {
        SortingManager sortingManager = new SortingManager();
        sortingManager.doBubbleSort();
        sortingManager.doQuickSort();
    }
}
