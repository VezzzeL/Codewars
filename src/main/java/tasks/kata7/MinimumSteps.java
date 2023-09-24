package tasks.kata7;

import java.util.Arrays;

//Given an array of N integers, you have to find how many times you have to add up the smallest numbers in the array
// until their Sum becomes greater or equal to K.
public class MinimumSteps {
    public static int minimumSteps(int[] numbers, int k) {
        int count = 0;
        Arrays.sort(numbers);
        for (int num : numbers) {
            k -= num;
            if (k <= 0) return count;
            count++;
        }
        return count;
    }
}
