package tasks.kata8;

import java.util.stream.IntStream;

//Find the mean (average) of a list of numbers in an array.
public class GrasshopperArrayMean {
    public static int findAverage(int[] nums) {
        return (int) IntStream.of(nums).average().orElse(0);
    }
}
