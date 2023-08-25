package tasks.kata8;

import java.util.Arrays;

//given an array of integers your solution should find the smallest integer.
public class SmallestInt {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().orElse(0);
    }
}
