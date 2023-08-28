package tasks.kata8;

import java.util.stream.LongStream;

//Complete the function that takes a non-negative integer n as input, and returns a list of all the powers
// of 2 with the exponent ranging from 0 to n ( inclusive ).
public class PowersOf2 {
    public static long[] powersOfTwo(int n) {
        return LongStream.rangeClosed(0, n).map(s -> 1L << s).toArray();
    }
}
