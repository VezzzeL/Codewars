package tasks.kata7;

import java.util.Arrays;

//In this Kata, you will be given an array of unique elements, and your task is to rearrange the values so that the
// first max value is followed by the first minimum, followed by second max value then second min value, etc.
//solve([15,11,10,7,12]) = [15,7,12,10,11]
public class MaxMinArrays {
    public static int[] solve(int[] arr) {
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int[] result = new int[arr.length];

        int l = 0;
        int r = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = sortedArr[r--];
            } else {
                result[i] = sortedArr[l++];
            }
        }
        return result;
    }
}
