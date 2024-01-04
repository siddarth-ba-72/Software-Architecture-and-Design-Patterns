package DesignPatterns.BehavioralDesignPatterns.TemplatePattern.Example;

public class SelectionSort extends Algorithm {
    public SelectionSort(int[] nums) {
        super(nums);
    }

    @Override
    protected void initialize() {
        System.out.println("initializing result");
    }

    @Override
    protected void sorting() {
        for (int i = 0; i < nums.length; i++) {

            int index = i;

            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] > nums[index])
                    index = j;


            if (index != i)
                swap(i, index);
        }
    }

    @Override
    protected void showResult() {
        for (int num : nums)
            System.out.println(num + " ");
    }
}
