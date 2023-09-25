package tasks.kata7;

import java.util.Arrays;

//In this Kata, you will be given an array of integers whose elements have both a negative and a positive value, except
// for one integer that is either only negative or only positive. Your task will be to find that integer.
public class ArrayElementParity {
    public static int solve(int[] arr) {
        return Arrays.stream(arr).distinct().sum();
    }
}
