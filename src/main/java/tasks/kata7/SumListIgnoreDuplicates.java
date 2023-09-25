package tasks.kata7;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Please write a function that sums a list, but ignores any duplicate items in the list.
//For instance, for the list [3, 4, 3, 6] , the function should return 10.
public class SumListIgnoreDuplicates {
    public static int sumNoDuplicates(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .reduce((a, b) -> a + b).orElse(0);
    }
}
