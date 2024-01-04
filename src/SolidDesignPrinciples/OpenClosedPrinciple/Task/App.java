package SolidDesignPrinciples.OpenClosedPrinciple.Task;

public class App {
    public static void main(String[] args) {
        SortingProcessor.execute((SortingAlgorithm) new MergeSortingAlgorithm());
    }
}
