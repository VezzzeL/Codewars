package tasks.kata8;

import java.util.Comparator;
import java.util.stream.IntStream;

//Your task is to sum the differences between consecutive pairs in the array in descending order.
public class SumDiffArr {
    public static int sumOfDifferences(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }
        int[] sortedArr = IntStream.of(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        int sum = IntStream.range(0, sortedArr.length - 1)
                .map(i -> sortedArr[i] - sortedArr[i + 1])
                .sum();
        return sum;
    }
}
