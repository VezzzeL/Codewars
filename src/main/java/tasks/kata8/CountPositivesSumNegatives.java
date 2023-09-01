package tasks.kata8;

import java.util.Arrays;
import java.util.stream.IntStream;

//Given an array of integers.
//Return an array, where the first element is the count of positives numbers and the second element is
// sum of negative numbers. 0 is neither positive nor negative.
//If the input is an empty array or is null, return an empty array.
public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        return new int[]{
                IntStream.of(input).filter(i -> i > 0).reduce((i1, i2) -> i1 + i2).getAsInt(),
                IntStream.of(input).filter(i -> i < 0).sum()
        };
    }
}
