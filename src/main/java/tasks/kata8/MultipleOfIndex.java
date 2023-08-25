package tasks.kata8;

import java.util.stream.IntStream;

//Return a new array consisting of elements which are multiple of their own index in input array (length > 1).
public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        return IntStream.range(0, array.length)
                .filter(i -> (i == 0 && array[i] == 0) || (i != 0 && array[i] % i == 0))
                .map(i -> array[i])
                .toArray();
    }
}
