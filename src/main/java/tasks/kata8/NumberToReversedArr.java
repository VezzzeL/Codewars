package tasks.kata8;

import java.util.stream.LongStream;

//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
public class NumberToReversedArr {
    public static int[] digitize(long n) {
        return new StringBuilder(Long.toString(n))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
