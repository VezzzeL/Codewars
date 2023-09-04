package tasks.kata8;

import java.util.stream.IntStream;

//Create a function with two arguments that will return an array of the first n multiples of x.
//Assume both the given number and the number of times to count will be positive numbers greater than 0.
public class CountByX {
    public static int[] countBy(int x, int n) {
        return IntStream.rangeClosed(x, x * n).filter(num -> num % x == 0).toArray();
    }
}
