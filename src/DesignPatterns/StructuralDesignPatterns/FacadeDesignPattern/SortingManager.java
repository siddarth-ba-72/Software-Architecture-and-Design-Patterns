package DesignPatterns.StructuralDesignPatterns.FacadeDesignPattern;

public class SortingManager {
    private Algorithm bubbleSort;
    private Algorithm quickSort;

    public SortingManager() {
        this.bubbleSort = new BubbleSort();
        this.quickSort = new QuickSort();
    }

    public void doBubbleSort() {
        this.bubbleSort.sort();
    }

    public void doQuickSort() {
        this.quickSort.sort();
    }
}
