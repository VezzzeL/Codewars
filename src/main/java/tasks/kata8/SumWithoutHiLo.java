package tasks.kata8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element
// ( by value, not by index! ).
//The highest or lowest element respectively is a single element at each edge, even if there are more than one with
// the same value.
//Mind the input validation.
public class SumWithoutHiLo {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) return 0;
        IntSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();
        return Arrays.stream(numbers).sum() - stats.getMax() - stats.getMin();
    }
}
