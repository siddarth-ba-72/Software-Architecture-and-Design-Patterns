package SolidDesignPrinciples.SingleResponsibility.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputProcessor {

    public static final int THRESHOLD = 5;

    public static List<Integer> process() {
        System.out.println("Enter 5 valid integers in the range [0, 10]");

        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        while (nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            if (!ViolationChecker.isValid(s)) {
                System.out.println("Invalid! Try again!");
                continue;
            }

            int num = Integer.parseInt(s);

            if (!ViolationChecker.isValidRange(num)) {
                System.out.println("Invalid range! Try again!");
                continue;
            }

            nums.add(num);
        }
        scanner.close();
        return nums;
    }
}
