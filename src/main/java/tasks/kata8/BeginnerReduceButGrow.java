package tasks.kata8;

import java.util.stream.IntStream;

//Given a non-empty array of integers, return the result of multiplying the values together in order.
//Example:
//[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
public class BeginnerReduceButGrow {
    public static int grow(int[] x) {
        return IntStream.of(x).reduce((n1, n2) -> n1 * n2).getAsInt();
    }
}
