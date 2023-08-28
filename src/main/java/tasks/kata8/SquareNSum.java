package tasks.kata8;

import java.util.stream.IntStream;

//Complete the square sum function so that it squares each number passed into it and then sums the results together.
public class SquareNSum {
    public static int squareSum(int[] n){
        return IntStream.of(n).map(d -> d * d).sum();
    }
}
