package tasks.kata8;

import java.util.Arrays;

//Given an array of integers, return a new array with each value doubled.
public class LostWithoutMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(n -> 2 * n).toArray();
    }
}
