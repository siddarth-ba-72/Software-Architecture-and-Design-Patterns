package SolidDesignPrinciples.SingleResponsibility.Task;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        //we get the inputs
        List<Integer> process = InputProcessor.process();

        //sort
        Operation.sort(process);

        //we have to show the result
        show(process);
        System.out.println("End of the application!");
    }

    private static void show(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }
}
