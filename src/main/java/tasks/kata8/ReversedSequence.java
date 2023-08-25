package tasks.kata8;

import java.util.stream.IntStream;

//Build a function that returns an array of integers from n to 1 where n>0.
public class ReversedSequence {
    public static int[] reverse(int n) {
        return IntStream.rangeClosed(1, n)
                .map(i -> n - i + 1)
                .toArray();
    }
}
