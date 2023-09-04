package tasks.kata8;

import java.util.stream.IntStream;

//Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
// First argument is an array of numbers and the second is the divisor.
public class DivisibleByNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return IntStream.of(numbers).filter(n -> n % divider == 0).toArray();
    }
}
