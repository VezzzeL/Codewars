package tasks.kata7;

import java.util.stream.IntStream;

//Create the function consecutive(arr) that takes an array of integers and return the minimum number of integers needed
// to make the contents of arr consecutive from the lowest number to the highest number.
public class HowManyConsecutiveNumbersNeeded {
    public static int consecutive(final int[] arr) {
        if (arr.length <= 1) return 0;
        int count = 0;
        int[] sArr = IntStream.of(arr).sorted().toArray();
        for (int i = 1; i < sArr.length; i++) {
            int diff = sArr[i] - sArr[i - 1];
            if (diff > 1) {
                count += diff - 1;
            }
        }
        return count;
    }
}
